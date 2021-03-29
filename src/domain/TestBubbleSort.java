package domain;

public class TestBubbleSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        Sorter bubbleSort = MiFactory.getInstance("sorter");
        bubbleSort.sort(arr, new ComparatorIntegerAsc());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
