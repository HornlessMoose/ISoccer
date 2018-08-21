package isoccer.view;

import isoccer.supporters.Supporter;

import java.util.ArrayList;

public class SupporterView {

    public void showSupporterQntd(ArrayList<Supporter> supporters) {
        if (supporters.size() != 0) {
            System.out.println("Existem " + supporters.size() + " Sócios Torcedores");
        } else {
            System.out.println("O time não possui socios.");
        }
    }

    public void showIndividualData(ArrayList<Supporter> supporters) {

        if(supporters.size() != 0) {
            System.out.println("Lista Socios Torcedores dados individuais:");

            for (Supporter supporter : supporters) {
                System.out.println(supporter.toString());

            }
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    public void showDefaulting(ArrayList<Supporter> supporters) {

        if(supporters.size() != 0) {
            System.out.println("Socios Torcedores Inadimplentes:");

            for (Supporter supporter : supporters) {

                if (supporter.getPaymentStatus().toUpperCase().equals("INADIMPLENTE")) {
                    System.out.println(supporter.toString());
                }

            }
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    public void showNotDefaulting(ArrayList<Supporter> supporters) {

        if(supporters.size() != 0) {
            System.out.println("Socios Torcedores Adimplentes:");

            for (Supporter supporter : supporters) {

                if (supporter.getPaymentStatus().toUpperCase().equals("ADIMPLENTE")) {
                    System.out.println(supporter.toString());
                }

            }
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }


}
