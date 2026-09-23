package DataStructure.Array;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static  void moveZero( int [] arr){

        int size = arr.length;
        if (size == 0 || size ==1)
            return ;
        int nonZero= 0;
        int zero= 0;

        while (nonZero<size){
            if(arr[nonZero]!=0) {
                int temp = arr[nonZero];
                arr[nonZero] = arr[zero];
                arr[zero] = temp;

                nonZero ++;
                zero++;
            }
            else
                nonZero++;

        }


        System.out.println(Arrays.toString(arr));
    }

    static void main() {
        int[]  arr ={1,0,0,0,2,0,3,4,0,5};
        moveZero(arr);
    }
}
//int index = 0;
//        for( int num: arr){           //[1,0,0,0,2,0,3,4,0,5]
//            if ( num!=0){
//                arr[index]= num ;
//                index ++;
//            }
//        }
//        while ( index< arr.length){
//            arr[index]= 0;
//            index++;
//        }