
import java.io.*;
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks: ");
        int marks=sc.nextInt();

        // if(marks>=90 && marks<=100)
        // System.out.println("A");
        //  if(marks>=80 && marks<=89)
        // System.out.println("B");
        //  if(marks>=70 && marks<=79)
        // System.out.println("C");
        //  if(marks>=50 && marks<=69)
        // System.out.println("D");
        //  if(marks>=0 && marks<=49)
        // System.out.println("FAIL");

        switch(marks/10){
            case 10:
            case 9:
            System.out.println("A");
            break;
            case 8:
            System.out.println("B");
            break;
            case 7:
            System.out.println("C");
            break;
            case 6:
            case 5:
            System.out.println("D");
            break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
            System.out.println("FAIL");
            break;
             default:
            System.out.println("Invalid");
           
        }
    }
}