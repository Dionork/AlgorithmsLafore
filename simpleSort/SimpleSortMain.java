package simpleSort;

public class SimpleSortMain {
    public static void main(String[] args) {
    CreateMass firstMass = new CreateMass(100);
        for (int i = 0; i < 10; i++) {
            firstMass.insert((int)(Math.random()*100));
        }

        firstMass.insert(20);

        firstMass.displayArr();
        firstMass.delete(20);
        firstMass.displayArr();

    }
}
