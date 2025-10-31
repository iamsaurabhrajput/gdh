import java.util.Scanner;

public class problem3 {
    static int search(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =(low +high )/2;
            if(target==arr[mid]){
                return mid;

            } else if (arr[mid]<target) {
                high= mid -1;
            }
            else{
                low = mid +1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the size of an array");
       int n= sc.nextInt();
       int[] arr= new int[n];
        System.out.println("Enter the "+ n + "Element in desecending order");
        for (int i=0;i<arr.length; i++ ){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number :");
        int target = sc.nextInt();
       int result= search(arr,target);
       if(result ==-1){
           System.out.println("Element is not prsent in given array :");
       }else {
           System.out.println("the index of the target is :"+ result);
       }



    }
}
