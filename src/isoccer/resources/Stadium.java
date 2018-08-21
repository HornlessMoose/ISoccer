package isoccer.resources;

public class Stadium {
    private int supporters, WC, snackBar;

    public Stadium(int supporters, int WC, int snackBar){
        this.supporters = supporters;
        this.WC = WC;
        this.snackBar = snackBar;
    }

    public int getSupporters() {
        return supporters;
    }

    public int getWC() {
        return WC;
    }

    public int getSnackBar() {
        return snackBar;
    }

    public void setSupporters(int supporters) {
        this.supporters = supporters;
    }

    public void setWC(int WC) {
        this.WC = WC;
    }

    public void setSnackBar(int snackBar) {
        this.snackBar = snackBar;
    }

    @Override
    public String toString() {
        return "Torcedores Suportados: " + getSupporters() + "\nQuantidade Banheiros: " + getWC()
                + "\nQuantidade Lanchonetes: " + getSnackBar() + "\n";
    }
}
