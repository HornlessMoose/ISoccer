package isoccer.control;

import isoccer.employees.Doctor;
import isoccer.employees.Driver;
import isoccer.employees.Employee;
import isoccer.employees.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeControl {
    private Scanner input = new Scanner(System.in);

    private String  name, email, CRM, CNH, playerType, CPF, cellphone;

    private double salary;
    boolean able;

    private Employee employee;

    public Employee createEmployee(){

        System.out.print("Nome: ");
        name = input.nextLine();

        System.out.print("Email: ");
        email = input.nextLine();

        System.out.print("CPF: ");
        CPF = input.nextLine();

        System.out.print("Telefone: ");
        cellphone = input.nextLine();

        System.out.print("Salario: ");
        while(true) {
            try {
                salary = Double.parseDouble(input.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("você digitou" + e.getMessage()+"\nDeve ser fornecido um valor double para o salario");
            }

        }
        employee = new Employee(name, email, CPF, cellphone, salary);

        return employee;


    }

    public Employee addPresident(){
        System.out.println("Adicionando Presidente");

        this.employee = createEmployee();

        System.out.println("Presidente Adicionado");

        return employee;


    }

    public void addDoctor(ArrayList<Doctor> doctors){
        System.out.println("Adicionando Médico");
        employee = createEmployee();

        System.out.print("CRM: ");
        CRM = input.nextLine();

        doctors.add(new Doctor(employee.getName(), employee.getEmail(), employee.getCPF()
                , employee.getCellphone(), employee.getSalary(), CRM));

        System.out.println("Médico Adicionado");

    }

    public Employee addCoach(){
        System.out.println("Adicionando Técnico");

        this.employee = createEmployee();

        System.out.println("Técnico Adicionado");

        return employee;

    }

    public void addPersonalTrainer(ArrayList<Employee> personalTrainers){
        System.out.println("Adicionando Preparador Físico");

        personalTrainers.add(createEmployee());

        System.out.println("Prepador Físico Adicionado");

    }

    public void addDriver(ArrayList<Driver> drivers){
        System.out.println("Adicionando Motorista");
        employee = createEmployee();

        System.out.print("CNH: ");
        CNH = input.nextLine();

        drivers.add(new Driver(employee.getName(), employee.getEmail(), employee.getCPF()
                , employee.getCellphone(), employee.getSalary(), CNH));

        System.out.println("Motorista Adicionado");
    }

    public void addLawyer(ArrayList<Employee> lawyers){
        System.out.println("Adicionando Advogado");


        lawyers.add(createEmployee());

        System.out.println("Advogado Adicionado");

    }

    public void addCook(ArrayList<Employee> cooks){
        System.out.println("Adicionando Cozinheiro");

        cooks.add(createEmployee());

        System.out.println("Cozinheiro Adicionado");

    }

    public void addPlayer(ArrayList<Player> players){
        System.out.println("Adicionando Jogador");
        employee = createEmployee();

        able = true;

        System.out.print("Tipo Jogador: ");
        playerType = input.nextLine();


        players.add(new Player(employee.getName(), employee.getEmail(), employee.getCPF()
                , employee.getCellphone(), employee.getSalary(), able, playerType));

        System.out.println("Jogador Adicionado");

    }

}
