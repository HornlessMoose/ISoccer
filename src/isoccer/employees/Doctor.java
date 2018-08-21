package isoccer.employees;


public class Doctor extends Employee {

    private String CRM;

    public  Doctor(String name, String email, String CPF, String cellphone, double salary, String CRM){
        super(name, email, CPF, cellphone, salary);
        this.CRM = CRM;
    }

    public String getCRM() {
        return CRM;
    }


    @Override
    public String toString() {
        return super.toString() + "CRM: " + getCRM() + "\n";
    }
}
