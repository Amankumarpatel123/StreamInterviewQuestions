package DataStructure.Array;

public class Find2ndLargestElementInAnArray {
    public static int secondLargestElement(int [] arr ){
        int largest = Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int num : arr){
            if ( num > largest){
                secondLargest = largest;
                largest = num ;
            } else if (num> secondLargest && num != largest) {
                secondLargest= num;
            }

        }
        return secondLargest;
    }

    static void main() {
        int [] arr ={ 5,7,4,34,7,8,34,67};
        System.out.println(secondLargestElement(arr));
    }
}
