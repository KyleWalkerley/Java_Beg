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
class Excersise6_12_1 {
    int x;  
  
  Excersise6_12_1() { 
    System.out.println("Inside MyClass()."); 
    x = 0; 
  } 
 
  Excersise6_12_1(int i) {  
    System.out.println("Inside MyClass(int)."); 
    x = i;  
  } 
 
  Excersise6_12_1(double d) { 
    System.out.println("Inside MyClass(double)."); 
    x = (int) d; 
  } 
 
  Excersise6_12_1(int i, int j) { 
    System.out.println("Inside MyClass(int, int)."); 
    x = i * j; 
  }
}
