package simpleSort;

public class Merger {


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergeMass = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        for (int k = 0; k < mergeMass.length; k++) {
            if (i > arr1.length - 1) {
                int a = arr2[j];
                mergeMass[k] = a;
                j++;
            } else if (j > arr2.length - 1) {
                int a = arr1[i];
                mergeMass[k] = a;
                i++;
            } else if (arr1[i] < arr2[j]) {
                int a = arr1[i];
                mergeMass[k] = a;
                i++;
            } else {
                int b = arr2[j];
                mergeMass[k] = b;
                j++;
            }
        }
        return mergeMass;
    }
}

