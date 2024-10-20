public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int nbrCages=25; //static : it's related to the class not the instance // final : it's not going to change
    int nbAnimals = 0;


    // Constructeur par défaut
    public Zoo() {
        this.animals = new Animal[25];  // Maximum de 25 animaux
    }

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
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

    // Méthode pour afficher les informations du zoo et des animaux
    public void displayZooInfo() {
        displayZoo();  // Afficher les infos du zoo
        System.out.println("Liste des animaux:");
        for (int i = 0; i < nbAnimals; i++) {
            System.out.println(animals[i]);  // Appelle toString() pour chaque animal
            System.out.println("------------------");
        }
    }

    //ToDo 10: boolean addAnimal(Animal animal)
    //ToDo 12: add animal (unique)
    //ToDo 12: do not pass nbCages
    public boolean addAnimal( Animal animal) {
        if (searchAnimals(animal)!=-1)
            return false;
        if (nbAnimals == nbrCages)
            return false;
        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }

    //ToDo 11: void displayAnimals ()
    public void displayAnimals(){
        for (int i =0; i<nbAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    //ToDo 11: int searchAnimal (Animal animal)
    public int searchAnimal(Animal animal){
        for (int i=0;i<nbAnimals;i++) {
            if (animals[i].name.equals (animal.name))
                return i;
        }
        return -1;
    }


    //search with while
    public int searchAnimals (Animal animal){
        int index=0;
        while (index<nbAnimals && !animals[index].name.equals (animal.name))
        {
            index++;
        }
        if (index==nbAnimals)
            return -1;
        return index;
    }

    //ToDo 13: boolean removeAnimal (Animal animal)
    public boolean removeAnimal(Animal animal){
        int index=searchAnimals(animal);
        if (index==-1)
            return false;
        else{
            for (int i=index;i<nbAnimals;i++) {
                animals[i]=animals[i+1];
            }
            nbAnimals=nbAnimals-1;
            animals[nbAnimals]=null;
        }
        return true;
    }

    //ToDo 15: boolean isZooFull ()
    public boolean isZooFull (){
        return nbAnimals == nbrCages;
    }

    //ToDo 16: compare two ZOOs
    public Zoo compareZoo(Zoo z1, Zoo z2){
        if (z1.name.equals(z2.name)&& (z1.city.equals(z2.city))){
            if (z1.nbAnimals < z2.nbAnimals)
                return z2;
        }
        return z1;
    }
}
