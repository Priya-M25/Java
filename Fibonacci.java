/* Output
    Enter the number of elements you want in Fibonacci series: 10
    Fibonacci series:
    0 1 1 2 3 5 8 13 21 34

   */

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in fibbonacci series : ");
        int n = sc.nextInt();
        System.out.println("Fibbonacci series");
        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) 
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
