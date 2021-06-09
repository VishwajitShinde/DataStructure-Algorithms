import java.util.Arrays;

public class _3_Kth_Smallest {

    // link: https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        Arrays.sort(arr);

        int kthSmallest = 3, kthBiggest = 2;
        System.out.println(kthSmallest + " Smallest Element: " + arr[0 + kthSmallest - 1]);
        System.out.println(kthBiggest + " Biggest Element: " + arr[arr.length - kthBiggest]);
    }
}
