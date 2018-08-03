package isoccer;

public class Estadio {
    private int torcedoresSuportados, qntdBanheiros, qntdLanchonetes;

    public Estadio(int torcedoresSuportados, int qntdBanheiros, int qntdLanchonetes){
        this.torcedoresSuportados = torcedoresSuportados;
        this.qntdBanheiros = qntdBanheiros;
        this.qntdLanchonetes = qntdLanchonetes;
    }

    public int getTorcedoresSuportados() {
        return torcedoresSuportados;
    }

    public int getQntdBanheiros() {
        return qntdBanheiros;
    }

    public int getQntdLanchonetes() {
        return qntdLanchonetes;
    }

    public void setTorcedoresSuportados(int torcedoresSuportados) {
        this.torcedoresSuportados = torcedoresSuportados;
    }

    public void setQntdBanheiros(int qntdBanheiros) {
        this.qntdBanheiros = qntdBanheiros;
    }

    public void setQntdLanchonetes(int qntdLanchonetes) {
        this.qntdLanchonetes = qntdLanchonetes;
    }

    @Override
    public String toString() {
        return "Torcedores Suportados: " + getTorcedoresSuportados() + "\nQuantidade Banheiros: " + getQntdBanheiros()
                + "\nQuantidade Lanchonetes: " + getQntdLanchonetes() + "\n";
    }
}
