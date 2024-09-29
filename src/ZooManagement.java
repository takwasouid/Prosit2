public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 12, true);
        Zoo myZoo = new Zoo("MyZoo", "BigCity", 25, 25);
        myZoo.animals[0] = lion;

        myZoo.displayZoo();
        System.out.println(myZoo);
        int index = myZoo.searchAnimal("Lion");
        System.out.println("Lion found at index: " + index);

        Animal newLion = new Animal("Lion", "Felidae", 12, true);
        System.out.println("New Lion found at index: " + myZoo.searchAnimal(newLion.name));
    }

}
