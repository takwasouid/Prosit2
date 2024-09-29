import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount=0;

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

            animals[animalCount] = animal;
            animalCount++;
            return true;

    }
    public int searchAnimal(String name) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        if (index != -1) {
            animals[index] = null;
            animalCount--;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


}