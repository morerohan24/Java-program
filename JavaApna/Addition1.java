import java.util.*;
import java.io.*;
 
 public class Addition1
 {
    public static void main(String args[]) throws IOException
    {
        int a,b,c;
        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER:-");
        a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:-");
        b=sc.nextInt();
        c=a+b;
        System.out.println("ADDITION OF TWO NUMBER IS:-"+c);
    }
 }