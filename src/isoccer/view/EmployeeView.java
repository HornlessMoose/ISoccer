package isoccer.view;

import isoccer.employees.Doctor;
import isoccer.employees.Driver;
import isoccer.employees.Employee;
import isoccer.employees.Player;

import java.util.ArrayList;

public class EmployeeView {


    public void showGeneralServices(Employee president, ArrayList<Doctor> doctors, ArrayList<Employee> personalTrainers,
               ArrayList<Driver> drivers, ArrayList<Employee> cooks, ArrayList<Employee> lawyers) {

        if(president != null) {
            System.out.println("Presidente:\n" + president);
        }
        else{
            System.out.println("O time não possui presidente.");
        }

        if(doctors.size() != 0) {
            System.out.println("Médicos:");

            for (Doctor doctor : doctors) {
                System.out.println(doctor);

            }
        }
        else{
            System.out.println("O time não possui médicos.");
        }

        if(personalTrainers.size() != 0) {
            System.out.println("Preparadores Físicos:");

            for (Employee personalTrainer : personalTrainers) {
                System.out.println(personalTrainer);

            }
        }
        else{
            System.out.println("O time não possui preparadores físico.");
        }

        if(drivers.size() != 0) {
            System.out.println("Motoristas:");

            for (Driver driver : drivers) {
                System.out.println(driver.toString());

            }
        }
        else{
            System.out.println("O time não possui motoristas.");
        }

        if(cooks.size() != 0) {
            System.out.println("Cozinheiros:");

            for (Employee cook : cooks) {
                System.out.println(cook);

            }
        }
        else{
            System.out.println("O time não possui cozinheiros.");
        }

        if(lawyers.size() != 0) {
            System.out.println("Advogados:");

            for (Employee lawyer : lawyers) {
                System.out.println(lawyer);

            }
        }
        else{
            System.out.println("O time não possui advogados.");
        }


    }

    public void playersAble(ArrayList<Player> players) {


        if(players.size() != 0) {
            System.out.println("Jogadores Aptos:");
            for (Player player : players) {
                if (player.isAble()) {
                    System.out.println(player);
                }

            }
        }
        else{
            System.out.println("O time não possui jogadores aptos.");
        }



        if(players.size() != 0) {
            System.out.println("Jogadores Não Aptos:");
            for (Player player : players) {
                if (!player.isAble()) {
                    System.out.println(player.toString());
                }

            }
        }
        else{
            System.out.println("O time não possui jogadores inaptos");
        }
    }

    public void showCoachPlayers(Employee coach, ArrayList<Player> players) {


        if (coach != null) {
            System.out.println("Tecnico:");
            System.out.println(coach);
        }
        else{
            System.out.println("O time não possui tecnico");
        }



        if(players.size() != 0) {
            System.out.println("\nJogadores\n");
            for (Player player : players) {
                System.out.println(player);
            }
        }
        else{
            System.out.println("O time não possui jogador");
        }
    }


}
