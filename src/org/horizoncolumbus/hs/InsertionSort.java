package org.horizoncolumbus.hs;

public class InsertionSort implements Sorter{
    @Override
    public int[] sortArray(int[] unsortedArray) {
        int n = unsortedArray.length;
        for (int i = 1; i < n; ++i) {
            int key = unsortedArray[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && unsortedArray[j] > key) {
                unsortedArray[j + 1] = unsortedArray[j];
                j = j - 1;
            }
            unsortedArray[j + 1] = key;
        }
        return unsortedArray;
    }
}
