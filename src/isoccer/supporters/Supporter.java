package isoccer.supporters;

public class Supporter {


    private String name, email, address, paymentStatus, plan, CPF, cellphone;
    private double contributionValue;



    public Supporter(String name, String email, String address, String paymentStatus,
                         String CPF, String cellphone, double contributionValue, String plan){

        this.name = name;
        this.email = email;
        this.address = address;
        this.paymentStatus = paymentStatus;
        this.CPF = CPF;
        this.cellphone = cellphone;
        this.contributionValue = contributionValue;
        this.plan = plan;

    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getAddress() {
        return address;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(double contributionValue) {

        if(contributionValue <= 40.00){
            this.plan = "Júnior";
        }

        else if(contributionValue <= 75.00){
            this.plan = "Sênior";
        }

        else if(contributionValue > 75.00){
            this.plan = "Elite";
        }

        else{
            System.out.println("Valores negativo não são aceitos");
        }


    }

    public void setContributionValue(double contributionValue) {
        this.contributionValue  = contributionValue;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\nEmail: " + getEmail() + "\nCPF: " +  getCPF() +
                "\nEndereco: " + getAddress() + "\nEstado Pagamento: " + getPaymentStatus() +
                "\nPlano: " + getPlan() +"\nTelefone: " + getCellphone() + "\n";
    }
}
