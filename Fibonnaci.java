import java.util.*;

public class Fibonnaci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int c;
         System.out.print("Enter Number: ");
        int n=sc.nextInt();
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
        }

    }
}