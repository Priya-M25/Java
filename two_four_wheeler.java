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