package gestionzoo.entities;
import gestionzoo.entities.Animal;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages = 25;
    private Animal[] animals;
    private int animalCount = 20;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages]; // Using the constant nbrCages
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
        this.name = name;
    }

    public void displayZoo() {
        System.out.println("Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}");
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Cannot add animal. The zoo is full.");
            return false;
        }

        if (searchAnimal(animal.getName()) != -1) {
            System.out.println("Animal already exists in the zoo.");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++;
                return true;
            }
        }
        return false;
    }


    public int searchAnimal(String name) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo city cannot be empty");
        }
        this.city = city;
    }


    public int getNbrCages() {
        return nbrCages;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
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

    public int getAnimalCount() {
        return animalCount;
    }
}
