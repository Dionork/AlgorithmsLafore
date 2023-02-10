package simpleSort;

public class SimpleSortMain {
    public static void main(String[] args) {
    BubbleSort firstMass = new BubbleSort(100);
        for (int i = 0; i < 5; i++) {
            firstMass.insert((int)(Math.random()*100));
        }
        firstMass.displayArr();
        firstMass.insert(69);
        firstMass.bubblesort();
        System.out.println("Сортировка");
        firstMass.displayArr();
        firstMass.search(20);



    }
}
