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
class Excersise4_5_5 {
   int passengers; // number of passengers  
  int fuelcap;    // fuel capacity in gallons 
  int mpg;        // fuel consumption in miles per gallon 
 
  // Return the range. 
  int range() { 
    return mpg * fuelcap;
  }
}
