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

    public int[] getArray() {
        return array;
    }
}
