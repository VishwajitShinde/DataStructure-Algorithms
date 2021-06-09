import java.util.Arrays;

public class _1_ReverseAnArray {

    // link:  https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        printArray(arr);
        System.out.println("\nReversed Array");
        //reverseArrayNormalWay(arr);
        arr = reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static int[] reverseArray(int[] arr, int s, int e) {
        while(!(s>=e)){
            int tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
            s++;
            e--;
        }
        return arr;
    }

    private static void reverseArrayNormalWay(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    private static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
