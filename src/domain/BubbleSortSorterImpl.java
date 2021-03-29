package domain;

import java.util.Comparator;

public class BubbleSortSorterImpl implements Sorter{

    @Override
    public void sort(Object[] arr, Comparator c) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j],(arr[j + 1])) > 0) {
                    Object temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }
}
