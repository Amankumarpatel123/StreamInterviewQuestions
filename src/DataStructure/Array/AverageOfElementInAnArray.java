package DataStructure.Array;

public class AverageOfElementInAnArray {
    public static double average(int [] arr){
        int sum = 0;
        for(int num : arr){
            sum = sum+num;
        }
        return  (double)sum/arr.length;
    }

    static void main() {
        int [] arr ={1,2,3,4,5,6,7,8};
        System.out.println(average(arr));
    }
}
