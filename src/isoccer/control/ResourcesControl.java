package isoccer.control;

import isoccer.resources.Bus;
import isoccer.resources.Stadium;
import isoccer.resources.TrainingCenter;

import java.util.ArrayList;
import java.util.Scanner;


public class ResourcesControl {

    Scanner input = new Scanner(System.in);
    Stadium stadium;
    TrainingCenter trainingCenter;

    public void addBus(ArrayList<Bus> buses){
        int seats,  airConditioners, TVs;
        String hasWC, hasMinibar;


        System.out.println("Adicionando Onibus");

        System.out.println("Quantidade Assentos: ");
        seats = Integer.parseInt(input.nextLine());

        System.out.println("Ar Condicionados: ");
        airConditioners = Integer.parseInt(input.nextLine());

        System.out.println("Quantidade TVs: ");
        TVs = Integer.parseInt(input.nextLine());

        System.out.println("Banheiro(Sim, Não): ");
        hasWC= input.nextLine().toUpperCase();

        System.out.println("Frigobar(Sim, Não:: ");
        hasMinibar = input.nextLine().toUpperCase();

        buses.add(new Bus(seats, airConditioners, TVs, (hasWC.equals("SIM")), (hasMinibar.equals("SIM"))));

        System.out.println("Onibus Adicionado");


    }

    public Stadium addStadium(){
        int supporters, WC, snackBar;

        System.out.println("Adicionando Estadio");

        System.out.println("Torcedores Suportados: ");
        supporters = Integer.parseInt(input.nextLine());

        System.out.println("Quantidade Banheiros: ");
        WC = Integer.parseInt(input.nextLine());

        System.out.println("Quantidade Lanchonetes: ");
        snackBar = Integer.parseInt(input.nextLine());

        this.stadium = new Stadium(supporters, WC, snackBar);

        System.out.println("Estadio Adicionado");

        return stadium;
    }

    public void changeAmountSupporters(Stadium stadium){
        if (stadium != null) {
            System.out.print("Nova Quantidade de torcedores suportados: ");
            stadium.setSupporters(Integer.parseInt(input.nextLine()));
        } else {
            System.out.println("O time não possui estádio.");
        }
    }

    public void changeAmountWC(Stadium stadium){
        if (stadium != null) {
            System.out.print("Nova Quantidade de banheiros: ");
            stadium.setWC(Integer.parseInt(input.nextLine()));
        } else {
            System.out.println("O time não possui estádio.");
        }
    }

    public void changeAmountSnackbars(Stadium stadium){
        if (stadium != null) {
            System.out.print("Nova Quantidade de lanchonetes: ");
            stadium.setSnackBar(Integer.parseInt(input.nextLine()));
        } else {
            System.out.println("O time não possui estádio.");
        }
    }

    public TrainingCenter addTrainingCenter(){
        int dormitory;

        System.out.println("Adicionando Centro Treinamento: ");

        System.out.println("Dormitorios: ");
        dormitory = Integer.parseInt(input.nextLine());

        trainingCenter = new TrainingCenter(dormitory);

        System.out.println("Centro Treinamento Adicionado");

        return trainingCenter;
    }
}
