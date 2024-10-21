public class Main {
    public static void main(String[] args) {
        //create schools
        school esprit = new school("esprit school");
        school isg = new school("isg school");

        //create students
        Student abir = new Student3A(1,"abir","daboussi",15.0f,"Data Science");
        Student yassmine = new Student3A(2,"yassmine","daboussi",18.0f,"Marketing");
        Student may = new StudentWS(3,"May Farah","daboussi",10.0f,1000.0f);

        //Add student
        try{
            esprit.addStudent(abir);
            esprit.addStudent(yassmine);
            isg.addStudent(may);
        } catch (StudentExistException e){
            System.out.println(e.getMessage());
        }

        //print details of esprit
        System.out.println(esprit);

        //test changing school for a student
        try {
            esprit.changeSchool(yassmine,isg);
            isg.changeSchool(may,esprit);
        }catch (StudentExistException e){
            System.out.println(e.getMessage());
        }
        // print details of esprit and isg after changes
        System.out.println("\n after changing schools :");
        System.out.println(esprit);
        System.out.println(isg);

        //calculating avarage grades
        float avarageGrade3A = esprit.getAvarageGrade();
        System.out.println("Average grade of 3A students in " + isg.name + ": " + avarageGrade3A);

        //test making absent
        abir.markAsAbsent();
        //may.ajouterUneAbsence();

        //print updated details of students
        System.out.println("\n after adding uneAbsence :");
        System.out.println(abir);
        System.out.println(may);
    }
}
