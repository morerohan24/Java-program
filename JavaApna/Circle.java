import java.util.*;
import java.io.*;

public class Circle
{
    public static void main(String args[])throws IOException
    {
       double r,pi,ac;
       Scanner sc=new Scanner(System.in);
       pi=3.142;

       System.out.println("enter radius");
       r=sc.nextDouble();

       ac=pi*r*r;

       System.out.println("Area of circle is:- "+ac);
    }
}