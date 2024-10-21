public class StudentExistException extends Exception{
    //constructeur par defaut
    public StudentExistException(){
        super("student exists.");
    }

    //constructeur paramété
    public StudentExistException(String message){
        super(message);
    }
}
