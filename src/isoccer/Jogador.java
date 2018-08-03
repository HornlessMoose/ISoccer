package isoccer;


public class Jogador extends Funcionario {

    String tipoJogador;
    boolean apto;

    public Jogador(String nome, String email, String CPF, String telefone, double salario, boolean apto, String tipoJogador) {
        super(nome, email, CPF, telefone, salario);
        this.apto = apto;
        this.tipoJogador = tipoJogador;
    }

    public boolean isApto() {
        return apto;
    }

    public String getTipoJogador() {
        return tipoJogador;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public void setTipoJogador(String tipoJogador) {
        this.tipoJogador = tipoJogador;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: "+ getEmail() + "\nCPF: " + getCPF() +
                "\nSalario: " + getSalario() + ", \nTelefone: "
                + getTelefone() + "\nTipo Jogador: " + getTipoJogador() + "\n";
    }
}
