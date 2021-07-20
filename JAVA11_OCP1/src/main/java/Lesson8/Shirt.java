/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author kyle_
 */
public class Shirt {
    
    public String description;
    public char colorCode;
    public double price;
    
    
    
    public Shirt(String description, String color, double price){
        this.description = description;
        setColorCode(color);
        this.price = price;
    }
    
    public void display(){
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code:" + colorCode);
        System.out.println("Shirt Price:" + price);
    }

    public void setColorCode(String theColor) {
        if(theColor.length() > 0){
        colorCode = theColor.charAt(0);
        }
    }
    
    
    
}
