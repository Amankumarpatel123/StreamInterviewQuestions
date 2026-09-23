package DataStructure.Array;

public class CountEvenOddInAnArray {
    public static void countEvenOdd(int [] arr)
    {
        int even =0;
        int odd = 0;
        for (int num:arr)
        {
            if (num % 2==0)
                 even++;
            else
               odd++;
        }
        System.out.println("Even :"+even);
        System.out.println("Odd :"+odd);
    }

    static void main() {
        int [] arr ={ 1,2,3,4,5,6,7,8,9};
        countEvenOdd(arr);
    }
}
