/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2;

/**
 *
 * @author allec
 */
public class ITStaff extends Staff{
    
    
    public ITStaff(String name, String StaffID, int age, String gender, String Specialize){
            super(name, StaffID, age, gender, Specialize);
    
    }
    
    // Ghi đè
	@Override
	public String GetRole() {	
		
		return "ITStaff";
	}

	@Override
	public String toString() {
		return "ITStaff [ StaffID = " + StaffID + ", age = " + age + ", gender = "+ gender + ", name = " + name + ", Specialize =" + getSpecialize() +  "]";
	}
        
       @Override
	public double calculateKPI() {
		return 10;
	}
}
