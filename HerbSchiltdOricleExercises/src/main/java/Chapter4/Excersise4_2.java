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
public class Excersise4_2 {
    public static void main(String args[]) {  
    Excersise4_2_2 minivan = new Excersise4_2_2();  
    Excersise4_2_2 sportscar = new Excersise4_2_2();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
    // compute the ranges assuming a full tank of gas 
    range1 = minivan.fuelcap * minivan.mpg; 
    range2 = sportscar.fuelcap * sportscar.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range1);  
 
    System.out.println("Sportscar can carry " + sportscar.passengers + 
                       " with a range of " + range2);  
  }
}
