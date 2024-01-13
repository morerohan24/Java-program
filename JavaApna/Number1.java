//Write a program to take two number from user and check who is max.

import java.util.*;
import java.io.*;

public class Number1
{
  public static void main(String args[]) throws IOException
  {
    
    int a,b;
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:-");
        a=sc.nextInt();
        System.out.println("Enter the number:-");
        b=sc.nextInt();
        if(a>b)
        {
          System.out.println("is max"+a);
        }
        else
        {
          System.out.println("is max"+b);
        }
  }
}  
