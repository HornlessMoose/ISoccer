package isoccer.control;

import isoccer.Administrator;
import isoccer.view.EmployeeView;
import isoccer.view.ResourcesView;
import isoccer.view.SupporterView;

import java.util.Scanner;

public class MainControl {

    private static Scanner input = new Scanner(System.in);
    private static Administrator admin = new Administrator("moose", "moose");
    private static int option;

    private static EmployeeView employeeView = new EmployeeView();
    private SupporterView supporterView = new SupporterView();
    private ResourcesView resourcesView = new ResourcesView();
    private EmployeeControl employeeControl = new EmployeeControl();
    private SupporterControl supporterControl = new SupporterControl();
    private ResourcesControl resourcesControl = new ResourcesControl();



    public void loginMenu(){


        try {

            System.out.println("\n LOGIN MENU\n");

            System.out.println("1: Fazer login como administrador\n2: Sair");
            option = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro\n");
            loginMenu();
        }
        finally {
            switch (option) {
                case 1:

                    askAccess();
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

    private void askAccess(){
        String login, password;

        System.out.println("Digite o login e senha do administrador");
        login = input.nextLine();
        password = input.nextLine();

        if (admin.authenticateAdmin(login, password)) {
            adminMenu();
        } else {
            System.out.println("Login ou senha incorreto.");
        }
    }

    private void adminMenu(){

        try {
            System.out.println("\n ADMINISTRADOR MENU\n");
            System.out.println("1: Adicionar Funcionarios\n2: Gerenciar Socio Torcedor\n" +
                    "3: Gerenciar Recursos\n4: Solicitar Relatório\n5: Voltar");

            option = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            adminMenu();
        }finally {
            switch (option) {

                case 1:
                    addEmployee();
                    adminMenu();
                    break;
                case 2:
                    manageSupporter();
                    adminMenu();
                    break;
                case 3:
                    manageResource();
                    adminMenu();
                    break;
                case 4:
                    showReport();
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

    private void manageResource() {

        try {
            System.out.println("\n GERENCIAR RECURSOS\n");
            System.out.println("1: Gerenciar Onibus\n2: Gerenciar Estádio\n3: Gerenciar Centro Treinamento\n4: Voltar");

            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            manageResource();
        }finally {
            switch (option) {
                case 1:
                    manageBus();
                    manageResource();
                    break;
                case 2:
                    manageStadium();
                    manageResource();
                    break;
                case 3:
                    manageTrainingCenter();
                    manageResource();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    manageResource();

            }
        }
    }

    private void manageTrainingCenter() {

        try {
            System.out.println("\n GERENCIAR CENTRO TREINAMENTO\n");
            System.out.println("1: Adicionar Centro Treinamento\n2: Disponibilidade\n3: Quantidade Dormitórios\n4: Voltar");

            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            manageTrainingCenter();
        }finally {
            switch (option) {
                case 1:
                    admin.setTrainingCenter(resourcesControl.addTrainingCenter());
                    manageTrainingCenter();
                    break;
                case 2:
                    resourcesView.trainingCenterAvailable(admin.getTrainingCenter());
                    manageTrainingCenter();
                    break;
                case 3:
                    resourcesView.showDormitory(admin.getTrainingCenter());
                    manageTrainingCenter();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    manageTrainingCenter();

            }
        }
    }



    private void manageStadium() {

        try {
            System.out.println("\n GERENCIAR ESTÁDIO\n");
            System.out.println("1: Adicionar Estádio\n2: Disponibilidade\n3: Administrar Estádio\n4: Voltar");

            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            manageStadium();
        }finally {
            switch (option) {
                case 1:
                    admin.setStadium(resourcesControl.addStadium());
                    manageStadium();
                    break;
                case 2:
                    resourcesView.stadiumAvailable(admin.getStadium());
                    manageStadium();
                    break;
                case 3:
                    administerStadium();
                    manageStadium();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    manageStadium();
            }
        }
    }

    private void administerStadium() {

        try {
            System.out.println("\n ADMINISTRAR ESTÁDIO\n");
            System.out.println("1: Torcedores Suportados\n2: Quantidade Banheiros\n3: Quantidade Lanchonetes\n4: Voltar");

            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            administerStadium();
        }finally {
            switch (option) {
                case 1:
                    resourcesControl.changeAmountSupporters(admin.getStadium());
                    administerStadium();
                    break;
                case 2:
                    resourcesControl.changeAmountWC(admin.getStadium());
                    administerStadium();
                    break;
                case 3:
                    resourcesControl.changeAmountSnackbars(admin.getStadium());
                    administerStadium();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    administerStadium();
            }
        }

    }



    private void manageBus() {

        try {
            System.out.println("\n GERENCIAR ÔNIBUS\n");
            System.out.println("1: Adicionar Ônibus\n2: Disponibilidade\n3: Voltar");

            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            manageBus();
        }finally {
            switch (option) {
                case 1:
                    resourcesControl.addBus(admin.getBuses());
                    manageBus();
                    break;
                case 2:
                    resourcesView.busAvailable(admin.getBuses());
                    manageBus();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    manageBus();

            }
        }

    }



    private void manageSupporter() {

        try {
            System.out.println("\n GERENCIAR SOCIO TORCEDOR\n");
            System.out.println("1: Adicionar Socio Torcedor\n2: Alterar estado pagamento\n" +
                    "3: Atualizar valor contribuição\n4: Sair");
            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            manageSupporter();
        }finally {
            switch (option) {
                case 1:
                    supporterControl.addSupporter(admin.getSupporters());
                    manageSupporter();
                    break;
                case 2:
                    supporterControl.changePaymentStatus(admin.getSupporters());
                    manageSupporter();
                    break;
                case 3:
                    supporterControl.changeContributionValue(admin.getSupporters());
                    manageSupporter();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    manageSupporter();
            }
        }
    }




    private void showReport() {

        try {
            System.out.println("\n MOSTRAR RELATÓRIO\n");
            System.out.println("1: Funcionários\n2: Recursos Fisicos\n3: Sócio Torcedor\n4: Voltar");
            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            showReport();
        }finally {
            switch (option) {
                case 1:
                    showEmployees();
                    showReport();
                    break;
                case 2:
                    showPhysicalResources();
                    showReport();
                    break;
                case 3:
                    showSupporter();
                    showReport();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    showReport();

            }
        }
    }
    private void showTeam() {

        try {
            System.out.println("\n MOSTRAR TIME\n");
            System.out.println("1: Treinador e Jogadores\n2: Jogadores Aptos e não Aptos\n3: Voltar");
            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            showTeam();
        }finally {
            switch (option) {
                case 1:
                    employeeView.showCoachPlayers(admin.getCoach(), admin.getPlayers());
                    showTeam();
                    break;
                case 2:
                    employeeView.playersAble(admin.getPlayers());
                    showTeam();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    showTeam();
            }
        }

    }
    private void showEmployees() {

        try {
            System.out.println("\n MOSTRAR FUNCIONÁRIO\n");
            System.out.println("1: Time\n2: Serviços Gerais\n3: Voltar");
            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            showEmployees();
        }finally {

            switch (option) {
                case 1:
                    showTeam();
                    showEmployees();
                    break;
                case 2:
                    employeeView.showGeneralServices(admin.getPresident(), admin.getDoctors(),
                            admin.getPersonalTrainers(), admin.getDrivers(),admin.getCooks(),admin.getLawyers());
                    showEmployees();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    showEmployees();

            }
        }
    }

    private void showSupporter() {

        try {
            System.out.println("\n MOSTRAR SOCIO TORCEDOR\n");
            System.out.println("1: Quantidade\n2: Adimplentes\n3: Inadimplentes\n4: Lista Dados Individuais\n5: Voltar");
            option = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            showSupporter();
        }finally {
            switch (option) {
                case 1:
                    supporterView.showSupporterQntd(admin.getSupporters());
                    showSupporter();
                    break;
                case 2:
                    supporterView.showNotDefaulting(admin.getSupporters());
                    showSupporter();
                    break;
                case 3:
                    supporterView.showDefaulting(admin.getSupporters());
                    showSupporter();
                    break;
                case 4:
                    supporterView.showIndividualData(admin.getSupporters());
                    showSupporter();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    showSupporter();

            }
        }
    }


    private void showPhysicalResources() {

        try {
            System.out.println("\n MOSTRAR RECURSOS FÍSICOS\n");
            System.out.println("1: Transporte\n2: Centro Treinamento\n3: Estadio\n4: Voltar");
            option = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            showPhysicalResources();
        }finally {
            switch (option) {
                case 1:
                    resourcesView.showTransport(admin.getBuses());
                    showPhysicalResources();
                    break;
                case 2:
                    resourcesView.showTrainingCenter(admin.getTrainingCenter());
                    showPhysicalResources();
                    break;
                case 3:
                    resourcesView.showStadium(admin.getStadium());
                    showPhysicalResources();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    showPhysicalResources();

            }
        }
    }


    private void addEmployee() {

        try {
            System.out.println("\n ADICIONAR FUNCIONÁRIO\n");
            System.out.println("1: Presidente\n2: Medico\n3: Tecnico\n4: Preparador Fisico\n" +
                    "5: Motorista\n6: Cozinheiro\n7: Advogado\n8: Jogador\n9: Voltar");

            option = Integer.parseInt(input.nextLine());


        }catch (NumberFormatException nmr){
            System.out.println("A entrada deve ser um inteiro");
            addEmployee();
        }finally {
            switch (option) {
                case 1:
                    admin.setPresident(employeeControl.addPresident());
                    addEmployee();
                    break;
                case 2:
                    employeeControl.addDoctor(admin.getDoctors());
                    addEmployee();
                    break;
                case 3:
                    admin.setCoach(employeeControl.addCoach());
                    addEmployee();
                    break;
                case 4:
                    employeeControl.addPersonalTrainer(admin.getPersonalTrainers());
                    addEmployee();
                    break;
                case 5:
                    employeeControl.addDriver(admin.getDrivers());
                    addEmployee();
                    break;
                case 6:
                    employeeControl.addCook(admin.getCooks());
                    addEmployee();
                    break;
                case 7:
                    employeeControl.addLawyer(admin.getLawyers());
                    addEmployee();
                    break;
                case 8:
                    employeeControl.addPlayer(admin.getPlayers());
                    addEmployee();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    addEmployee();
            }
        }
    }


}
