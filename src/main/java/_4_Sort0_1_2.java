import java.util.Arrays;

public class _4_Sort0_1_2 {
    //link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
    public static void main(String[] args) {
        int arr[]= {0, 2, 1, 2, 0};

        System.out.println("Input:");
        printArr(arr);

        // method1 - simple sort
        arr = sort(arr);
        System.out.println("\nMethod1 - Sorting");
        printArr(arr);

        // method2 - count 0s, 1s, 2s and fill up the array
        countAndFill(arr);
        System.out.println("\nMethod2 - Count And Fill up the array");
        printArr(arr);

    }

    private static void countAndFill(int[] arr) {
        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (i){
                case 0:
                    zeros++; break;
                case 1:
                    ones++; break;
                case 2:
                    twos++; break;
            }
        }

        // refill the array with 0s
        int start = 0, end = zeros - 1;
        fillArr(arr, start, end, 0);

        // refill the array with 1s
        start = zeros; end = ones - 1;
        fillArr(arr, start, end, 1);

        // refill the array with 2s
        start = ones; end = twos - 1;
        fillArr(arr, start, end, 1);

    }

    private static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    private static void fillArr(int[] arr, int start, int end, int noToFill) {
        for (int i = start; i < end ; i++) {
            arr[i] = noToFill;
        }
    }

    private static void printArr(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
