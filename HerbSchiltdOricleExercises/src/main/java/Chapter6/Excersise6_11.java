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
public class Excersise6_11 {
    public static void main(String args[]) { 
    Excersise6_11_1 ob = new Excersise6_11_1(); 
 
    int i = 10; 
    double d = 10.1; 
 
    byte b = 99; 
    short s = 10; 
    float f = 11.5F; 
 
 
    ob.f(i); // calls ob.f(int) 
    ob.f(d); // calls ob.f(double) 
 
    ob.f(b); // calls ob.f(byte) -- now, no type conversion 
 
    ob.f(s); // calls ob.f(int) -- type conversion 
    ob.f(f); // calls ob.f(double) -- type conversion 
  }
}
