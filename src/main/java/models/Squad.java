package models;

import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.List;

public class Squad {

    private int squadId;
    private String squadName;
    private int squadSize;
    private String cause;
    private ArrayList<Hero>  squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();


    public Squad(String name, int size, String cause ){
        squadName = name;
        squadSize = size;
        this.cause = cause;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.squadId = instances.size();

    }
    public int getSquadId(){return squadId;}
    public static Squad findBySquadId(int id) {return instances.get(id-1);}
    public String getSquadName() {return squadName;}
    public int getSize() {return squadSize;}
    public String getCause() {return this.cause;}
    public static ArrayList<Squad> getInstances(){return instances;}
    public ArrayList<Hero> getSquadMembers(){
        return squadMembers;
    }
    public void setSquadMembers(Hero newMember) {
        squadMembers.add(newMember);
    }
    public static void clearAllSquads(){ instances.clear(); }
    public void clearAllSquadMembers(){ getSquadMembers().clear(); }

    public static Squad setUpNewSquad(){return new Squad("Avengers",5,"Infinity Stone");}
    public static Squad setUpNewSquad1(){return new Squad("GameBoy",5,"PUBG");}

}
