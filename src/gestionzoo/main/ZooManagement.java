package gestionzoo.main;

import gestionzoo.entities.*;
import gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("MyZoo", "BigCity");

        try {
            Animal lion = new Animal("Felidae", "Lion", 12, true);
            myZoo.addAnimal(lion);
            System.out.println("Added Lion to the zoo.");
        } catch (ZooFullException | InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Current animal count: " + myZoo.getAnimalCount());

        try {
            Animal dolphin = new Animal("Cetacea", "Dolphin", 8, true);
            myZoo.addAnimal(dolphin);
            System.out.println("Added Dolphin to the zoo.");
        } catch (ZooFullException | InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Current animal count: " + myZoo.getAnimalCount());

        try {
            Animal penguin = new Animal("Spheniscidae", "Penguin", 5, false);
            myZoo.addAnimal(penguin);
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
