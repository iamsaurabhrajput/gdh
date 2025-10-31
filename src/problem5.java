import java.util.Scanner;

public class problem5 {
    static int florvalue(int[] arr, int target){
        int id=-1;
        int low=0;
       int high= arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high= mid-1;
            }
            else{
                id=mid;
                low= mid +1;
            }

        }
        return id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        int size= sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the" + size + " element of array:");
        for(int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        int result= florvalue(arr,target);
        System.out.println(" The floar value is present at index :" + result);
        System.out.println("The floar value is :" + arr[result]);


    }
}
