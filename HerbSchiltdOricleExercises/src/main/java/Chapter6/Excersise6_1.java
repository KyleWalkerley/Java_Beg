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
public class Excersise6_1 {
   public static void main(String args[]) {  
    Excersise6_1_1 ob = new Excersise6_1_1();  
  
    /* Access to alpha is allowed only through 
       its accessor methods. */ 
    ob.setAlpha(-99); 
    System.out.println("ob.alpha is " + ob.getAlpha()); 
 
    // You cannot access alpha like this: 
//  ob.alpha = 10; // Wrong! alpha is private! 
 
    // These are OK because beta and gamma are public. 
    ob.beta = 88;  
    ob.gamma = 99;  
   } 
}
