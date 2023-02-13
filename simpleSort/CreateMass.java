package simpleSort;

public class CreateMass {
    protected int[] array;
    protected int nElements;

    public static int[] createMass(int max, int currentVol) {
        int[] array = new int[max];
        for (int i = 0; i < currentVol; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        return array;
    }


    public int[] getArray() {
        return array;
    }
}
