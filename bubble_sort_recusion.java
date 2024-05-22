import java.util.*;

public class bubble_sort_recusion {

    static void bubbleSorting(int arr[], int r, int c){
        if( r == 0){
            return;
        }
         if(c < r){
            if(arr[c] > arr[c+1]){

                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSorting(arr, r, c + 1);
         }
         else{
            bubbleSorting(arr, r-1, 0);
         }
    }
    public static void main(String args[]){
           int arr[] = {4,3,2,1};
           bubbleSorting(arr, arr.length - 1, 0);
           System.out.println(Arrays.toString(arr));
    } 
}
