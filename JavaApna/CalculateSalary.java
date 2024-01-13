/*  Write a java program to take Basic salary of employee from user and calculate gross
salary with given condition, if Basic salary >= 10000 then we calculate 40%
da and 30% ta of Basic salary otherwise 30% da and 20% ta of Basic salary.
  */
import java.util.*;
import java.io.*;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double da, ta;
        if (basicSalary >= 10000) {
            da = 0.4 * basicSalary;
            ta = 0.3 * basicSalary;
        } else {
            da = 0.3 * basicSalary;
            ta = 0.2 * basicSalary;
        }

        double grossSalary = basicSalary + da + ta;
        System.out.println("Gross Salary: " + grossSalary);

        
    }
}
