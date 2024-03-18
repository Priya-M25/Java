import java.util.*;
public class SDP_1day{
    public static void main(String[] args){
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       boolean flag=false;
       for (int i=2;i<n/2;i++){
        if(n%i==0){
            flag=true;
            break;
        }
       }
       if(!flag){
        System.out.println("Prime no.");
       }
       else{
        System.out.println("Not Prime no.");
       }
    }
}
