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
public class Excersise6_4 {
    public static void main(String args[]) { 
    Excersise6_4_4 ob1 = new Excersise6_4_4(10, 2, 5);  
    Excersise6_4_4 ob2 = new Excersise6_4_4(10, 2, 5);  
    Excersise6_4_4 ob3 = new Excersise6_4_4(4, 5, 5);  
  
    System.out.println("ob1 same dimensions as ob2: " + 
                       ob1.sameBlock(ob2));  
    System.out.println("ob1 same dimensions as ob3: " + 
                        ob1.sameBlock(ob3));  
    System.out.println("ob1 same volume as ob3: " + 
                       ob1.sameVolume(ob3));  
  }
}
