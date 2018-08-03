package isoccer;


public class Medico extends Funcionario {

    private String CRM;

    public  Medico(String nome, String email, String CPF, String telefone, double salario, String CRM){
        super(nome, email, CPF, telefone, salario);
        this.CRM = CRM;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nCPF: " + getCPF() + "\nTelefone: "+
                getTelefone() + "\nSalario: " + getSalario() + "\nCRM: " + getCRM() + "\n";
    }
}
