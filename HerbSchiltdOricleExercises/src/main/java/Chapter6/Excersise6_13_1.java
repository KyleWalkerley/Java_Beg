/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author kyle_
 */
class Excersise6_13_1 {
    int sum; 
 
  // Construct from an int. 
  Excersise6_13_1(int num) { 
    sum = 0; 
    for(int i=1; i <= num; i++) 
      sum += i; 
  } 
 
  // Construct from another object. 
  Excersise6_13_1(Excersise6_13_1 ob) { 
    sum = ob.sum; 
  }
}
