/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author kyle_
 */
public class TwoDimensional {
    public static void main(String[] args) {
        int sales[][] = new int [2][3];
        sales[0][0] = 123456 ;
        sales[0][1] = 234567 ;
        sales[0][2] = 345678 ;
        sales[1][0] = 456789 ;
        sales[1][1] = 567890 ;
        sales[1][2] = 678901 ;
        
        System.out.println("Sales for each quater of each year from 2010: ");
        
        for(int i = 0; i < sales.length; i++){
            for(int x = 0; x < sales[i].length; x++){
                System.out.println("\tQ"+(x+1)+" "+sales[i][x]);
            }
            System.out.println("");
        }
    }
    
}
