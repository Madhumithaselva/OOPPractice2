package se.lexicon.employeemanagement;
import java.lang.Object;
import java.lang.String;
import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    public double salary;
    private LocalDate dateHired;
    private static final double baseSalary=25000.00;

    public Employee(String name,double salary) {
        this.name=name;
        this.salary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = baseSalary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
    public void calculateSalary(){
        this.salary=baseSalary;
    }
    public String toString(){

        return "Name of the Employee: "+name +"\nBase salary of the Employee:"+baseSalary+ "\nCurrent Salary:"+salary;
    }
}
