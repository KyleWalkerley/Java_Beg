/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author kyle_
 */
public class Excersise4_8 {
    public static void main(String args[]) {  
    Excersise4_8_8 minivan = new Excersise4_8_8();  
    Excersise4_8_8 sportscar = new Excersise4_8_8();  
    double gallons; 
    int dist = 252; 
 
     // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
 
    gallons = minivan.fuelneeded(dist);  
  
    System.out.println("To go " + dist + " miles minivan needs " + 
                       gallons + " gallons of fuel."); 
     
    gallons = sportscar.fuelneeded(dist);  
  
    System.out.println("To go " + dist + " miles sportscar needs " + 
                       gallons + " gallons of fuel."); 
     
  }
}
