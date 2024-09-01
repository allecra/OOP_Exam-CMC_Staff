/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2;


import java.util.Scanner;

/**
 *
 * @author allec
 */
public final class Main {
     public static void main(String[] args) {
        
        //Cau 1:
        OfficeStaff off = new OfficeStaff("Tam","bit230372",19,"nu","OfficeStaff");
        SalesAgent sale = new SalesAgent("Huyen","abc12345",18,"nu","SalesAgent");
        
        //In ra gtri 
        System.out.println("Thong tin OfficeStaff: "+off.toString());
        System.out.println("KPI: "+off.calculateKPI());
        System.out.println("Thong tin SalesAgent: "+sale.toString());
        System.out.println("KPI: "+sale.calculateKPI());
        
        //Cau 2:
        
        // Khởi tạo một đối tượng nhập dữ liệu sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.println("/// Cau 2 ///");
        
        int n = NhapsoN(sc); // Nhập số lượng sinh viên từ người dùng
        Staff[] staff = Nhapmang(n, sc); // Nhập thông tin sinh viên và lưu vào mảng students
                
        //Hien thi kq
        Hienthi(staff);
        
        //Cau 3:
               System.out.println("//// Cau 3 ////");
                
               Form_nv gui = new Form_nv(staff);
               gui.displayStaff(staff);
               gui.setVisible(true);
    }
    
     // nhập vào 1 số nguyên dương n. Nhập sai thì nhập lại.
     public static int NhapsoN(Scanner sc){
       int n; 
       do{
           System.out.println("Nhap vao mot so nguyen n: ");
           while (!sc.hasNextInt()){
               System.out.println("Vui long nhap lai !!!(phai la so nguyen duong): ");
               sc.next();
           }
           n = sc.nextInt();
           sc.nextLine();
       }while(n<=0);
        return n;
    }
     
    
   
    public static Staff[] Nhapmang(int n, Scanner sc){
    Staff[] staff = new Staff[n];
    for(int i = 0; i < n; i++){
        System.out.println("Nhap vao thong tin nhan vien " + (i+1) + ":");
        String Specialize = Nhapchuyenmon(sc);
        String StaffID = NhapStaffID(sc);
        String name = Nhapchuoi(sc, "Ten");
        int age = NhapTuoi(sc);
        String gender = Nhapchuoi(sc, "Gioi tinh");
        
        switch (Specialize) {
            case "VP":
                staff[i] = new OfficeStaff(name, StaffID, age, gender, Specialize);
                break;
            case "BH":
                staff[i] = new SalesAgent(name, StaffID, age, gender, Specialize);
                break;
            case "IT":
                staff[i] = new ITStaff(name, StaffID, age, gender, Specialize);
                break;
            default:
                System.out.println("Vui long nhap lai!!!");
                i--;
                break;
        }
    }
    return staff;
}
    // hàm xử lí lỗi:
    
    public static String Nhapchuyenmon(Scanner sc){
        String chuyenmon;
        do{
            System.out.println("Nhap vao chuyen mon (VP/BH/IT): ");
            chuyenmon = sc.nextLine();
            if(!chuyenmon.equals("VP")&& !chuyenmon.equals("BH") && !chuyenmon.equals("IT")){
                System.out.println("Vui long nhap lai!!!");
            }else{
                return chuyenmon;
            }
        }while(true);
    }
      // Ham nhap StaffID (9 chu so)

    /**
     *
     * @param sc
     * @return
     */
    public static String NhapStaffID(Scanner sc) {
    String staffID;
    boolean isNumeric;
    do {
        System.out.println("Nhap vao StaffID (9 chu so): ");
        staffID = sc.nextLine();
        isNumeric = staffID.matches("\\d+"); // Kiểm tra xem chuỗi có phải là số hay không
    } while (staffID.length() != 9 || !isNumeric);
    return staffID;
}

    public static int NhapTuoi(Scanner sc) {
        int age;
        do {
            System.out.println("Nhap vao tuoi: ");
            while (!sc.hasNextInt()) {
                System.out.println("Vui long nhap lai !!! (phai la so nguyen duong): ");
                sc.next();
            }
            age = sc.nextInt();
            sc.nextLine();
        } while (age <= 0 || age >=150);
        return age;
    }
    // hàm nhập vào chuỗi (name, gender)
    public static String Nhapchuoi(Scanner sc, String filename ){
        String input;
        do {
            System.out.println("Nhap vao "+filename+":");
            input = sc.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui long nhap "+filename+":");
            }else{
                return input;
            }
        }while(true);
    }
    // Hàm hiển thị 
    public static void Hienthi(Staff[]staff){
        System.out.println("Thong tin nhan vien: ");
        for (Staff Staff : staff){
            System.out.println(Staff.toString());         
        }
    }
}

