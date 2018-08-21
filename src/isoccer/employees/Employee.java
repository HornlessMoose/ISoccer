package isoccer.employees;

public class Employee {

    private String name, email, CPF, cellphone;
    private double salary;

    public Employee(String name, String email, String CPF, String cellphone, double salary){
        this.name = name;
        this.email = email;
        this.CPF = CPF;
        this.cellphone = cellphone;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCellphone() {
        return cellphone;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\nEmail: " + getEmail() + "\nCPF: " + getCPF() + "\nTelefone: "+
                getCellphone() + "\nSalario: " + getSalary() + "\n";
    }
}
