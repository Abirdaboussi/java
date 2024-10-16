public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages =25;
    int currentIndex = 0;

    // Constructeur par défaut
    public Zoo() {
        this.animals = new Animal[nbrCages];  // Maximum de 25 animaux
    }

    // Constructeur paramétré
    public Zoo(String name, String city /*int nbrCages*/) {
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];  // Initialiser le tableau ici également
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

    /*// Méthode pour ajouter un animal dans le zoo
    public void addAnimal(Animal animal) {
        if (currentIndex < animals.length) {
            animals[currentIndex] = animal;
            currentIndex++;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter un autre animal.");
        }
    }*/

    // Méthode pour afficher les informations du zoo et des animaux
    public void displayZooInfo() {
        displayZoo();  // Afficher les infos du zoo
        System.out.println("Liste des animaux:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(animals[i]);  // Appelle toString() pour chaque animal
            System.out.println("------------------");
        }
    }

    // Méthode pour ajouter un animal
    public boolean addAnimal(Animal animal) {
        // Vérifier si le zoo est plein avant d'ajouter l'animal
        if (isZooFull()) {
            System.out.println("Impossible d'ajouter l'animal. Le zoo est plein.");
            return false; // L'ajout a échoué
        }

        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false; // L'ajout a échoué
        }

        // Ajouter l'animal à la prochaine position disponible
        animals[currentIndex] = animal;
        currentIndex++; // Incrémenter l'index pour le prochain ajout
        System.out.println(animal.name + " a été ajouté au zoo.");
        return true; // L'ajout a réussi
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < currentIndex; i++) {
            if (animals[i].name == animal.name) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        // Rechercher l'animal dans le zoo
        int index = searchAnimal(animal);

        // Si l'animal n'existe pas, renvoyer false
        if (index == -1) {
            System.out.println("Cet animal n'existe pas dans le zoo.");
            return false;
        }

        // Décaler tous les éléments après l'animal supprimé vers la gauche
        for (int i = index; i < currentIndex - 1; i++) {
            animals[i] = animals[i + 1];
        }

        // Supprimer la dernière référence (elle est désormais dupliquée)
        animals[currentIndex - 1] = null;

        // Décrémenter le nombre d'animaux
        currentIndex--;

        System.out.println(animal.name + " a été supprimé du zoo.");
        return true;
    }

    // Méthode qui vérifie si le zoo est plein
    public boolean isZooFull() {
        if (currentIndex >= nbrCages) {
            return true;  // Le zoo est plein
        } else {
            return false;  // Le zoo n'est pas plein
        }
    }


    // Méthode qui compare deux zoos et retourne celui avec le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.currentIndex > z2.currentIndex) {
            return z1;  // z1 a plus d'animaux
        } else if (z2.currentIndex > z1.currentIndex) {
            return z2;  // z2 a plus d'animaux
        } else {
            return null;  // Si les deux zoos ont le même nombre d'animaux
        }
    }
// display
    public void afficher () {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(animals[i]);

        }
    }
}
