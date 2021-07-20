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
public class Excersise4_5 {
    public static void main(String args[]) {  
    Excersise4_5_5 minivan = new Excersise4_5_5();  
    Excersise4_5_5 sportscar = new Excersise4_5_5();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
    // get the ranges 
    range1 = minivan.range(); 
    range2 = sportscar.range(); 
 
 
    System.out.println("Minivan can carry " + minivan.passengers + 
                     " with range of " + range1 + " Miles"); 
 
 
    System.out.println("Sportscar can carry " + sportscar.passengers + 
                     " with range of " + range2 + " miles"); 
     
  }
}
