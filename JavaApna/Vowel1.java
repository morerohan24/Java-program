import java.util.*;
import java.io.*;


public class Vowel1 {

	public static void main(String[] args)throws IOException {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Chracter to check");
		ch= sc.next().charAt(0); 

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
        	System.out.println(ch + " is vowel");
        }
        else 
        {
        	System.out.println(ch+ " is consonant");
        }
	}

}

@
A


b