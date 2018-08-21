package isoccer.resources;

public class TrainingCenter {
    private int dormitorios;

    public TrainingCenter(int dormitorios){
        this.dormitorios = dormitorios;
    }

    public int getDormitorios() {
        return dormitorios;
    }



    @Override
    public String toString() {
        return "Dormitorios: " + getDormitorios() + "\n";
    }
}
