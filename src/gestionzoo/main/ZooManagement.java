package gestionzoo.main;

import gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 12, true);
        Zoo myZoo = new Zoo("MyZoo", "BigCity"); // Use the two-parameter constructor

        boolean added = myZoo.addAnimal(lion);
        if (added) {
            System.out.println("Lion added to the zoo.");
        } else {
            System.out.println("Failed to add lion to the zoo.");
        }

        myZoo.displayZoo();
        int index = myZoo.searchAnimal("Lion");
        System.out.println("Lion found at index: " + index);

        Animal newLion = new Animal("Felidae", "Lion", 12, true);
        System.out.println("New Lion found at index: " + myZoo.searchAnimal(newLion.getName()));


        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 35.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctica", 200.0f);
        Terrestrial terrestrialLion = new Terrestrial("Mammal", "Lion", 12, true, 4);

        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrialLion);

        Aquatic genericAquatic = new Aquatic("Fish", "Shark", 7, false, "Ocean");
        genericAquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
