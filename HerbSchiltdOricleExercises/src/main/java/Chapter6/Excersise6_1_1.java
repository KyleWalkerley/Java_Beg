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
class Excersise6_1_1 {
    private int alpha; // private access 
  public int beta; // public access 
  int gamma; // default access
 
  /* Methods to access alpha.  It is OK for a 
     member of a class to access a private member 
     of the same class. 
  */ 
  void setAlpha(int a) { 
    alpha = a;  
  } 
 
  int getAlpha() { 
    return alpha; 
  }
}
