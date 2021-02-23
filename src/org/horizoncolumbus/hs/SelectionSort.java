package org.horizoncolumbus.hs;

public class SelectionSort implements Sorter {
    @Override
    public int[] sortArray(int[] unsortedArray) {
        int n = unsortedArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (unsortedArray[j] < unsortedArray[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = unsortedArray[min_idx];
            unsortedArray[min_idx] = unsortedArray[i];
            unsortedArray[i] = temp;
        }
        return unsortedArray;
    }
}
