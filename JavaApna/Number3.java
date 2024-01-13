//Write a program to Take input of age of 3 people by user and determine oldest among them.

import java.util.*;
import java.io.*;

public class Number3
{
  public static void main(String args[]) throws IOException
  {
    
    int a,b,c;
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:-");
        a=sc.nextInt();
        System.out.println("Enter the number:-");
        b=sc.nextInt();
        System.out.println("Enter the number:-");
        c=sc.nextInt();
         if(a<b && a<c)
         {
            System.out.println("the A is oldest"+a);
         }
         if(b<a && b<c)
         {
            System.out.println("the B is oldest"+b);
         }
         else
         {
          System.out.println("the C is oldest"+c);
         }
  }
}  
