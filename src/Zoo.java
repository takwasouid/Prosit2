import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int CompteurAnimal=0;

    // Parameterized constructor
    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals];

    }

    public void displayZoo() {
        System.out.println("Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}");
    }

    public boolean addAnimal(Animal animal) {

            animals[CompteurAnimal] = animal;
            CompteurAnimal++;
            return true;

    }
    public int searchAnimal(String name) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(name)) {
                return i;  // Return the index where the animal is found
            }
        }
        return -1;  // Animal not found
    }

}