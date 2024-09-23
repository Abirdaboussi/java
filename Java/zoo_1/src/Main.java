public class Main {
    public static void main(String[] args) {
        // Créer un objet Animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Créer un objet Zoo (myZoo)
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 10);

        // Ajouter l'animal (lion) au zoo
        myZoo.addAnimal(lion);

        // Afficher les informations du zoo et de l'animal
        myZoo.displayZooInfo();
    }
}