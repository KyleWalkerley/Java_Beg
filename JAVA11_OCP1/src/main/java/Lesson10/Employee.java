/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10;

/**
 *
 * @author kyle_
 */
public class Employee {
    
    public String name1 = "Fred Smith";
    public String name2 = "fred Smith";
    public String name3 = "Jack Smith";
    
    public void areNamesEqual() {
    //if (name1.equalsIgnoreCase (name2)){
            //System.out.println("Same name.");
    //}else{
            //System.out.println("Different names.");
    //}
    
    String name = (name2 == name1) ? "Names are same." : "Names are not the same";
        System.out.println(name);
    }
    
}
