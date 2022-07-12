//Find gcd of two numbers
import java.util.*;

public class GCD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of a and b: ");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else if(b>a){
                b=b-a;
            }
        }
        System.out.println("GCD = "+b);
    }
}