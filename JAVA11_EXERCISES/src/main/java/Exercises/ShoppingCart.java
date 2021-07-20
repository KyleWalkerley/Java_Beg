/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author kyle_
 */
public class ShoppingCart {
    public static void main(String[] args) {
         //String custName = "Kyle";
        //String itemDesc = "Shoes";
        //String message = custName+" wants to purchase a "+itemDesc;
        
        //double price = 58.99;
        //int quantity = 2;
        //double tax = 1.04;
        //double total;
        
        //message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        
        //System.out.println(message);
        
        //total = quantity * price * tax;
        
        //System.out.println("Total cost plus tax: "+total);
        
        //boolean outOfStock = false;
        
        //if (quantity > 1){
        //    message = message +"s";
        //} 
        
        //if (outOfStock){  
        //    System.out.println(itemDesc+" There is none left.");
        //}
        //else{
        //    System.out.println(message);
        //    System.out.println("Total with tax: "+ total);
            
            Item item1, item2;
            item1 = new Item();
            item2 = new Item();
            
            item1.desc = "Shoes";
            item2.desc = "Hat";

            item1 = item2;
            System.out.println("Item1: " + item1.desc);
            System.out.println("Item2: " + item2.desc);
            
        }
    }
    
//}
