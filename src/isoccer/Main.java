package isoccer;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Administrador admin = new Administrador("moose", "1755913");
    private static int opcao;
    private static String buscar, estadoPagamento;

    public static void main(String[] args) {


        loginMenu();
    }

    private static void loginMenu(){
        String login, senha;

        try {

            System.out.println("\n LOGIN MENU\n");

            System.out.println("1: Fazer login como administrador\n2: Sair");
            opcao = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro\n");
            loginMenu();
        }
        finally {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o login e senha do administrador");
                    login = input.nextLine();
                    senha = input.nextLine();

                    if (admin.validarAdmin(login, senha)) {
                        adminMenu();
                    } else {
                        System.out.println("Login ou senha incorreto.");
                    }

                    loginMenu();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida");
                    loginMenu();

            }
        }



    }

    private static void adminMenu(){

        try {
            System.out.println("\n ADMINISTRADOR MENU\n");
            System.out.println("1: Adicionar Funcionarios\n2: Gerenciar Socio Torcedor\n" +
                    "3: Gerenciar Recursos\n4: Solicitar Relatório\n5: Voltar");

            opcao = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            adminMenu();
        }finally {
            switch (opcao) {

                case 1:
                    addFuncionario();
                    adminMenu();
                    break;
                case 2:
                    gerenciarSocioTorcedor();
                    adminMenu();
                    break;
                case 3:
                    gerenciarRecursos();
                    adminMenu();
                    break;
                case 4:
                    mostrarRelatorio();
                    adminMenu();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    adminMenu();
            }
        }

    }

    private static void gerenciarRecursos() {

        try {
            System.out.println("\n GERENCIAR RECURSOS\n");
            System.out.println("1: Gerenciar Onibus\n2: Gerenciar Estádio\n3: Gerenciar Centro Treinamento\n4: Voltar");

            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            gerenciarRecursos();
        }finally {
            switch (opcao) {
                case 1:
                    gerenciarOnibus();
                    gerenciarRecursos();
                    break;
                case 2:
                    gerenciarEstadio();
                    gerenciarRecursos();
                    break;
                case 3:
                    gerenciarCentroTreinamento();
                    gerenciarRecursos();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    gerenciarRecursos();

            }
        }
    }

    private static void gerenciarCentroTreinamento() {

        try {
            System.out.println("\n GERENCIAR CENTRO TREINAMENTO\n");
            System.out.println("1: Adicionar Centro Treinamento\n2: Disponibilidade\n3: Quantidade Dormitórios\n4: Voltar");

            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            gerenciarCentroTreinamento();
        }finally {
            switch (opcao) {
                case 1:
                    if (admin.getCentroTreinamento() == null) {
                        admin.addCentroTreinamento();
                    } else {
                        System.out.println("Centro Treinamento já adicionado.");
                    }
                    gerenciarCentroTreinamento();
                    break;
                case 2:
                    centroTreinamentoDisponivel();
                    gerenciarCentroTreinamento();
                    break;
                case 3:
                    if (admin.getCentroTreinamento() != null) {
                        System.out.println("Existem" + admin.getCentroTreinamento().getDormitorios() + "Dormitórios");
                    } else {
                        System.out.println("O time não possui centro de treinamento.");
                    }
                    gerenciarCentroTreinamento();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    gerenciarCentroTreinamento();

            }
        }
    }

    private static void centroTreinamentoDisponivel() {
        if(admin.getCentroTreinamento() == null){
            System.out.println("Centro Treinamento não disponível");
        }
        else{
            System.out.println("Centro Treinamento disponível");
        }
    }

    private static void gerenciarEstadio() {

        try {
            System.out.println("\n GERENCIAR ESTÁDIO\n");
            System.out.println("1: Adicionar Estádio\n2: Disponibilidade\n3: Administrar Estádio\n4: Voltar");

            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            gerenciarEstadio();
        }finally {
            switch (opcao) {
                case 1:
                    if (admin.getEstadio() == null) {
                        admin.addEstadio();
                    } else {
                        System.out.println("Estadio já adicionado.");
                    }
                    gerenciarEstadio();
                    break;
                case 2:
                    estadioDisponivel();
                    gerenciarEstadio();
                    break;
                case 3:
                    administrarEstadio();
                    gerenciarEstadio();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    gerenciarEstadio();
            }
        }
    }

    private static void administrarEstadio() {

        try {
            System.out.println("\n ADMINISTRAR ESTÁDIO\n");
            System.out.println("1: Torcedores Suportados\n2: Quantidade Banheiros\n3: Quantidade Lanchonetes\n4: Voltar");

            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            administrarEstadio();
        }finally {
            switch (opcao) {
                case 1:
                    if (admin.getEstadio() != null) {
                        System.out.print("Nova Quantidade de torcedores suportados: ");
                        admin.getEstadio().setTorcedoresSuportados(Integer.parseInt(input.nextLine()));
                    } else {
                        System.out.println("O time não possui estádio.");
                    }
                    administrarEstadio();
                    break;
                case 2:
                    if (admin.getEstadio() != null) {
                        System.out.print("Nova Quantidade de banheiros: ");
                        admin.getEstadio().setQntdBanheiros(Integer.parseInt(input.nextLine()));
                    } else {
                        System.out.println("O time não possui estádio.");
                    }
                    administrarEstadio();
                    break;
                case 3:
                    if (admin.getEstadio() != null) {
                        System.out.print("Nova Quantidade de lanchonetes: ");
                        admin.getEstadio().setQntdLanchonetes(Integer.parseInt(input.nextLine()));
                    } else {
                        System.out.println("O time não possui estádio.");
                    }
                    administrarEstadio();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    administrarEstadio();
            }
        }

    }

    private static void estadioDisponivel() {
        if(admin.getEstadio() == null){
            System.out.println("Estádio não disponível");
        }
        else{
            System.out.println("Estádio disponível");
        }

    }

    private static void gerenciarOnibus() {

        try {
            System.out.println("\n GERENCIAR ÔNIBUS\n");
            System.out.println("1: Adicionar Ônibus\n2: Disponibilidade\n3: Voltar");

            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            gerenciarOnibus();
        }finally {
            switch (opcao) {
                case 1:
                    admin.addOnibus();
                    gerenciarOnibus();
                    break;
                case 2:
                    onibusDisponivel();
                    gerenciarOnibus();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    gerenciarOnibus();

            }
        }

    }

    private static void onibusDisponivel() {

        if(admin.getOnibus().size()  ==  0){
            System.out.println("Ônibus não disponível");
        }
        else{
            System.out.println("Ônibus disponível");
        }
    }

    private static void gerenciarSocioTorcedor() {

        try {
            System.out.println("\n GERENCIAR SOCIO TORCEDOR\n");
            System.out.println("1: Adicionar Socio Torcedor\n2: Alterar estado pagamento\n" +
                    "3: Atualizar valor contribuição\n4: Sair");
            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            gerenciarSocioTorcedor();
        }finally {
            switch (opcao) {
                case 1:
                    admin.addSocioTorcedor();
                    gerenciarSocioTorcedor();
                    break;
                case 2:
                    alterarEstdPagamento();
                    gerenciarSocioTorcedor();
                    break;
                case 3:
                    alterarValorContribuicao();
                    gerenciarSocioTorcedor();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    gerenciarSocioTorcedor();
            }
        }
    }

    private static void alterarValorContribuicao() {
        if(admin.getSocioTorcedor() != null) {
            System.out.println("Informe o CPF do Socio Torcedor");

            buscar = input.nextLine();
            double novoValor;

            for (SocioTorcedor socioTorcedor : admin.getSocioTorcedor()) {
                if (socioTorcedor.getCPF().equals(buscar)) {

                    while(true) {

                        try {
                            System.out.println("Digite o novo valor de contribuição para o Socio Torcedor");
                            novoValor = Double.parseDouble(input.nextLine());
                            break;
                        } catch (NumberFormatException nmr) {
                            System.out.println("Deve ser informado um valor double");
                        }
                    }

                    socioTorcedor.setValorAtribuicao(novoValor);
                    socioTorcedor.setPlano(novoValor);
                    return;
                }
            }
            System.out.println("Socio Torcedor não encontrado.");
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    private static void alterarEstdPagamento() {

        if(admin.getSocioTorcedor().size() != 0) {
            System.out.println("Informe o CPF do Socio Torcedor");

            buscar = input.nextLine();

            for (SocioTorcedor socioTorcedor : admin.getSocioTorcedor()) {
                if (socioTorcedor.getCPF().equals(buscar)) {
                    System.out.println("Digite o novo estado de pagamento para o Socio Torcedor(Adimplente, Inadimplente)");
                    while(true){
                        estadoPagamento = input.nextLine();

                        if(estadoPagamento.toUpperCase().equals("ADIMPLENTE") ||
                                estadoPagamento.toUpperCase().equals("INADIMPLENTE")){
                            break;
                        }
                        else{
                            System.out.println("Informe o novo estado de pagamento corretamente(Adimplente, Inadimplente");
                        }
                    }

                    socioTorcedor.setEstadoPagamento(estadoPagamento);
                    return;
                }
            }
            System.out.println("Socio Torcedor não encontrado.");
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    private static void mostrarRelatorio() {

        try {
            System.out.println("\n MOSTRAR RELATÓRIO\n");
            System.out.println("1: Funcionários\n2: Recursos Fisicos\n3: Sócio Torcedor\n4: Voltar");
            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            mostrarRelatorio();
        }finally {
            switch (opcao) {
                case 1:
                    mostrarFuncionarios();
                    mostrarRelatorio();
                    break;
                case 2:
                    mostrarRecursosFisicos();
                    mostrarRelatorio();
                    break;
                case 3:
                    mostrarSocioTorcedor();
                    mostrarRelatorio();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    mostrarRelatorio();

            }
        }
    }

    private static void mostrarSocioTorcedor() {

        try {
            System.out.println("\n MOSTRAR SOCIO TORCEDOR\n");
            System.out.println("1: Quantidade\n2: Adimplentes\n3: Inadimplentes\n4: Lista Dados Individuais\n5: Voltar");
            opcao = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            mostrarSocioTorcedor();
        }finally {
            switch (opcao) {
                case 1:
                    if (admin.getSocioTorcedor().size() != 0) {
                        System.out.println("Existem " + admin.getSocioTorcedor().size() + " Sócios Torcedores");
                    } else {
                        System.out.println("O time não possui socios.");
                    }

                    mostrarSocioTorcedor();
                    break;
                case 2:
                    mostrarAdimplentes();
                    mostrarSocioTorcedor();
                    break;
                case 3:
                    mostrarInadimplentes();
                    mostrarSocioTorcedor();
                    break;
                case 4:
                    mostrarListaDadosIndividuais();
                    mostrarSocioTorcedor();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    mostrarSocioTorcedor();

            }
        }
    }

    private static void mostrarListaDadosIndividuais() {

        if(admin.getSocioTorcedor().size() != 0) {
            System.out.println("Lista Socios Torcedores dados individuais:");

            for (SocioTorcedor socioTorcedor : admin.getSocioTorcedor()) {
                System.out.println(socioTorcedor.toString());

            }
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    private static void mostrarInadimplentes() {

        if(admin.getSocioTorcedor().size() != 0) {
            System.out.println("Socios Torcedores Inadimplentes:");

            for (SocioTorcedor socioTorcedor : admin.getSocioTorcedor()) {

                if (socioTorcedor.getEstadoPagamento().toUpperCase().equals("INADIMPLENTE")) {
                    System.out.println(socioTorcedor.toString());
                }

            }
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    private static void mostrarAdimplentes() {

        if(admin.getSocioTorcedor().size() != 0) {
            System.out.println("Socios Torcedores Adimplentes:");

            for (SocioTorcedor socioTorcedor : admin.getSocioTorcedor()) {

                if (socioTorcedor.getEstadoPagamento().toUpperCase().equals("ADIMPLENTE")) {
                    System.out.println(socioTorcedor.toString());
                }

            }
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    private static void mostrarRecursosFisicos() {

        try {
            System.out.println("\n MOSTRAR RECURSOS FÍSICOS\n");
            System.out.println("1: Transporte\n2: Centro Treinamento\n3: Estadio\n4: Voltar");
            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            mostrarRecursosFisicos();
        }finally {
            switch (opcao) {
                case 1:
                    mostrarTransporte();
                    mostrarRecursosFisicos();
                    break;
                case 2:
                    mostrarCentroTreinamento();
                    mostrarRecursosFisicos();
                    break;
                case 3:
                    mostrarEstadio();
                    mostrarRecursosFisicos();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    mostrarRecursosFisicos();

            }
        }
    }

    private static void mostrarEstadio() {

        if(admin.getEstadio() != null) {
            System.out.println("Estadio: ");

            System.out.println(admin.getEstadio().toString() + "\n");
        }
        else{
            System.out.println("O time não possui estádio.");
        }
    }

    private static void mostrarCentroTreinamento() {
        if(admin.getCentroTreinamento() != null) {
            System.out.println("Centro Treinamento: ");

            System.out.println(admin.getCentroTreinamento().toString() + "\n");
        }
        else{
            System.out.println("O time não possui centro de treinamento.");
        }
    }

    private static void mostrarTransporte() {

        if(admin.getOnibus() != null) {
            System.out.println("Onibus: ");

            for (Onibus onibus : admin.getOnibus()) {
                System.out.println(onibus.toString() + "\n");

            }
        }
        else{
            System.out.println("O time não possui ônibus.");
        }
    }

    private static void mostrarFuncionarios() {

        try {
            System.out.println("\n MOSTRAR FUNCIONÁRIO\n");
            System.out.println("1: Time\n2: Serviços Gerais\n3: Voltar");
            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            mostrarFuncionarios();
        }finally {

            switch (opcao) {
                case 1:
                    mostrarTime();
                    mostrarFuncionarios();
                    break;
                case 2:
                    mostrarServicosGerais();
                    mostrarFuncionarios();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    mostrarFuncionarios();

            }
        }
    }

    private static void mostrarServicosGerais() {

        if(admin.getPresidente() != null) {
            System.out.println("Presidente:\n" + admin.getPresidente().toString());
        }
        else{
            System.out.println("O time não possui presidente.");
        }

        if(admin.getMedico().size() != 0) {
            System.out.println("Médicos:");

            for (Medico medico : admin.getMedico()) {
                System.out.println(medico.toString());

            }
        }
        else{
            System.out.println("O time não possui médicos.");
        }

        if(admin.getPreparadorFisico().size() != 0) {
            System.out.println("Preparadores Físicos:");

            for (PreparadorFisico preparadorFisico : admin.getPreparadorFisico()) {
                System.out.println(preparadorFisico.toString());

            }
        }
        else{
            System.out.println("O time não possui preparadores físico.");
        }

        if(admin.getMotorista().size() != 0) {
            System.out.println("Motoristas:");

            for (Motorista motorista : admin.getMotorista()) {
                System.out.println(motorista.toString());

            }
        }
        else{
            System.out.println("O time não possui motoristas.");
        }

        if(admin.getCozinheiro().size() != 0) {
            System.out.println("Cozinheiro:");

            for (Cozinheiro cozinheiro : admin.getCozinheiro()) {
                System.out.println(cozinheiro.toString());

            }
        }
        else{
            System.out.println("O time não possui cozinheiros.");
        }

        if(admin.getAdvogado().size() != 0) {
            System.out.println("Advogados:");

            for (Advogado advogado : admin.getAdvogado()) {
                System.out.println(advogado.toString());

            }
        }
        else{
            System.out.println("O time não possui advogados.");
        }


    }

    private static void mostrarTime() {

        try {
            System.out.println("\n MOSTRAR TIME\n");
            System.out.println("1: Treinador e Jogadores\n2: Jogadores Aptos e não Aptos\n3: Voltar");
            opcao = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            mostrarTime();
        }finally {
            switch (opcao) {
                case 1:
                    mostrarTreinadorJogadores();
                    mostrarTime();
                    break;
                case 2:
                    jogadoresAptos();
                    mostrarTime();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    mostrarTime();
            }
        }

    }

    private static void jogadoresAptos() {


        if(admin.getJogador().size() != 0) {
            System.out.println("Jogadores Aptos:");
            for (Jogador jogador : admin.getJogador()) {
                if (jogador.isApto()) {
                    System.out.println("Nome: " + jogador.getNome() + "\n" + "CPF: " + jogador.getCPF() + "\n"
                            + "Posição: " + jogador.getTipoJogador() + "\n");
                }

            }
        }
        else{
            System.out.println("O time não possui jogadores aptos.");
        }



        if(admin.getJogador().size() != 0) {
            System.out.println("Jogadores Não Aptos:");
            for (Jogador jogador : admin.getJogador()) {
                if (!jogador.isApto()) {
                    System.out.println(jogador.getNome() + "\n" + jogador.getCPF() + "\n" + jogador.getTipoJogador() + "\n");
                }

            }
        }
        else{
            System.out.println("O time não possui jogadores inaptos");
        }
    }

    private static void mostrarTreinadorJogadores() {


        if (admin.getTecnico() != null) {
            System.out.println("Tecnico");
            System.out.println(admin.getTecnico().toString());
        }
        else{
            System.out.println("O time não possui tecnico");
        }



        if(admin.getJogador().size() != 0) {
            System.out.println("\nJogadores\n");
            for (Jogador jogador : admin.getJogador()) {
                System.out.println(jogador.toString());
            }
        }
        else{
            System.out.println("O time não possui jogador");
        }
    }

    private static void addFuncionario() {

        try {
            System.out.println("\n ADICIONAR FUNCIONÁRIO\n");
            System.out.println("1: Presidente\n2: Medico\n3: Tecnico\n4: Preparador Fisico\n" +
                    "5: Motorista\n6: Cozinheiro\n7: Advogado\n8: Jogador\n9: Voltar");

            opcao = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            addFuncionario();
        }finally {
            switch (opcao) {
                case 1:
                    admin.addPresidente();
                    addFuncionario();
                    break;
                case 2:
                    admin.addMedico();
                    addFuncionario();
                case 3:
                    admin.addTecnico();
                    addFuncionario();
                case 4:
                    admin.addPreparadorFisico();
                    addFuncionario();
                case 5:
                    admin.addMotorista();
                    addFuncionario();
                case 6:
                    admin.addCozinheiro();
                    addFuncionario();
                case 7:
                    admin.addAdvogado();
                    addFuncionario();
                case 8:
                    admin.addJogador();
                    addFuncionario();
                case 9:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    addFuncionario();
            }
        }
    }


}
