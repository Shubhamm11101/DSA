import java.util.*;

public class rec_array_List {

    static ArrayList<Integer> findAllIndex(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String args[]){
      int arr[] = {1,2,3,4,5,7,4,6,3,2};
      ArrayList<Integer> ans = findAllIndex(arr, 02, 0);
      System.out.println(ans);
    }
}
+