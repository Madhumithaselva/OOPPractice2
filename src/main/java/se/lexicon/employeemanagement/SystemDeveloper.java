package se.lexicon.employeemanagement;

public class SystemDeveloper extends Employee{
    private String[] certificates;
    private String[] languages;

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(java.lang.String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(java.lang.String[] languages) {
        this.languages = languages;
    }
    public void calculateSalary(){

    }
    public String toString(){
        return "True";

    }
}
