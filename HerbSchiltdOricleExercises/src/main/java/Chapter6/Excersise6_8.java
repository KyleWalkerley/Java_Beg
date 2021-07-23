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
public class Excersise6_8 {
    public static void main(String args[]) { 
    Excersise6_8_8_2 err = new Excersise6_8_8_2(); 
    Excersise6_8_8 e; 
 
    e = err.getErrorInfo(2); 
    System.out.println(e.msg + " severity: " + e.severity); 
 
    e = err.getErrorInfo(19); 
    System.out.println(e.msg + " severity: " + e.severity); 
  }
}
