package isoccer;

public class Onibus {
    private int qntdAssentos, arCondicionado, qntdTV;
    private boolean banheiro, frigobar;

    public Onibus(int qntdAssentos, int arCondicionado, int qntdTV,boolean banheiro, boolean frigobar){
        this.qntdAssentos = qntdAssentos;
        this.arCondicionado = arCondicionado;
        this.qntdTV = qntdTV;
        this.banheiro = banheiro;
        this.frigobar = frigobar;

    }

    public int getQntdAssentos() {
        return qntdAssentos;
    }

    public int getArCondicionado() {
        return arCondicionado;
    }

    public int getQntdTV() {
        return qntdTV;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public boolean isFrigobar() {
        return frigobar;
    }

    public void setQntdAssentos(int qntdAssentos) {
        this.qntdAssentos = qntdAssentos;
    }

    public void setArCondicionado(int arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void setQntdTV(int qntdTV) {
        this.qntdTV = qntdTV;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }

    @Override
    public String toString() {
        return "Quantidade Assentos: " + getQntdAssentos() + "\nQuantidade Ar Condicionado" + getArCondicionado()
                + "\nQuantidade TVs: "+ getQntdTV() + "\nBanheiro: " + (isBanheiro()? "Sim" : "Não") +
                "\nFrigobar: " + (isFrigobar()? "Sim\n" : "Não\n");
    }
}
