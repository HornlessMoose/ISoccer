package isoccer;

import java.util.ArrayList;
import java.util.Scanner;


public class Administrador {
    private Scanner input = new Scanner(System.in);

    private String login, senha, nome, email, CRM, CNH, tipoJogador, endereco, estadoPagamento, plano, CPF, telefone;

    private double salario, valorAtribuicao;
    boolean apto;

    private Presidente presidente;

    private Tecnico tecnico;
    private Funcionario funcionario;

    private ArrayList<Medico> medico = new ArrayList<Medico>();
    private ArrayList<PreparadorFisico> preparadorFisico = new ArrayList<PreparadorFisico>();
    private ArrayList<Motorista> motorista = new ArrayList<Motorista>();
    private ArrayList<Cozinheiro> cozinheiro = new ArrayList<Cozinheiro>();
    private ArrayList<Advogado> advogado = new ArrayList<Advogado>();
    private ArrayList<Jogador> jogador = new ArrayList<Jogador>();
    private ArrayList<SocioTorcedor> socioTorcedor = new ArrayList<SocioTorcedor>();

    private ArrayList<Onibus> onibus = new ArrayList<Onibus>();
    private Estadio estadio;
    private CentroTreinamento centroTreinamento;

    public Administrador(String login, String senha){
        this.login = login;
        this.senha = senha;

    }

    public boolean validarAdmin(String login, String senha){

        return login.equals(this.login) && senha.equals(this.senha);
    }

    public Funcionario addFuncionario(){

        System.out.print("Nome: ");
        nome = input.nextLine();

        System.out.print("Email: ");
        email = input.nextLine();

        System.out.print("CPF: ");
        CPF = input.nextLine();

        System.out.print("Telefone: ");
        telefone = input.nextLine();

        System.out.print("Salario: ");
        salario = Double.parseDouble(input.nextLine());

        funcionario = new Funcionario(nome, email, CPF, telefone, salario);

        return funcionario;


    }

    public void addPresidente(){
        System.out.println("Adicionando Presidente");

        funcionario = addFuncionario();

        this.presidente = new Presidente(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario());

        System.out.println("Presidente Adicionado");


    }

    public void addMedico(){
        System.out.println("Adicionando Médico");
        funcionario = addFuncionario();

        System.out.print("CRM: ");
        CRM = input.nextLine();

        this.medico.add(new Medico(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario(), CRM));

        System.out.println("Médico Adicionado");

    }

    public void addTecnico(){
        System.out.println("Adicionando Técnico");
        funcionario = addFuncionario();

        this.tecnico = new Tecnico(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario());

        System.out.println("Técnico Adicionado");

    }

    public void addPreparadorFisico(){
        System.out.println("Adicionando Preparador Físico");
        funcionario = addFuncionario();

        this.preparadorFisico.add(new PreparadorFisico(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario()));

        System.out.println("Prepador Físico Adicionado");

    }

    public void addMotorista(){
        System.out.println("Adicionando Motorista");
        funcionario = addFuncionario();

        System.out.print("CNH: ");
        CNH = input.nextLine();

        this.motorista.add(new Motorista(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario(), CNH));

        System.out.println("Motorista Adicionado");
    }

    public void addAdvogado(){
        System.out.println("Adicionando Advogado");
        funcionario = addFuncionario();

        this.advogado.add(new Advogado(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario()));

        System.out.println("Advogado Adicionado");

    }

    public void addCozinheiro(){
        System.out.println("Adicionando Cozinheiro");
        funcionario = addFuncionario();

        this.cozinheiro.add(new Cozinheiro(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario()));

        System.out.println("Cozinheiro Adicionado");

    }

    public void addJogador(){
        System.out.println("Adicionando Jogador");
        funcionario = addFuncionario();

        apto = true;

        System.out.print("Tipo Jogador: ");
        tipoJogador = input.nextLine();


        this.jogador.add(new Jogador(funcionario.getNome(), funcionario.getEmail(), funcionario.getCPF()
                , funcionario.getTelefone(), funcionario.getSalario(), apto, tipoJogador));

        System.out.println("Jogador Adicionado");

    }

    public Presidente getPresidente() {
        return presidente;
    }

    public ArrayList<Medico> getMedico() {
        return medico;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public ArrayList<PreparadorFisico> getPreparadorFisico() {
        return preparadorFisico;
    }

    public ArrayList<Motorista> getMotorista() {
        return motorista;
    }

    public ArrayList<Advogado> getAdvogado() {
        return advogado;
    }

    public ArrayList<Cozinheiro> getCozinheiro() {
        return cozinheiro;
    }

    public ArrayList<Jogador> getJogador() {
        return jogador;
    }

    public ArrayList<SocioTorcedor> getSocioTorcedor() {
        return socioTorcedor;
    }

    public String getPlano(double valorAtribuicao) {

        if(valorAtribuicao <= 40.00){
            return "Júnio";
        }

        else if(valorAtribuicao <= 75.00){
            return "Sênior";
        }

        return "Elite";


    }

    public void addSocioTorcedor(){


        System.out.println("Adicionando Socio Torcedor");

        System.out.print("Nome: ");
        nome = input.nextLine();

        System.out.print("Email: ");
        email = input.nextLine();

        System.out.print("Endereco: ");
        endereco = input.nextLine();

        System.out.print("CPF: ");
        CPF = input.nextLine();

        System.out.print("Telefone: ");
        telefone = input.nextLine();

        System.out.print("Valor Atribuição: ");
        valorAtribuicao = Double.parseDouble(input.nextLine());




        this.socioTorcedor.add( new SocioTorcedor(nome, email, endereco, "Adimplente", CPF, telefone,
                valorAtribuicao, getPlano(valorAtribuicao)));


    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public CentroTreinamento getCentroTreinamento() {
        return centroTreinamento;
    }

    public void addOnibus(){
        int qntdAssentos, arCondicionado, qntdTV;
        String possuiB, possuiF;

        System.out.println("Adicionando Onibus");

        System.out.println("Quantidade Assentos: ");
        qntdAssentos = Integer.parseInt(input.nextLine());

        System.out.println("Ar Condicionados: ");
        arCondicionado = Integer.parseInt(input.nextLine());

        System.out.println("Quantidade TVs: ");
        qntdTV = Integer.parseInt(input.nextLine());

        System.out.println("Banheiro(Sim, Não): ");
        possuiB = input.nextLine().toUpperCase();

        System.out.println("Frigobar(Sim, Não:: ");
        possuiF = input.nextLine().toUpperCase();

        this.onibus.add(new Onibus(qntdAssentos, arCondicionado, qntdTV, (possuiB.equals("SIM")), (possuiF.equals("SIM"))));

        System.out.println("Onibus Adicionado");


    }

    public void addEstadio(){
        int torcedoresSuportados, qntdBanheiros, qntdLanchonetes;

        System.out.println("Adicionando Estadio");

        System.out.println("Torcedores Suportados: ");
        torcedoresSuportados = Integer.parseInt(input.nextLine());

        System.out.println("Quantidade Banheiros: ");
        qntdBanheiros = Integer.parseInt(input.nextLine());

        System.out.println("Quantidade Lanchonetes: ");
        qntdLanchonetes = Integer.parseInt(input.nextLine());

        this.estadio = new Estadio(torcedoresSuportados, qntdBanheiros, qntdLanchonetes);

        System.out.println("Estadio Adicionado");
    }

    public void addCentroTreinamento(){
        int dormitorios;

        System.out.println("Adicionando Centro Treinamento: ");

        System.out.println("Dormitorios: ");
        dormitorios = Integer.parseInt(input.nextLine());

        this.centroTreinamento = new CentroTreinamento(dormitorios);

        System.out.println("Centro Treinamento Adicionado");
    }

}
