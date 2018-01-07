/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnDong Mac
 */
public class Plane {
    private String id;
    private String capacity;
    public Plane(String id, String capacity ){
        this.id= id;
        this.capacity=capacity;
    }
    public String toString(){
         return id+" ("+capacity+" ppl)";
    }
}
