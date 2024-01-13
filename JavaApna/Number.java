//Write a program for checking enter number is even or odd.

import java.util.*;
import java.io.*;

public class Number
{
  public static void main(String args[]) throws IOException
  {
    
    int a;
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:-");
        a=sc.nextInt();
    if (a%2==0)
    {
        System.out.println("the number is even");
    }
    else
    {
        System.out.println("the number is odd");
    }
    

  }
}  