public class Animal {
    int age;
    String family;
    String name;
    Boolean isMammal;

    // Constructeur de la classe Animal
    public Animal() {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal [Name = " + name + ", family = " + family + ", Age = " + age + ", isMammal = "+(isMammal? "oui":"non")+"]";
    }

    //constructeur parametré
    public Animal(String family, String name, int age,boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    // Méthode pour afficher les informations de l'animal
    public void displayInfo() {
        System.out.println("Famille: " + family);
        System.out.println("Nom: " + name);
        System.out.println("Âge: " + age);
        System.out.println("Est un mammifère: " + (isMammal ? "Oui" : "Non"));
    }
}

