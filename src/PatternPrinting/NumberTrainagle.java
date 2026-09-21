package PatternPrinting;

public class NumberTrainagle {
    public static void printPattern(int n ){
        int i,j;
        for (i = 0; i <=n; i++) {
            for ( j = 0; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(4);
    }
}
