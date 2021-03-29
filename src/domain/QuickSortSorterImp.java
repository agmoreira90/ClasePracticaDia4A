package domain;

import java.util.Comparator;

public class QuickSortSorterImp implements Sorter {

    // A utility function to swap two elements
    private void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    private int partition(Object[] arr, Comparator c, int low, int high) {

        // pivot
        Object pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (c.compare(arr[j], pivot) < 0) {
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Function to print an array
    private void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void quickSort(Object[] arr, Comparator c, int inicio, int fin) {
        if (inicio < fin) {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, c, inicio, fin);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, c, inicio, pi - 1);
            quickSort(arr, c, pi + 1, fin);
        }
    }

    @Override
    public void sort(Object[] arr, Comparator c) {
        quickSort(arr, c, 0, arr.length - 1);
    }
}
