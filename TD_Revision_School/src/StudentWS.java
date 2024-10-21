public class StudentWS extends Student {
    float salary;

    //constructeur par defaut
    public StudentWS() {
        super();
        this.salary = 0.0f;
    }

    //TODO 9 : constructeur paramétré
    public StudentWS(int id, String firstName, String lastName, float grade, float salary) {
        super(id,firstName, lastName, grade);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", \nsalary =" +salary;

    }

    public void markAsAbsent() {
        System.out.println(firstName+" " + lastName+" " + "from StudentWS (Salary:"+ salary);
    }

    //TODO 10 : AjouterUneAbsence ()
    public void AjouterUneAbsence() {
        if (salary >=50)
            salary = salary - 50;
        else
            salary=0;
        System.out.println("50Dt deducted from" +firstName+" "+ lastName+ "'s salary. New Salary : "+salary+"Dt");
    }
}
