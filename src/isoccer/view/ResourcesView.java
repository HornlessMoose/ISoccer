package isoccer.view;

import isoccer.resources.Bus;
import isoccer.resources.Stadium;
import isoccer.resources.TrainingCenter;

import java.util.ArrayList;

public class ResourcesView {

    public void showStadium(Stadium stadium) {

        if(stadium != null) {
            System.out.println("Estadio: ");

            System.out.println(stadium + "\n");
        }
        else{
            System.out.println("O time não possui estádio.");
        }
    }

    public void showTrainingCenter(TrainingCenter trainingCenter) {
        if(trainingCenter != null) {
            System.out.println("Centro Treinamento: ");

            System.out.println(trainingCenter + "\n");
        }
        else{
            System.out.println("O time não possui centro de treinamento.");
        }
    }

    public void showTransport(ArrayList<Bus> buses) {

        if(buses != null) {
            System.out.println("Onibus: ");

            for (Bus bus : buses) {
                System.out.println(bus.toString() + "\n");

            }
        }
        else{
            System.out.println("O time não possui ônibus.");
        }
    }

    public void busAvailable(ArrayList<Bus> buses) {

        if(buses.size()  ==  0){
            System.out.println("Ônibus não disponível");
        }
        else{
            System.out.println("Ônibus disponível");
        }
    }

    public void stadiumAvailable(Stadium stadium) {
        if(stadium == null){
            System.out.println("Estádio não disponível");
        }
        else{
            System.out.println("Estádio disponível");
        }

    }

    public void showDormitory(TrainingCenter trainingCenter){
        if (trainingCenter != null) {
            System.out.println("Existem" +  trainingCenter.getDormitorios() + "Dormitórios");
        } else {
            System.out.println("O time não possui centro de treinamento.");
        }
    }

    public void trainingCenterAvailable(TrainingCenter trainingCenter) {
        if(trainingCenter == null){
            System.out.println("Centro Treinamento não disponível");
        }
        else{
            System.out.println("Centro Treinamento disponível");
        }
    }

}
