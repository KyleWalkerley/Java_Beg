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
public class Excersise6_9 {
    public static void main(String args[]) {  
    Excersise6_9_1_ ob = new Excersise6_9_1_();  
    int resI; 
    double resD;      
  
    // call all versions of ovlDemo()  
    ob.ovlDemo();   
    System.out.println(); 
 
    ob.ovlDemo(2);  
    System.out.println(); 
 
    resI = ob.ovlDemo(4, 6);  
    System.out.println("Result of ob.ovlDemo(4, 6): " + 
                       resI);  
    System.out.println(); 
 
 
    resD = ob.ovlDemo(1.1, 2.32);  
    System.out.println("Result of ob.ovlDemo(1.1, 2.2): " + 
                       resD);  
  }
}
