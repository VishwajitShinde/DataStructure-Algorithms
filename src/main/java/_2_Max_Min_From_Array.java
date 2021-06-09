public class _2_Max_Min_From_Array {
    //link: https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
    public static void main(String[] args) {
        int arr[] = {10, 6, 3, 4, 99, 50, 15, 2, 1};

        MinMax mmObj = calculateMixMax(arr);

        System.out.println("Max: " + mmObj.max);
        System.out.println("Min: " + mmObj.min);
    }

    private static MinMax calculateMixMax(int[] arr) {
        MinMax mmObj = new MinMax();

        // if arr length == 1
        if(arr.length == 1){
            mmObj.min = arr[0];
            mmObj.max = arr[0];
        }

        // if arr length > 1
        if(arr[0] >= arr[1]){
            mmObj.max = arr[0];
            mmObj.min = arr[1];
        }else{
            mmObj.min = arr[0];
            mmObj.max = arr[1];
        }

        // compare indices from 2 to arr.length
        for (int i = 2; i < arr.length; i++) {
            if(mmObj.min > arr[i]){
                mmObj.min = arr[i];
            }else if(mmObj.max < arr[i]){
                mmObj.max = arr[i];
            }
        }
        return mmObj;
    }
}

class MinMax{
    int min;
    int max;
}
