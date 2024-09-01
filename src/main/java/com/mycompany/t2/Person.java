/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2;

/**
 *
 * @author allec
 */
public abstract class Person {
    protected String bank_account;
    public String name;
    public int age;
    public String gender;
    
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
public abstract String GetRole();
}