package isoccer.employees;


public class Player extends Employee {

    String playerType;
    boolean able;

    public Player(String name, String email, String CPF, String cellphone, double salary, boolean able, String playerType){
        super(name, email, CPF, cellphone, salary);
        this.able = able;
        this.playerType = playerType;
    }

    public boolean isAble() {
        return able;
    }

    public String getPlayerType() {
        return playerType;
    }



    @Override
    public String toString() {
        return super.toString() + "Tipo Jogador: " + getPlayerType() + "\n";
    }
}
