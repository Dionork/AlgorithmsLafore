package simpleSort;

public class CreateMass {
    protected int[] array;
    protected int nElements;

    public CreateMass(int max) {
        array = new int[max];
        nElements = 0;
    }


    public void displayArr() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\n");

    }

    public void delete(int val) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (val == array[j]) {
                for (int i = j; i < nElements; i++) {
                    array[i] = array[i + 1];
                    nElements--;
                    System.out.println("Значение удалено!");
                    return;
                }
            }
        }
        System.out.println("Значение не найдено!");
    }

    public void insert(int val) {
        array[nElements] = val;
        nElements++;
    }
    //Бинарный поиск
    public int search(int vol) {
        int lowEle = 0;
        int upperEle = nElements - 1;
        int curIn;
        while (true) {
            curIn = (lowEle + upperEle) / 2;
            if (array[curIn] == vol) {
                System.out.println("Элемент найден! № " + (curIn + 1));
                return curIn;
            } else if (lowEle > upperEle) {
                System.out.println("Элемент не найден!");
                return nElements;
            } else {
                if (array[curIn] < vol) {
                    lowEle = curIn + 1;
                } else {
                    upperEle = curIn - 1;
                }
            }
        }
    }
}
