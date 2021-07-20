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
public class HR{
    private String name;
    private int age;
    private int overTime;
    private double salary;
    
    public void display() {
        System.out.println("Enter your name: " + name);
        System.out.println("Enter your age: " + age);
        System.out.println("How much overtime have you done: " + overTime);
        System.out.println("What is your salary amount: " + salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}


