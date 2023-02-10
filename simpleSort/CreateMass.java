package simpleSort;

public class CreateMass {
    private int[] array;

    public CreateMass(int max) {
        array = new int[max];
        array = setArray (max);
        }

    private int[] setArray(int max) {
        for (int i=0;i<max;i++) {
            array [i] = (int) (Math.random() * 100);
        }
        return array;
    }
    public void displayArr (){
        for (int x: array) {
            System.out.print(" "+x);
        }
        System.out.println("\n");
    }
}
