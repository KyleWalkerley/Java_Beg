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
public class Excersise4_13 {
   public static void main(String args[]) {   
    Excersise4_13_13 x = new Excersise4_13_13(4.0, 2); 
    Excersise4_13_13 y = new Excersise4_13_13(2.5, 1); 
    Excersise4_13_13 z = new Excersise4_13_13(5.7, 0); 
 
    System.out.println(x.b + " raised to the " + x.e +  
                       " power is " + x.get_pwr()); 
    System.out.println(y.b + " raised to the " + y.e +  
                       " power is " + y.get_pwr()); 
    System.out.println(z.b + " raised to the " + z.e +  
                       " power is " + z.get_pwr()); 
  } 
}
