package isoccer.resources;

public class Bus {
    private int seats, airConditioners, TVs;
    private boolean WC, minibar;

    public Bus(int seats, int airConditioners, int TVs, boolean WC, boolean minibar){
        this.seats = seats;
        this.airConditioners = airConditioners;
        this.TVs = TVs;
        this.WC = WC;
        this.minibar = minibar;

    }

    public int getSeats() {
        return seats;
    }

    public int getAirConditioners() {
        return airConditioners;
    }

    public int getTVs() {
        return TVs;
    }

    public boolean isWC() {
        return WC;
    }

    public boolean isMinibar() {
        return minibar;
    }


    @Override
    public String toString() {
        return "Quantidade Assentos: " + getSeats() + "\nQuantidade Ar Condicionado: " + getAirConditioners()
                + "\nQuantidade TVs: "+ getTVs() + "\nBanheiro: " + (isWC()? "Sim" : "Não") +
                "\nFrigobar: " + (isMinibar()? "Sim\n" : "Não\n");
    }
}
