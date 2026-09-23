package DataStructure.Array;

public class MaximumElementInAnArrayt {
    public static int findMax(int [] arr){
        int max = arr[0];
        for (int num:arr){
            if(num > max){
                max= num;
            }
        }
        return max;
    }

    static void main() {
        int [] arr = {5,6,78,65,9,0,98};
        System.out.println(findMax(arr));
    }
}
