package domain;

public class TestFactory {
    public static void main(String[] args) {
        Time time = new Time();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Sorter quickSort = MiFactory.getInstance("quick");
        time.setStart();
        quickSort.sort(arr, new ComparatorIntegerDesc());
        time.setStop();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("Tiempo: " + time.elapsedTime());
        System.out.println("");
        Sorter bubbleSort = MiFactory.getInstance("bubble");
        time.setStart();
        bubbleSort.sort(arr, new ComparatorIntegerAsc());
        time.setStop();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("Tiempo: " + time.elapsedTime());
        System.out.println("");
        Sorter heapSort = MiFactory.getInstance("heap");
        time.setStart();
        heapSort.sort(arr, new ComparatorIntegerDesc());
        time.setStop();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("Tiempo: " + time.elapsedTime());
    }
}
