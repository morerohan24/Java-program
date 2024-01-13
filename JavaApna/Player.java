import java.io.*;
import java.util.*;
public class Player
{
    public static void main(String args[])throws IOException
    {
        String names[],temp;
        int i,n,pass;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("how many names:-");
        n=Integer.parseInt(br.readLine());

        names=new String[n];

        System.out.println("Accept names of player:-");
        for(i=0;i<n;i++)
        {
            names[i]=br.readLine();
        }
        System.out.println("Display names of player:-");
        for(i=0;i<n;i++)
        {
            System.out.println(""+names[i]);           
        }
        System.out.println("Sorted names are:-");
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(names[i].compareTo(names[1+1])<0)
                {
                    temp=names[i];
                    names[i]=names[i+1];
                    names[i+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(""+names[i]);
        }
    }

}