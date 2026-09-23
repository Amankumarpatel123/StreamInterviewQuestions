package DataStructure.Array;

import java.util.Arrays;

public class ReverseUsingExtraArray {
     public static  void ReverseWithTempArray( int [] arr){
         int [] temp = new int[arr.length];

         for(int i=0; i< arr.length; i++){
             temp[i]= arr[arr.length-i-1];
         }
         System.out.println(Arrays.toString(temp));
     }

    static void main() {
        int [] arr = {1,2,3,4,5,6,7,8};
        ReverseWithTempArray(arr);
    }
}
