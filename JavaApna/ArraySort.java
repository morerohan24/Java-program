import java.io.*;
import java.util.*;
public class ArraySort
{
    public static void main(String args[]) throws IOException
    {
        int a[]=new int[100];
        int i,n,temp,pass;

        Scanner sc=new Scanner(System.in);

        System.out.println("how many no.s:-");
        n=sc.nextInt();
        System.out.println("Accept no.s:-");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display no.s:-");
        for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
        System.out.println("Sorted no.s are:-");
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(a[i]>a[i+1])
                {
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
    }
}