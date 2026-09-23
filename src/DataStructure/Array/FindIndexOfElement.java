package DataStructure.Array;

public class FindIndexOfElement {
    public static  int findIndex(int  [] arr, int target){
        for (int i = 0; i <arr.length ; i++) {

            if( arr[i]== target)
                return i;
        }
        return -1;
    }
    static void main() {
        int [] arr = {1,2,5,7,5,8,45,86};
        int target = 45;
        System.out.println(findIndex(arr, target));
    }
}
