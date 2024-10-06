package gestionzoo.main;

import gestionzoo.entities.Zoo;
import gestionzoo.entities.Animal;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 12, true);
        Zoo myZoo = new Zoo("MyZoo", "BigCity"); // Use the two-parameter constructor

        // Use the addAnimal method to add the animal to the zoo
        boolean added = myZoo.addAnimal(lion);
        if (added) {
            System.out.println("Lion added to the zoo.");
        } else {
            System.out.println("Failed to add lion to the zoo.");
        }

        myZoo.displayZoo(); // Display the zoo information
        int index = myZoo.searchAnimal("Lion");
        System.out.println("Lion found at index: " + index);

        Animal newLion = new Animal("Lion", "Felidae", 12, true);
        System.out.println("New Lion found at index: " + myZoo.searchAnimal(newLion.getName()));
    }
}
