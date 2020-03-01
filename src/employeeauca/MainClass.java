/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeauca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jackson
 */
public class MainClass {
    public static void main(String[]arg){
        int i=0,j=0,check=0;
        String firstName,lastName;
        double hourlyWage;
        int yearsWithInstitution,totEmployee=100;
        Scanner sc = new Scanner(System.in);
        List<EmployeeAUCA> employees = new ArrayList<EmployeeAUCA>();
        for(i=0;i<2;i++){
            System.out.println("RECORD EMPLOYEES:"+(i+1));
            System.out.println("enter firstname:");
            firstName=sc.next();
            System.out.println("enter lastname:");
            lastName=sc.next();
            System.out.println("enter hourlywage:");
            hourlyWage=sc.nextDouble();   
            System.out.println("enter yearsWithInstitution:");
            yearsWithInstitution=sc.nextInt();
           EmployeeAUCA employee = new EmployeeAUCA(firstName,lastName,hourlyWage,yearsWithInstitution);
           employees .add(employee);
           System.out.println("=========================================");
        }
        System.out.println("EMPLOYEE LIST WITH IN MORE THAN TWO YEARS IN AUCA");
        //PRINT EMPLOYEE FROM LIST
        for(EmployeeAUCA emp:employees){
            if(emp.getYear()>=2){
                check=1;
                System.out.println("EMPLOYEE:"+(++j));
                System.out.println("FirstName:"+emp.getFname());
                System.out.println("LastName:"+emp.getLname());
                System.out.println("HourlyWage:"+emp.getWage());
                System.out.println("YearsWithInstitution:"+emp.getYear());
                System.out.println("==============================================");
            }
        }
        if(check==0){
          System.out.println("all employees have been working less than two years");  
        
        
      }
        
        
    }
}
