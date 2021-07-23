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
public class Excersise6_6 {
    public static void main(String args[]) { 
    Excersise6_6_6 ob = new Excersise6_6_6(15, 20); 
 
    System.out.println("ob.a and ob.b before call: " + 
                       ob.a + " " + ob.b); 
 
    ob.change(ob); 
 
    System.out.println("ob.a and ob.b after call: " + 
                       ob.a + " " + ob.b); 
  }
}
