package org.horizoncolumbus.hs;

// Example done by the teacher
public class BubbleSort implements Sorter{
    @Override
    public int[] sortArray(int[] unsortedArray) {

        //Bubble Sort algorithm implemented
        for (int i = 0; i < unsortedArray.length - 1; i++)
            for (int j = 0; j < unsortedArray.length - i - 1; j++)
                if (unsortedArray[j] > unsortedArray[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }

        return unsortedArray;
    }
}
