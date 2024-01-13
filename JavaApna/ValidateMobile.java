import java.io.*;
import java.util.*;

public class ValidateMobile
{
    public static void main(String args[])throws IOException
    {
        String s1;
        int i,n;
        char ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter mobile no:-");
        s1=br.readLine();

        n=s1.length();
        if(n<=10)
        {
            System.out.println("Length of mobile no .must be 10");
        }
        for(i=0;i<n;i++)
        {
            ch=s1.charAt(i);
        
            if(Character. isLetter(ch))
            {
                System.out.println("Alphabets are not allowed in mobile no");
                break;
            }
        }
    }
}