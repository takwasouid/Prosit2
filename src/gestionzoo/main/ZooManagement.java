package gestionzoo.main;

import gestionzoo.entities.*;
import gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Cetacea", "Dolphin", 8, true, "Ocean"); // Use Dolphin instead of Aquatic
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 12, true, 4);
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 5, false, "Antarctica", 200.0f);

        System.out.println("Testing food methods:");
        dolphin.eatMeat(Food.MEAT);
        lion.eatMeat(Food.MEAT);
        lion.eatPlant(Food.PLANT);
        lion.eatPlantAndMeat(Food.BOTH);

        Zoo myZoo = new Zoo("MyZoo", "BigCity");

        try {
            Animal lionAnimal = new Animal("Felidae", "Lion", 12, true); // Renamed
            myZoo.addAnimal(lionAnimal);
            System.out.println("Added Lion to the zoo.");
        } catch (ZooFullException | InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Current animal count: " + myZoo.getAnimalCount());

        try {
            Animal dolphinAnimal = new Animal("Cetacea", "Dolphin", 8, true); // Renamed
            myZoo.addAnimal(dolphinAnimal);
            System.out.println("Added Dolphin to the zoo.");
        } catch (ZooFullException | InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Current animal count: " + myZoo.getAnimalCount());

        try {
            Animal penguinAnimal = new Animal("Spheniscidae", "Penguin", 5, false); // Renamed
            myZoo.addAnimal(penguinAnimal);
            System.out.println("Added Penguin to the zoo.");
        } catch (ZooFullException | InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Current animal count: " + myZoo.getAnimalCount());

        try {
            Animal invalidAgeAnimal = new Animal("Test", "TestAnimal", -2, false);
            myZoo.addAnimal(invalidAgeAnimal);
        } catch (ZooFullException | InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Final animal count: " + myZoo.getAnimalCount());
    }
}
