package DataStructure.Array;

import java.util.Arrays;

public class RotateRightByOne {
    public static  void rotateRight( int[] arr){
        int last = arr.length;
         for( int i= arr.length-1 ; i> 0; i--){
             arr[i]= arr[i-1];
         }
         arr[0]= last;
        System.out.println(Arrays.toString(arr));
    }

    static void main() {
        int [] arr = {1,2,3,4,5,6};
        rotateRight(arr);
    }
}
