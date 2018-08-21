package isoccer.control;

import isoccer.supporters.Supporter;

import java.util.ArrayList;
import java.util.Scanner;

public class SupporterControl {

    private Scanner input = new Scanner(System.in);

    private String name, email,  address, paymentStatus, CPF, cellphone, search;

    private double contributionValue;

    public void addSupporter(ArrayList<Supporter> supporters){


        System.out.println("Adicionando Socio Torcedor");

        System.out.print("Nome: ");
        name = input.nextLine();

        System.out.print("Email: ");
        email = input.nextLine();

        System.out.print("Endereco: ");
        address = input.nextLine();

        System.out.print("CPF: ");
        CPF = input.nextLine();

        System.out.print("Telefone: ");
        cellphone = input.nextLine();

        System.out.print("Valor Atribuição: ");
        contributionValue = Double.parseDouble(input.nextLine());



        supporters.add( new Supporter(name, email, address, "Adimplente", CPF, cellphone,
                contributionValue, getPlan(contributionValue)));


    }

    public void changePaymentStatus(ArrayList<Supporter> supporters) {

        if(supporters.size() != 0) {
            System.out.println("Informe o CPF do Socio Torcedor");

            search = input.nextLine();

            for (Supporter supporter : supporters) {
                if (supporter.getCPF().equals(search)) {
                    System.out.println("Digite o novo estado de pagamento para o Socio Torcedor(Adimplente, Inadimplente)");
                    while(true){
                        paymentStatus = input.nextLine();

                        if(paymentStatus.toUpperCase().equals("ADIMPLENTE") ||
                                paymentStatus.toUpperCase().equals("INADIMPLENTE")){
                            break;
                        }
                        else{
                            System.out.println("Informe o novo estado de pagamento corretamente(Adimplente, Inadimplente");
                        }
                    }

                    supporter.setPaymentStatus(paymentStatus);
                    return;
                }
            }
            System.out.println("Socio Torcedor não encontrado.");
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    public void changeContributionValue(ArrayList<Supporter> supporters) {
        if(supporters != null) {
            System.out.println("Informe o CPF do Socio Torcedor");

            search = input.nextLine();
            double newValue;

            for (Supporter supporter : supporters) {
                if (supporter.getCPF().equals(search)) {

                    while(true) {

                        try {
                            System.out.println("Digite o novo valor de contribuição para o Socio Torcedor");
                            newValue = Double.parseDouble(input.nextLine());
                            break;
                        } catch (NumberFormatException nmr) {
                            System.out.println("Deve ser informado um valor double");
                        }
                    }

                    supporter.setContributionValue(newValue);
                    supporter.setPlan(newValue);
                    return;
                }
            }
            System.out.println("Socio Torcedor não encontrado.");
        }
        else{
            System.out.println("O time não possui socios.");
        }
    }

    public String getPlan(double contributionValue) {

        if(contributionValue <= 40.00){
            return "Júnior";
        }

        else if(contributionValue <= 75.00){
            return "Sênior";
        }

        return "Elite";


    }

}
