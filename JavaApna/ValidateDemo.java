import java.io.*;

public class ValidateDemo
{
 public static void main(String args[])throws IOException
{
  char ch;
  String s1;
  int i,n,lcnt=0,ucnt=0,wcnt=0,dcnt=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  System.out.println("Enter password:-");
  s1=br.readLine();

  n=s1.length();
  for(i=0;i<n;i++)
  {
    ch=s1.charAt(i);
    if(Character.isUpperCase(ch))
    {
      ucnt++;
    }
     else
     {
      if(Character.isLowerCase(ch))
     {
      lcnt++;
     }
      else
     {
      if(Character.isWhitespace(ch))
     {
      wcnt++;
     }
     else
      {
      if(Character.isDigit(ch))
     {
      dcnt++;
     }
    }
 }
     }
  }
System.out.println("No of uppercase character are:-"+ucnt);
System.out.println("No of lowercase character are:-"+lcnt);
System.out.println("No of White space  are:-"+wcnt);
System.out.println("No of digit are:-"+dcnt);
}
  }






 
  