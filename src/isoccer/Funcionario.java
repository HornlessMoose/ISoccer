package isoccer;

public class Funcionario {

    private String nome, email, CPF, telefone;
    private double salario;

    public Funcionario(String nome, String email, String CPF, String telefone, double salario){
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.telefone = telefone;
        this.salario = salario;
    }



    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nCPF: " + getCPF() + "\nTelefone: "+
                getTelefone() + "\nSalario: " + getSalario() + "\n";
    }
}
