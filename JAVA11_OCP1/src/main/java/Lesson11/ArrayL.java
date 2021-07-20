/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.util.ArrayList;

/**
 *
 * @author kyle_
 */
public class ArrayL {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();

        names.add("Jamie");
        names.add("Sow");
        names.add("Adam");
        names.add("Jack");
        names.add(2, "Frank");

        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Jamie");

        System.out.println(names);
    }

}
