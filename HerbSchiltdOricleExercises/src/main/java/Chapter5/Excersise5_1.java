/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author kyle_
 */
public class Excersise5_1 {
    public static void main(String args[]) { 
    double nums[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 
                      6.6, 7.7, 8.8, 9.9, 10.10 }; 
    double sum = 0; 
 
    for(int i=0; i < nums.length; i++) 
      sum += nums[i]; 
 
    System.out.println("Average: " + sum / nums.length); 
  }
}
