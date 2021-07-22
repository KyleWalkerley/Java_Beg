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
public class Excersise4_12 {
    public static void main(String args[]) {   
 
    // construct complete vehicles 
    Excersise4_12_12 minivan = new Excersise4_12_12(7, 16, 21);   
    Excersise4_12_12 sportscar = new Excersise4_12_12(2, 14, 12);   
    double gallons;  
    int dist = 252;  
  
    gallons = minivan.fuelneeded(dist);   
   
    System.out.println("To go " + dist + " miles minivan needs " +  
                       gallons + " gallons of fuel.");  
      
    gallons = sportscar.fuelneeded(dist);   
   
    System.out.println("To go " + dist + " miles sportscar needs " +  
                       gallons + " gallons of fuel.");  
      
  }
}
