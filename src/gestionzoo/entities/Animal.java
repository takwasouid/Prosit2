package gestionzoo.entities;

public class Animal {
    private String species;
    private String name;
    private int age;
    private boolean isCarnivore;

    // No-argument (default) constructor
    public Animal() {
        // Initialize with default values (optional)
        this.species = "Unknown";
        this.name = "Unnamed";
        this.age = 0;
        this.isCarnivore = false;
    }

    // Parameterized constructor
    public Animal(String species, String name, int age, boolean isCarnivore) {
        setSpecies(species);
        setName(name);
        setAge(age);
        this.isCarnivore = isCarnivore;
    }

    // Getters and Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species == null || species.trim().isEmpty()) {
            throw new IllegalArgumentException("Species cannot be empty.");
        }
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean isCarnivore) {
        this.isCarnivore = isCarnivore;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                '}';
    }
}
