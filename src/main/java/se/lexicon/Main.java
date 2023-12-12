package se.lexicon;
import se.lexicon.employeemanagement.Employee;
import se.lexicon.employeemanagement.SalesPerson;
import se.lexicon.employeemanagement.SystemDeveloper;

import java.lang.Object;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        //Object created for Employee class
        Employee emp1=new Employee("Madhu",25000);

        //Assign values to the certification array and language array
        String[] certificateArray = {"Java Certification", "Python Certification"};
        String[] languageArray = {"JAVA", "Python"};

        //Object created for SystemDeveloper sub class
        SystemDeveloper developer1=new SystemDeveloper("Madhu",certificateArray,languageArray);

        //Print System Developer information
        System.out.println("System Developer Info:"+developer1);

        //Assign values to the clientArray
        String[] clientArray={"AFRY","Lexicon"};

        //Create object for SalesPerson sub class
        SalesPerson salesRep1=new SalesPerson("John",clientArray,3);

        //Display SalesPerson information
        System.out.println("Sales Person Info:"+salesRep1);



    }
}