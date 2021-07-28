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
public class Excersise6_13 {
    public static void main(String args[]) { 
    Excersise6_13_1 s1 = new Excersise6_13_1(5); 
    Excersise6_13_1 s2 = new Excersise6_13_1(s1); 
 
    System.out.println("s1.sum: " + s1.sum); 
    System.out.println("s2.sum: " + s2.sum); 
  }
}
