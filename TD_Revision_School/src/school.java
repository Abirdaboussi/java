public class school {
    String name;
    Student[] students;
    int studentCout;

    //constructeur par defaut
    public school() {
        this.name = "";
        this.studentCout = 0;
        this.students = new Student[500];
    }

    //TODO 12: constructeur paramétré
    public school(String name) {
        this.name = name;
        this.students = new Student[500];
        this.studentCout = 0;
    }

    //TODO 13: AddStudent ()
    //TODO 15: addStudent () after searchStudent()
    //TODO 21: Exception
    public void addStudent (Student s) throws StudentExistException{
        if (searchStudent(s) != -1){
            throw new StudentExistException ("Student : "+ s.firstName  + " " + s.lastName+ "already exists");
        }
        if (studentCout < 500) {
            students[studentCout] = s;
            studentCout++;
            System.out.println("Student added: " + s.firstName + " " + s.lastName);
        } else {
            System.out.println("could not add student!!!");
        }
    }

    //TODO 14: search student
    public int searchStudent(Student s) {
        for (int i = 0; i < studentCout; i++) {
            if (students[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    //TODO 16: avarageGrade
    public float getAvarageGrade (){
        float totalGrade =0.0f;
        int count3AStudents=0;

        //iterate through the students array
        // check if the student is an instance of Student3A
        for (int i = 0; i < studentCout; i++) {
            if (students[i] instanceof Student3A) {
                totalGrade+= students[i].grade;
                count3AStudents++;
            }
        }

        //avoid division by zero
        if (count3AStudents ==0) {
            System.out.println("No students found");
            return 0.0f;
        }

        //calculate the avarage grade
        return totalGrade/count3AStudents;
    }
    //redefinition de la methode toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // StringBuilder for efficient string concatenation
        sb.append("School Name: ").append(name).append("\n"); // Add school name

        // Iterate through the students array
        sb.append("Students:\n");
        for (int i = 0; i < studentCout; i++) {
            if (students[i] != null) { // Check if the student is not null
                sb.append(students[i].toString()).append("\n"); // Append each student's information
            }
        }

        return sb.toString(); // Return the accumulated string
    }

        //TODO 19: changeSchool ()
        public void changeSchool(Student st, school newSchool) throws StudentExistException {
            // Check if the student exists in the current school
            int index = searchStudent(st);
            if (index != -1) {
                // Remove the student from the current school
                for (int i = index; i < studentCout - 1; i++) {
                    students[i] = students[i + 1]; // Shift students left
                }
                students[studentCout - 1] = null; // Nullify the last position
                studentCout--; // Decrement the count of students

                // Now try to add the student to the new school
                newSchool.addStudent(st); // This may throw a StudentExistException
                System.out.println(st.firstName + " " + st.lastName + " has changed schools to " + newSchool.name);
            } else {
                System.out.println("Student not found in the current school.");
            }
        }

}