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
public class Excersise4_3 {
    public static void main(String args[]) {  
    Excersise4_3_3 minivan = new Excersise4_3_3();  
    Excersise4_3_3 sportscar = new Excersise4_3_3();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
 
    System.out.print("Minivan can carry " + minivan.passengers + 
                     ". "); 
 
    minivan.range(); // display range of minivan 
 
    System.out.print("Sportscar can carry " + sportscar.passengers + 
                     ". "); 
     
    sportscar.range(); // display range of sportscar. 
  }
}
