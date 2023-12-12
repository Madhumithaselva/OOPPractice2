package se.lexicon.employeemanagement;

public class SalesPerson extends Employee{
    private String[] clients;
    private int aquiredClients;

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }
    public void calculateSalary(){

    }
    public String toString(){
        return "true";
    }
}
