package DataStructure.Array;

public class SumOfAnArrayElement {
    public static  int  sumElement (int [] arr){
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }

    static void main() {
        int [] arr = { 1,2,3,4,5,6,7};
        System.out.println(sumElement(arr));
    }
}
