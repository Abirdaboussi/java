//ToDo 19: les packages:
package tn.esprit.gestionzoo.entities;

public class Animal {
    private int age;
    private String family;
    protected String name;
    private Boolean isMammal;
    //ToDo 18: restreindre l’accès aux attributs

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
        setAge(age);
        this.isMammal = isMammal;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
            this.age = 0;  // Default to 0 if invalid age is provided
        }
    }

    // Getter and setter for family
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for isMammal
    public Boolean getIsMammal() {
        return isMammal;
    }

    public void setIsMammal(Boolean isMammal) {
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

