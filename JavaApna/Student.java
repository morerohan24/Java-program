import  java.util.*;
import java.io.*;

public class Student
{
     public int rollno;
     public String sname,scourse;
     public double sfees;

     public static void main(String args[]) throws IOException
     {
        Student s1=new Student();

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the student rollno:-");
        System.out.println("enter the student name:-");
        System.out.println("enter the student course:-");
        System.out.println("enter the student fees:-");

        s1.rollno=sc.nextInt();
        s1.sname=sc.next();
        s1.scourse=sc.next();
        s1.sfees=sc.nextDouble();

        System.out.println("Student roll no is:- \n"+s1.rollno);
        System.out.println("student name:\n-"+s1.sname);
        System.out.println("student course:-\n"+s1.scourse);
        System.out.println(" the student fees:-\n"+s1.sfees);


     }
}