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
public class Excersise4_1 {   
  public static void main(String args[]) {  
    Excersise4_1_1 minivan = new Excersise4_1_1();  
    int range;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // compute the range assuming a full tank of gas 
    range = minivan.fuelcap * minivan.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range);  
  }
}
