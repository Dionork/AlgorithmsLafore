package simpleSort;

import java.util.Arrays;

public class SimpleSortMain {
    public static void main(String[] args) {
        int array1[] = CreateMass.createMass(5, 5);
        int array2[] = CreateMass.createMass(4, 4);
        BubbleSort sort = new BubbleSort();

        sort.bubblesort(array1);
        sort.bubblesort(array2);
        Service.displayArr(array1);
        Service.displayArr(array2);
        int [] merge = Merger.merge(array1,array2);
        Service.displayArr(merge);
    }
}
