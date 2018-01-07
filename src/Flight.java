/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnDong Mac
 */
public class Flight {
    private Plane plane;
    private String dep;
    private String des;
    public Flight(Plane plane, String dep, String des){
        this.plane=plane;
        this.dep=dep;
        this.des=des;
    }
    public String toString(){
       return plane.toString()+" ("+dep+"-"+des+")";
    }
}
