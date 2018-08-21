package isoccer.employees;


public class Driver extends Employee {
    private String CNH;

    public Driver(String name, String email, String CPF, String cellphone, double salary, String CNH){
        super(name, email, CPF, cellphone, salary);
        this.CNH = CNH;
    }

    public String getCNH() {
        return CNH;
    }


    @Override
    public String toString() {
        return super.toString() + "CNH: " + getCNH() + "\n";
    }
}