public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int currentIndex = 0;

    // Constructeur par défaut
    public Zoo() {
        this.animals = new Animal[25];  // Maximum de 25 animaux
    }

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialiser le tableau ici également
    }

    // Méthode pour afficher les attributs du zoo
    public void displayZoo() {
        System.out.println("Nom du Zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    // Redéfinir la méthode toString pour permettre System.out.println(myZoo);
    @Override
    public String toString() {
        return "Zoo [Nom = " + name + ", Ville = " + city + ", Nombre de cages = " + nbrCages + "]";
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
        displayZoo();  // Afficher les infos du zoo
        System.out.println("Liste des animaux:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(animals[i]);  // Appelle toString() pour chaque animal
            System.out.println("------------------");
        }
    }
}
