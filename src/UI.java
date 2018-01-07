/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnDong Mac
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class UI {
    private Scanner reader;
    private HashMap<String,Plane> record;
    private ArrayList<Flight> flightList;
    public UI(){
        reader=new Scanner(System.in);
        record= new HashMap<String,Plane>();
        flightList= new ArrayList<Flight>();
    }
    public void airportPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String x=reader.nextLine();
            if (x.equals("1")){
                System.out.println("Give plane ID: ");
                String y=reader.nextLine();
                System.out.println("Give plane capacity: ");
                String z=reader.nextLine();
                Plane p=new Plane(y,z);
                record.put(y, p);
            }else if(x.equals("2")){
                System.out.println("Give plane ID: ");
                String a=reader.nextLine();
                System.out.println("Give departure airport code: ");
                String b=reader.nextLine();
                System.out.println("Give destination airport code: ");
                String c=reader.nextLine();
                Flight f=new Flight(record.get(a),b,c);
                flightList.add(f);
            }else if(x.equals("x")){
                break;
            }
        }
    }
    public void Flightservice(){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        while (true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String a=reader.nextLine();
            if(a.equals("1")){
                for (String key: record.keySet()){
                    System.out.println(record.get(key));
                }
            }else if (a.equals("2")){
                for (Flight f:flightList){
                    System.out.println(f);
                }
            }else if(a.equals("3")){
                System.out.println("Give plane ID: ");
                String y=reader.nextLine();
                System.out.println(record.get(y));
            }else if(a.equals("x")){
                break;
            }
        }
    }
}

