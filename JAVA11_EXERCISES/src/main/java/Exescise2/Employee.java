/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exescise2;

/**
 *
 * @author kyle_
 */
public class Employee extends HR{
    public static void main(String[] args) {
        Employee myEmployees = new Employee();
        myEmployees.setName("Jan");
        myEmployees.setAge(28);
        myEmployees.setOverTime(15);
        myEmployees.setSalary(520000.00);
        
    }
    public void display(){
        System.out.println("Name" + getName);
        System.out.println("Age" + getAge);
        System.out.println("Overtime" + getOverTime);
        System.out.println("Salary" + getSalary);
    }
}
