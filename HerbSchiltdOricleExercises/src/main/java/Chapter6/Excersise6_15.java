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
public class Excersise6_15 {
    public static void main(String args[]) {  
    Excersise6_15_1 f = new Excersise6_15_1();  
  
    System.out.println("Factorials using recursive method.");  
    System.out.println("Factorial of 3 is " + f.factR(3));  
    System.out.println("Factorial of 4 is " + f.factR(4));  
    System.out.println("Factorial of 5 is " + f.factR(5));  
    System.out.println();  
 
    System.out.println("Factorials using iterative method.");  
    System.out.println("Factorial of 3 is " + f.factI(3));  
    System.out.println("Factorial of 4 is " + f.factI(4));  
    System.out.println("Factorial of 5 is " + f.factI(5));  
  }
}
