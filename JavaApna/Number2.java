//Write a program for checking enter number is Positive or Negative.

import java.util.*;
import java.io.*;

public class Number2
{
  public static void main(String args[]) throws IOException
  {
    
    int no;
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:-");
        no=sc.nextInt();

            if(no>0)
            {
				System.out.println(" is positive."+no);
            }   
			else
            {
				System.out.println(" is negetive."+no);
            }    
  }
}  			