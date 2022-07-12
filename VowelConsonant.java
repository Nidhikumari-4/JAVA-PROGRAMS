// write a program to find whether a character s vowel or consonent using if-else

import java.io.*;
import java.util.*;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);
        if((ch>=97&&ch<124) || (ch>=65&&ch<92)){
        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        //         System.out.println("Vowel");
        //     }
        //     else{
        //         System.out.println("Consonant");

        //     }

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel");
            break;
            default:
            System.out.println("Consonant");
        }  
              
        }
        else{
            System.out.println("NOT A CONSONANT");
        }
    }
}