import java.util.Scanner;

public class problem4 {
    static int pealElement(int [] arr){
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if (arr[mid] > arr[mid+1]){
                high = mid;
            }
            else {
               low=mid +1;

            }

        }
        return low;

    }
    public static void main(String[] args) {
       // int[] arr= { 1,2,3,4,5,4,3,2,};
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the size of an array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the "+ n + "Element in  order");
        for (int i=0;i<arr.length; i++ ){
            arr[i]=sc.nextInt();
        }
        int result = pealElement(arr);
        System.out.println( "The peak Element is : "  + result);
    }
}
