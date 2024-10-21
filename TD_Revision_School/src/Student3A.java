public class Student3A extends Student {
    String speciality;


    //constructeur par defaut
    public Student3A () {
        super();
        speciality = "";
    }

    //TODO 6 : constructeur paramétré
    public Student3A(int id, String firstName, String lastName, float grade, String speciality) {
        super(id, firstName, lastName, grade);
        this.speciality = speciality;
    }

    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality;
    }

    // markAsAbsent()
    //TODO 7: absent = -0.5 grade
    public void markAsAbsent() {
        if (grade >=0.5)
            grade -=0.5;
        else
            grade=0;
        System.out.println(firstName + " " + lastName + " from Student3A (" + speciality + ") is marked as absent.");
    }
}