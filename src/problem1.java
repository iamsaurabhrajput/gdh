public class problem1 {
    static int binary(int[] arr, int target) {
        int low = 0;
        int count=-1 ;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                count =mid;
                high= mid -1;
//                return count;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return count;
       // return -1;

    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 9, 9,9,9, 12};
        int result = binary(arr, 9);
        if (result == -1) {
            System.out.println("Element is not present in the given array ");
        } else {
            System.out.println("Element is present at "+"Index :" + result);
        }


    }
}
