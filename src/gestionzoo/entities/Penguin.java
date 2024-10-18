package gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter for swimmingDepth
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    // Setter for swimmingDepth
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{name='" + getName() + "', habitat='" + getHabitat() +
                "', swimmingDepth=" + swimmingDepth + "}";
    }

    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
