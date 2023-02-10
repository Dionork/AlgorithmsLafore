package simpleSort;

public class BubbleSort extends CreateMass {
    public BubbleSort(int max) {
        super(max);
    }

    public void bubblesort() {
        int out, in;
        for (out = nElements-1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
