/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author kyle_
 */
public class myClass {
    public static void main(String[] args) {
        Customer customer1 = new Customer("542 havdge",465,50);
        Customer customer2 = new Customer("542 havdge",465,50);
        
        customer1.age = 25;
        customer2.name = "Duke";
        
        customer1.displayCustomer();
        customer2.displayCustomer();
        
    }
    
}
