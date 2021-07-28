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
public class Excersise6_10 {
    public static void main(String args[]) { 
    Excersise6_10_1 ob = new Excersise6_10_1(); 
 
    int i = 10; 
    double d = 10.1; 
 
    byte b = 99; 
    short s = 10; 
    float f = 11.5F; 
 
 
    ob.f(i); // calls ob.f(int) 
    ob.f(d); // calls ob.f(double) 
 
    ob.f(b); // calls ob.f(int) -- type conversion 
    ob.f(s); // calls ob.f(int) -- type conversion 
    ob.f(f); // calls ob.f(double) -- type conversion 
  }
}
