import java.io.*;
import java.util.*;

public class  ValidateGender
{
    public static void main(String args[])throws IOException
    {
        String gender;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your gender, male of female or other?");
        gender = scan.nextLine();


        if( gender == "f"||gender =="F"||gender =="female"||gender 
            =="Female"||gender =="FEMALE")
        {
            System.out.println("A female" );
        }
        if( gender == "m"||gender =="M"||gender =="male"||gender 
            =="Male"||gender =="MALE")
        {
            System.out.println("A male.");
        }
        if( gender == "o"||gender =="O"||gender =="other"||gender 
            =="Other"||gender =="other")
        {
            System.out.println("A other.");
        }
    }
}