/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2;

/**
 *
 * @author allec
 */
public class Staff extends Person implements KPIE{
    public String StaffID;
    private float kpi;
    private String Specialize;
    public float getKpi() {
        return kpi;
    }

    public void setKpi(float kpi) {
        this.kpi = kpi;
    }
    
    public String getSpecialize() {
        return Specialize;
    }

    public void setSpecialize(String Specialize) {
        this.Specialize = Specialize;
    }
    
    public Staff(String name, String StaffID, int age, String gender, String Specialize){
        super(name,age,gender);
        this.StaffID = StaffID;
        this.Specialize = Specialize;
       
    }

    @Override
    public String GetRole() {
        return "Staff";
        
    }

    @Override
    public double calculateKPI() {
       return 9;
    }
    
}
