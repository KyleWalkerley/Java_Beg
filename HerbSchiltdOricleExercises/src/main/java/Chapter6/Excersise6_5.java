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
public class Excersise6_5 {
    public static void main(String args[]) { 
    Excersise6_5_5 ob = new Excersise6_5_5(); 
 
    int a = 15, b = 20; 
 
    System.out.println("a and b before call: " + 
                       a + " " + b); 
 
    ob.noChange(a, b);  
 
    System.out.println("a and b after call: " + 
                       a + " " + b); 
  }
}
