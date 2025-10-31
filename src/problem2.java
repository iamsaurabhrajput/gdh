public class problem2 {
    static int search1(int [] arr, int target){
        int id2=-1;
        int low = 0;
        int high =arr.length-1;
        while(low<=high){
            int mid =(low +high )/2;
            if(target==arr[mid]){
                id2=mid;
                low=mid+1;
            } else if (arr[mid]<target) {
                low = mid +1;
            }
            else{
                high= mid -1;
            }

        }

        return id2;
    }
    static int search(int [] arr, int target) {
          int id1=-1;

          int low = 0;
          int high =arr.length-1;
          while(low<=high){
              int mid =(low +high )/2;
              if(target==arr[mid]){
                  id1=mid;
                  high=mid-1;
              } else if (arr[mid]<target) {
                  low = mid +1;
              }
              else{
                  high= mid -1;
              }

          }

    return id1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,6,8,9};
        int target= 5;

        int result= search( arr, target);
        int resul= search1( arr, target);
        System.out.println("Element is present at index "+ result +" ,"+resul);
    }
}
