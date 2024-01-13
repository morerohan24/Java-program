import java.io.*;
import java.util.*;

public class Employee{
    public  int eid;
    public String ename,edesignation;
    public double esalary;
    Scanner sc =new Scanner(System.in);

    void eaccept() throws IOException
    {
        System.out.println("enter the employee id:-");
        eid=sc.nextInt();
        System.out.println("enter the employee name:-");
        ename=sc.next();
        System.out.println("enter the designation:-");
        edesignation=sc.next();
        System.out.println("enter the employee salary:-");
        esalary=sc.nextDouble();       
    }

    void edisplay()
    {
        System.out.println("the employee id:-"+eid);
        System.out.println(" the employee name:-"+ename);
        System.out.println(" the designation:-"+edesignation);
        System.out.println(" the employee salary:-"+esalary);

    }
    Employee e1=new Employee;
    e1.eaccept();
    e1.edisplay();

    Employee e2=new Employee;
    e2.eaccept();
    e2.edisplay();

}