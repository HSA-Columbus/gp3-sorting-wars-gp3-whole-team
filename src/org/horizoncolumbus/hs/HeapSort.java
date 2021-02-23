package org.horizoncolumbus.hs;

public class HeapSort implements Sorter{
    @Override
    public int[] sortArray(int[] unsortedArray) {
        int n = unsortedArray.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(unsortedArray, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = unsortedArray[0];
            unsortedArray[0] = unsortedArray[i];
            unsortedArray[i] = temp;

            // call max heapify on the reduced heap
            heapify(unsortedArray, i, 0);
        }
        return unsortedArray;
    }
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int unsortedArray[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && unsortedArray[l] > unsortedArray[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && unsortedArray[r] > unsortedArray[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = unsortedArray[i];
            unsortedArray[i] = unsortedArray[largest];
            unsortedArray[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(unsortedArray, n, largest);
        }
    }
}
