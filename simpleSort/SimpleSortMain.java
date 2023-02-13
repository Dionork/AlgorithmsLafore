package simpleSort;

public class SimpleSortMain {
    public static void main(String[] args) {
        int array1[] = CreateMass.createMass(5, 5);
        int array2[] = CreateMass.createMass(4, 4);
        Sort sort = new Sort();

        sort.bubblesort(array1);
        sort.bubblesort(array2);
        Service.displayArr(array1);
        Service.displayArr(array2);
        int [] merge = Merger.merge(array1,array2);
        Service.displayArr(merge);
    }
}
