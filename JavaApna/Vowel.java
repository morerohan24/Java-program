// Write a program to calculate the number of vowels present in the string in java
import java.util.*;
import java.io.*;

public class  Vowel{

	public static void main(String[] args) {
		String s = "rohan sunil more";
		char[] c = s.toCharArray();
		int vowel=0;
		
		for (int i = 0; i < s.length(); i++) { 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("Vowels: " + vowel);
    }
}