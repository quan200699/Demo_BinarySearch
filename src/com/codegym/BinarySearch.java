package com.codegym;

public class BinarySearch<E extends Comparable<E>> {
    protected E[] array;

    public BinarySearch() {
    }

    public BinarySearch(E[] array) {
        this.array = array;
    }

    public boolean search(int left, int right, E e) {
        if (left > right) {
            return false;
        }
        int middle = (left + right) / 2;
        if (this.array[middle].equals(e)) {
            return true;
        }
        if (e.compareTo(this.array[middle]) < 0) {
            return search(left, middle - 1, e);
        } else {
            return search(middle + 1, right, e);
        }
//        return e.compareTo(this.array[middle]) < 0 ? search(left, middle - 1, e) : search(middle + 1, right, e);
    }

    public void arrangeArray() {
        int arrayLength = this.array.length;
        E template;
        boolean isSorted;
        for (int i = 0; i < arrayLength; i++) {
            isSorted = true;
            for (int j = 1; j < (arrayLength - i); j++) {

                if (this.array[j - 1].compareTo(this.array[j]) > 0) {
                    template = this.array[j - 1];
                    this.array[j - 1] = this.array[j];
                    this.array[j] = template;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }
}
