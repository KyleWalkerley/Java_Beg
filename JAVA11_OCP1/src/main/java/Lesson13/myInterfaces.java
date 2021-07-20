/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kyle_
 */
public class myInterfaces {
    public static void main(String[] args) {
        String[] names = {"Sam", "James", "Russouw"};
        List<String> myList = new ArrayList(Arrays.asList(names));
        
//        myList.replaceAll(s -> s.toUpperCase());
        myList.removeIf(s -> s.equals("James"));
        
//        System.out.println("myList.replaceAll lambda: "+ myList);
        System.out.println(myList);
    }
}
