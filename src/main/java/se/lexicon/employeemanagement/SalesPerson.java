//package se.lexicon.data;
package se.lexicon.employeemanagement;

import java.util.Arrays;

public class SalesPerson extends Employee{
    private String[] clients;
    private int acquiredClients;

    public SalesPerson(String name,String[] clients,int acquiredClients){
        super(name,25000);
        this.clients=clients;
        this.acquiredClients=acquiredClients;
        calculateSalary();
    }

    public String[] getClients() {
        return Arrays.copyOf(clients,clients.length);
    }

    public void setClients(String[] clients) {
        this.clients = clients;
        calculateSalary();
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }
    public void calculateSalary(){
        super.calculateSalary();
        super.salary+=(clients.length*500)+(acquiredClients*1000);
    }
    public String toString(){
        return super.toString()+ "\nClients Maintained: "+ Arrays.toString(clients) + "\nClients Acquired: "+ acquiredClients;
    }
}
