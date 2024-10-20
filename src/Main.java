public class Main {
    public static void main(String[] args) {
        // Créer des objets Animal en utilisant le constructeur paramétré
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tigre", 4, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal parrot = new Animal("Psittacidae", "Perroquet", 2, false);

        // Créer un objet Zoo (myZoo)
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 10);

        // Ajouter des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(parrot);

        // Afficher les informations du zoo et des animaux
        myZoo.displayZooInfo();

        // Afficher les informations du zoo
        System.out.println(myZoo);  // Appelle automatiquement toString()
        System.out.println(myZoo.toString());  // Appelle explicitement toString()
    }
}
