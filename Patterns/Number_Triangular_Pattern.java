/* Output
1 
2 3 
4 5 6 
7 8 9 10 
*/
import java.util.*;
class Asc_no{
    public static void main(String[] args) {
        int c=1;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(c +" ");
                c++;
            }
            System.out.println();
        }
    }
}
