package simpleSort;

public class Sort {
    int[] array;

    public int[] bubblesort(int[] array) {
        int out, in;
        int nElements = 0;
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                nElements++;
            }
        }
        for (out = nElements - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
        return array;
    }

    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}