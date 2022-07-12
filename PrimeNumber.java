// print all prime numbers in range  1 to 100

public class PrimeNumber{
    public static void main(String[] args){
        System.out.println("Prime numbers are: ");
        for (int i=1;i<=100;i++){
            int isPrime=1;
            for(int j=2;j<i;j++){
                if(i%j==0)
                isPrime=0;
            }
            if(isPrime==1){
               System.out.print(i+" ");

            }
        }

    }
}