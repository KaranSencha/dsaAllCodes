import java.util.Scanner;

public class PrintIncreasing {
    
    static void printIncreasing(int n) {

        // base case
        if(n == 1) {
            System.out.println(1);
            return;
        }
        // Recursive work
        printIncreasing(n - 1);

        // Self work
        System.out.println(n);
    }

    static void printDecreasing(int n) {
        if(n ==1) {  // base case
            System.out.println(n);
            return;
        }
        System.out.println(n);  // self work
        printDecreasing(n - 1);  // recursive work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      printDecreasing(n);
    }
}
