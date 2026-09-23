package DataStructure.Array;

public class CheckIfArrayIsSorted {
    public static boolean isSorted(int [] arr){
        if (arr.length==0 || arr.length==1)
            return true;

        for(int i =1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                return  false;
            }
        }
        return true;
    }

    static void main() {
        int [] arr = {1,6,2,3,4,5,6};
        int [] arr2= {1,2,3,4,5,6,7};
        System.out.println(isSorted(arr));
        System.out.println(isSorted(arr2));
    }
}
