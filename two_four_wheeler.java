/* Problem Statement:
Write a Java program that calculates the number of two-wheeler and four-wheeler vehicles based on the total number of vehicles and the total number of wheels.
The program should prompt the user to enter the following inputs:
1. The number of vehicles (`v`)
2. The number of wheels (`w`)
The program should then perform the following checks:
1. If the number of wheels is less than 2, or if the number of wheels is odd, or if the number of vehicles is greater than the number of wheels, the program should output "Invalid input.....".
2. Otherwise, the program should calculate and output the number of two-wheeler vehicles and the number of four-wheeler vehicles.

Output:
Enter the no. of vehicles :- 
510
Enter the no. of wheels :- 
2000
no. of Two-wheels vehicles :- 20
no. of Four-wheels vehicles :- 490
*/

import java.util.Scanner;

public class program_17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of vehicles :- ");
        int v=sc.nextInt();
        System.out.println("Enter the no. of wheels :- ");
        int w=sc.nextInt();
        if (2>w || w%2!=0 || v>w){
            System.out.println("Invalid input.....");
        }
        else{
            int tw=(v *4 - w)/2;
            int fw=v-tw;
            System.out.println("no. of Two-wheels vehicles :- "+tw);
            System.out.println("no. of Four-wheels vehicles :- "+fw);
            
        }

    }
}
