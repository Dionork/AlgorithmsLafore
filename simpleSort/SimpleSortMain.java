package simpleSort;

import java.util.Arrays;

public class SimpleSortMain {
    public static void main(String[] args) {
        int array [] = CreateMass.createMass(20,10);
        BubbleSort a1 = new BubbleSort();

        Service.displayArr(array);
        Service.insert(10,array);
        Service.displayArr(array);
        a1.bubblesort(array);
        Service.displayArr(array);
        Service.search(10,array);
    }
}
