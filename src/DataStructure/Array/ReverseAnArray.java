package DataStructure.Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static  void reverse(int [] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
//                arr[left]= arr[left]+arr[right];
//                arr[right]= arr[left]-arr[right];
//                arr[left]= arr[left]- arr[right];     without temp variable ;
            left ++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void main() {
        int [] arr ={ 1,2,3,4,5,6};
        reverse(arr);
    }
}
