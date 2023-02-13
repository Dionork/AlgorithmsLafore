package simpleSort;

public class Sort {
    private int[] array;
    private int nElements = 0;
    int how = 0;

    public int[] bubbleSort(int[] array) {
        int out, in;
        this.array = array;
        nElements(array);
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

    public int[] chooseSort(int[] array) {
        int current, next, min;
        this.array = array;
        nElements = 0;
        nElements(array);
        for (current = 0; current < nElements; current++) {
            min = current;
            for (next = current + 1; next < nElements; next++) {
                if (array[next] < array[min]) {
                    min = next;
                    swap(current, min);
                }
            }
        }
        boolean isGood = false;

        for (int i = 0; i < nElements - 1; i++) {
            if (array[i] < array[i + 1]) {
                isGood = true;
                continue;
            } else if (how <= 10) {
                how++;
                isGood = false;
                break;
            } else {
                System.out.println("Есть двойные числа");

                return array;
            }
        }
        return (isGood ? array : chooseSort(this.array));
    }

    private void nElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                nElements++;
            }
        }
    }
}