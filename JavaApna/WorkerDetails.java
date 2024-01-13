import java.io.*;
import java.util.*;

 class Worker 
{
   public String name,address;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void waccept()
   {
     System.out.println("Enter worker name and address:-");
     name=br.readline();
     address=br.readline();
    }

   public void wdisplay()
  {
    System.out.println("Worker name:-"+name+"Address is:-"+address);
  }
}
 class FullTimeWorker extends Worker 
{
   public String department;
   public double salary;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

   public void faccept() throws IOException
   {
     waccept();
     System.out.println("Enter worker department and salery:-");
     department=br.readline();
     salary=Double.parseDouble(br.readline());
    }
    public void fdisplay()
  {
    wdisplay();
    System.out.println("Worker department:-"+department+"salary is:-"+salary);
  }
}
 class PartTimeWorker extends Worker 
{
  public int noofhour;
  public double rateperhour,salary;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void paccept() throws IOException
   {
     waccept();
     System.out.println("Enter worker no of hour and rate per hour:-");
     noofhour=Integer.parseInt(br.readlinr());
    rateperhour=Double.parseDouble(br.readline());
    }
     public void calc_salary()
  {
    salary=noofhour*rateperhour;
    System.out.println("part time worker salary is :-"+salary);
  }
  public void pdisplay()
  {
    wdisplay();
    System.out.println("Worker no of hour:-"+noofhour+"rate per hour is:-"+rateperhour);
  }
  
}


public class WorkerDetails
{
  public static void main(String[] args)throws IOException
  {
    FullTimeWorker f1=new FullTimeWorker();
    f1.faccept();
    f1.fdisplay();
    PartTimeWorker p1=new FullTimeWorker();
    p1.paccept();
    p1.pdisplay();
    p1.calc_salary();

  }
}  