public abstract class Student {
    int id;
    String firstName;
    String lastName;
    float grade;

    //constructeur par defaut
    public Student (){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.grade = 0;
    }

    //TODO 1 : constructeur paramétré
    public Student(int id, String firstName, String lastName, float grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    //TODO 2 : redefintion de la méthode equals()
    public boolean equals(Student student) {
        if (this == student){
            return true;
    }
        if (student == null || getClass() != student.getClass()){
        return false;
        }
        Student student1 = (Student) student;
        return id==student1.id &&
               firstName.equals(student1.firstName) &&
               lastName.equals(student1.lastName);
    }

    //TODO 3 : redefinition de la méthode toString ()
    public String toString() {
        return "Student [id = "+ id +", firstName="+firstName+", lastName="+lastName+", grade="+grade+"]";
    }

    //TODO 4: MarkAsAbsent()
    public abstract void markAsAbsent();
}
