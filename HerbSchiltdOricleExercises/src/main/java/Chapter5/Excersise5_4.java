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
public class Excersise5_4 {
    public static void main(String args[]) {  
    int nums[] = new int[10]; 
    int min, max; 
 
    nums[0] = 99; 
    nums[1] = -10; 
    nums[2] = 100123; 
    nums[3] = 18; 
    nums[4] = -978; 
    nums[5] = 5623; 
    nums[6] = 463; 
    nums[7] = -9; 
    nums[8] = 287; 
    nums[9] = 49; 
 
    min = max = nums[0]; 
    // Use a for-each style for loop.
    for(int v : nums) { 
      if(v < min) min = v; 
      if(v > max) max = v; 
    } 
    System.out.println("min and max: " + min + " " + max); 
  }
}
