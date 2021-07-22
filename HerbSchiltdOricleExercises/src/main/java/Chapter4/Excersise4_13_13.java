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
class Excersise4_13_13 {
  double b; 
  int e; 
  double val; 
 
  Excersise4_13_13(double base, int exp) { 
    b = base; 
    e = exp; 
 
    val = 1; 
    if(exp==0) return; 
    for( ; exp>0; exp--) val = val * base; 
  } 
 
  double get_pwr() { 
    return val; 
  }  
}
