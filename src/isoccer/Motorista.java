package isoccer;


public class Motorista extends Funcionario {
    private String CNH;

    public Motorista(String nome, String email, String CPF, String telefone, double salario, String CNH) {
        super(nome, email, CPF, telefone, salario);
        this.CNH = CNH;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nCPF: " + getCPF() + "\nTelefone: "+
                getTelefone() + "\nSalario: " + getSalario() + "\nCNH: " + getCNH() + "\n";
    }
}