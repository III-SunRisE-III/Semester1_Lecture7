import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void fill_array(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 101);
        }
    }

    public static int partition(int[] arr, int min, int max) {
        int pivot_index = (min + max) / 2;
        int pivot = arr[pivot_index];
        int i = min, j = max;
        while (true) {
            while (arr[++i] < pivot);
            while (arr[--j] > pivot);
            if (i >= j) return j;
            var t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }

    public static void quickSort(int[] arr, int min, int max) {
        int p = partition(arr, min, max);
        if (min < (p - 1)) quickSort(arr, min, p - 1);
        if (max > (p + 1)) quickSort(arr, p + 1, max);
    }

    public static void quickSort(int[] arr) {   // перегруженная функция
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 3, y = 5;
        System.out.println(x + "  " + y);
    }
}
