package simpleSort;

public class Service {
    public static void displayArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            } else {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println("\n");
    }

    public static void delete(int val, int[] array) {
        int j;
        for (j = 0; j < array.length; j++) {
            if (val == array[j]) {
                for (int i = j; i < array.length; i++) {
                    array[i] = array[i + 1];
                    array[i + 1] = 0;
                    System.out.println("Значение удалено!");
                    return;
                }
            }
        }
        System.out.println("Значение не найдено!");
    }

    public static void insert(int val, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = val;
                break;
            }
        }
    }
//Бинарный поиск
    public static int search(int vol, int[] array) {
        int lowEle = 0;
        int nElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                nElements++;
            }
        }
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

