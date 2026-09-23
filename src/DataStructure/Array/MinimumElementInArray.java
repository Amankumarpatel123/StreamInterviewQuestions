package DataStructure.Array;

public class MinimumElementInArray {
    public static int findMinimum(int[] arr){
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min= arr[i];
        }
        return  min;
    }
    static void main() {
        int [] arr = { 6,4,98,67,65,55};
        System.out.println(findMinimum(arr));
    }
}
