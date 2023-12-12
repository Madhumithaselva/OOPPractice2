package se.lexicon.employeemanagement;

public class SystemDeveloper extends Employee{
    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(String name,String[] certificates,String[] languages){
        super(name);
        this.certificates=certificates;
        this.languages=languages;
        calculateSalary();
    }

   /* public String[] getCertificates() {
        return certificates;
    }*/


   /* public String[] getLanguages() {
        return languages;
    }*/

    /*public void setLanguages(String[] languages) {
        this.languages = languages;
        System.out.println("Lenght of language array"+languages.length);
        calculateSalary();
    }*/
    public void calculateSalary(){
        super.calculateSalary();
        this.salary=this.salary+(certificates.length*1000)+(languages.length*1500);
    }
    public String toString(){
        super.toString();
        return "Salary of System Developer is "+this.salary;

    }
}
