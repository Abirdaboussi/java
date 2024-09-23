public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int currentIndex = 0;

    // Constructeur de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Maximum de 25 animaux
    }

    // Méthode pour ajouter un animal dans le zoo
    public void addAnimal(Animal animal) {
        if (currentIndex < animals.length) {
            animals[currentIndex] = animal;
            currentIndex++;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter un autre animal.");
        }
    }

    // Méthode pour afficher les informations du zoo et des animaux
    public void displayZooInfo() {
        System.out.println("Nom du Zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Liste des animaux:");
        for (int i = 0; i < currentIndex; i++) {
            animals[i].displayInfo();
            System.out.println("------------------");
        }
    }
}
