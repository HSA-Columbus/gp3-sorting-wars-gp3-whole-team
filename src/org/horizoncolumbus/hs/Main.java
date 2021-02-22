package org.horizoncolumbus.hs;

// Starter Code
public class Main {

    //How many nano-seconds are in a second
    private static final double nanoPerSecond = 1_000_000_000;

    //Declare a short array with only 10 indexes
    static int[] unSortedArray = new int[10];



    public static void main(String[] args) {

        // first of all, fill teh array with random unsorted numbers
        fillTheArray(unSortedArray);

        //Polymorphism : loop through all the different sort algorithms using the Sort Interface
        for(Sorter sorterType : new Sorter[]{new BubbleSort()}){

            // Initial message: Sort algorithm type and a preview of the unsorted array
            System.out.println("Sort Algorithm Type: \t " + sorterType.getClass().getSimpleName());
            System.out.println("Unsorted Array: \t" + arrayPrinter(unSortedArray));

            //start time
            long startTime = System.nanoTime();

            // sort the array
            int [] sortedArray = sorterType.sortArray(unSortedArray);

            //end time
            long endTime = System.nanoTime();

            //find the duration
            long duration = (endTime - startTime);


            // Display results: preview of the sorted array, duration it took to sort in seconds
            System.out.println("Sorted Array: \t" + arrayPrinter(sortedArray));
            System.out.println("Duration: \t" + duration / nanoPerSecond + " seconds");
            System.out.println("**************************\n");
        }
    }

    public static String arrayPrinter(int[] sortedArray){
        String result = "";
        for(int number : sortedArray){
            result += number + "\t";

            if(result.length() > 30){
                result += "...";
                break;
            }
        }
        return result;
    }

    public static void fillTheArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()* (99 - 1 + 1) + 1);
        }
    }

}
