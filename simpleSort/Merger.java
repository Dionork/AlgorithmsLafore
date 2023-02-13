package simpleSort;

public class Merger {
    private int[] arr1;
    private int[] arr2;

    public Merger(CreateMass arr1, CreateMass arr2) {
        this.arr1 = arr1.getArray();
        this.arr2 = arr2.getArray();
    }

    public int[] merge() {
        int[] mergeMass = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergeMass[i] = arr1[i];
            mergeMass[arr2.length - (1 + i)] = arr2[i];
        }
        return mergeMass;
    }
}
