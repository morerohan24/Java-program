import java.io.*;

public class ValidateEmail
{
    public static void main(String args[])throws IOException
    {
        String s1;
        int i,n,cnt1=0,cnt2=0;
        char ch;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter email address:-");
        s1=br.readLine();

        //n=s1.length();

        for(i=0;i<n;i++)
        {
            ch=s1.charAt(i);

            if(ch=='@')
            {
                cnt1++;
            }
            if(ch=='.')
            {
                cnt2++;
            }

            if(cnt1==1)
            {
                System.out.println("@symbol exits");
            }
            else
            {
                System.out.println("@ symbol not Exits");
            }
            if(cnt2!=0)
            {
                System.out.println(".symbol exits");
            }
            else
            {
                System.out.println(" . symbol not Exits");
            }
        }
    }
}