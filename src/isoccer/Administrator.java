package isoccer;

import isoccer.employees.*;
import isoccer.resources.Bus;
import isoccer.resources.Stadium;
import isoccer.resources.TrainingCenter;
import isoccer.supporters.Supporter;

import java.util.ArrayList;



public class Administrator {


    private String login, password;


    private Employee president;

    private Employee coach;


    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private ArrayList<Employee> personalTrainers = new ArrayList<Employee>();
    private ArrayList<Driver> drivers = new ArrayList<Driver>();
    private ArrayList<Employee> cooks = new ArrayList<Employee>();
    private ArrayList<Employee> lawyers = new ArrayList<Employee>();
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Supporter> supporters = new ArrayList<Supporter>();

    private ArrayList<Bus> buses = new ArrayList<Bus>();
    private Stadium stadium;
    private TrainingCenter trainingCenter;

    public Administrator(String login, String password){
        this.login = login;
        this.password = password;

    }

    public boolean authenticateAdmin(String login, String password){

        return login.equals(this.login) && password.equals(this.password);
    }


    public ArrayList<Supporter> getSupporters() {
        return supporters;
    }



    public void setPresident(Employee president) {
        this.president = president;
    }

    public void setCoach(Employee coach) {
        this.coach = coach;
    }



    public Employee getPresident() {
        return president;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public Employee getCoach() {
        return coach;
    }

    public ArrayList<Employee> getPersonalTrainers() {
        return personalTrainers;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<Employee> getLawyers() {
        return lawyers;
    }

    public ArrayList<Employee> getCooks() {
        return cooks;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }



    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public TrainingCenter getTrainingCenter() {
        return trainingCenter;
    }


    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public void setTrainingCenter(TrainingCenter trainingCenter) {
        this.trainingCenter = trainingCenter;
    }
}
