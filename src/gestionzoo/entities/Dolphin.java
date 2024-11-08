package gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming!");
    }

    @Override
    public String toString() {
        return "Dolphin{" + "name='" + getName() + "', habitat='" + getHabitat() +
                "', swimmingSpeed=" + swimmingSpeed + "}";
    }
}
