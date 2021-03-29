package domain;

public class TestQuickSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Sorter quickSort = MiFactory.getInstance("sorter");

        quickSort.sort(arr, new ComparatorIntegerDesc());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        ;
    }
}
