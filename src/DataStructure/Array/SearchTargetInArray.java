package DataStructure.Array;

public class SearchTargetInArray {
    public static boolean contain(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }
    return false;
    }

    static void main() {
        int [] arr = {1,2,5,7,5,8,45,86};
        int target = 45;
        System.out.println(contain(arr, target));
    }
}
