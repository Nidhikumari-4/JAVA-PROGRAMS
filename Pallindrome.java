import java.util.*;

public class Pallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rem,sum=0,temp;

         System.out.print("Enter Number: ");
         int n=sc.nextInt();

         temp=n;
         while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
         }
          if(temp==sum)    
        System.out.println("Palindrome");    
        else    
        System.out.println("Not Palindrome");    
  
    }
}
