import java.util.Arrays;

public class _5_Rearrange_Numbers {

    // Move all negative numbers to beginning and positive to end with constant extra space
    // link: https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

    public static void main(String[] args) {
        //int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
        System.out.println("Before Movement: ");
        printArr(arr);

        arr = rearrangeNumbers(arr);

        System.out.println("\nAfter Movement: ");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }

    private static int[] rearrangeNumbers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            if(arr[left] < 0){
                left++;
                continue;
            }
            if(arr[right] > 0){
                right--;
                continue;
            }
            if(arr[left] >= 0 && arr[right] < 0){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
