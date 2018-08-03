package isoccer;

public class CentroTreinamento {
    private int dormitorios;

    public CentroTreinamento(int dormitorios){
        this.dormitorios = dormitorios;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    @Override
    public String toString() {
        return "Dormitorios: " + getDormitorios() + "\n";
    }
}
