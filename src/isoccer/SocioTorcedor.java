package isoccer;

public class SocioTorcedor {


    private String nome, email, endereco, estadoPagamento, plano, CPF, telefone;
    private double valorAtribuicao;



    public SocioTorcedor(String nome, String email, String endereco, String estadoPagamento,
                         String CPF, String telefone, double valorAtribuicao, String plano){

        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.estadoPagamento = estadoPagamento;
        this.CPF = CPF;
        this.telefone = telefone;
        this.valorAtribuicao = valorAtribuicao;
        this.plano = plano;

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

    public String getEndereco() {
        return endereco;
    }

    public String getEstadoPagamento() {
        return estadoPagamento;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(double valorAtribuicao) {

        if(valorAtribuicao <= 40.00){
            this.plano = "Júnio";
        }

        else if(valorAtribuicao <= 75.00){
            this.plano = "Sênior";
        }

        else if(valorAtribuicao > 75.00){
            this.plano = "Elite";
        }

        else{
            System.out.println("Valores negativo não são aceitos");
        }


    }

    public void setValorAtribuicao(double valorAtribuicao) {
        this.valorAtribuicao  = valorAtribuicao;
    }

    public void setEstadoPagamento(String estadoPagamento) {
        this.estadoPagamento = estadoPagamento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nCPF: " +  getCPF() +
                "\nEndereco: " + getEndereco() + "\nEstado Pagamento: " + getEstadoPagamento()
                +"\nTelefone: " + getTelefone() + "\n";
    }
}
