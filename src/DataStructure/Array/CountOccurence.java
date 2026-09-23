package DataStructure.Array;

public class CountOccurence {
    public static  int Occurence( int [] arr , int k )
    {
        int count = 0;
        for ( int num : arr ){
            if (num == k)
                count++;
        }
        return count;
    }

    static void main() {
        int [] arr = { 1,2,3,4,4,3,3,3,5,6};
        int target = 3;
        System.out.println(Occurence(arr,target));
    }
}
