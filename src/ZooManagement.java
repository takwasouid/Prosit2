public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 12, true);
        Zoo myZoo = new Zoo("MyZoo", "BigCity", 25, 25);
        myZoo.animals[0] = lion;

        myZoo.displayZoo();
        System.out.println(myZoo);
    }
}
