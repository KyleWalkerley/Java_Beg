/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author kyle_
 */
public class Excersise3_2 {
    public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch, answer = 'K'; 
 
    System.out.println("I'm thinking of a letter between A and Z."); 
    System.out.print("Can you guess it: "); 
 
    ch = (char) System.in.read(); // read a char from the keyboard 
    
    if(ch == answer) System.out.println("** Right **"); 
  }
}
