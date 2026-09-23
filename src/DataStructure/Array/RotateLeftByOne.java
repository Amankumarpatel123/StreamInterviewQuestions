package DataStructure.Array;

import java.util.Arrays;

public class RotateLeftByOne {
    public static void rotateLeft( int [] arr){
        int first = arr[0];
        for ( int i= 1; i< arr.length; i++){
            arr[i-1]= arr[i];
        }
        arr[arr.length-1]= first;
        System.out.println(Arrays.toString(arr));
    }

    static void main() {
        int [] arr = {1,2,3,4,5,6};
        rotateLeft(arr);
    }
}
