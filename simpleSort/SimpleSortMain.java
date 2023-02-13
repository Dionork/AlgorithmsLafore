package simpleSort;

public class SimpleSortMain {
    public static void main(String[] args) {
        int array1[] = CreateMass.createMass(20, 20);
        int array2[] = CreateMass.createMass(10, 4);
        Sort sort = new Sort();

        Service.displayArr(array1);
        sort.chooseSort(array1);
        Service.displayArr(array1);
        Service.noDouble(array1);
        Service.displayArr(array1);

    }
}
