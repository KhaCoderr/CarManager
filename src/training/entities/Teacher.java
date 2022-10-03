/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entities;

import java.util.Scanner;

/**
 *
 * @author NhiLamHet
 */
public class Teacher extends Person{
    private double bassicSalary;
    private double subsidy;

    public Teacher() {
    }

    public Teacher(double bassicSalary, double subsidy) {
        this.bassicSalary = bassicSalary;
        this.subsidy = subsidy;
    }

    public Teacher(double bassicSalary, double subsidy, String name, String gender, String phoneNumber, String email, String birthDate) {
        super(name, gender, phoneNumber, email, birthDate);
        this.bassicSalary = bassicSalary;
        this.subsidy = subsidy;
    }
    
    public double getBassicSalary() {
        return bassicSalary;
    }

    public void setBassicSalary(double bassicSalary) {
        this.bassicSalary = bassicSalary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }
    public double calculateSalary(){
         return (bassicSalary + subsidy);

    }
    
    public void inputTeacher(){
        Scanner sc = new Scanner(System.in);
        super.input();
        
        System.out.print("Enter Bassic Salary: ");
        setBassicSalary(sc.nextDouble());
        
        System.out.print("Enter Subsidy: ");
        setSubsidy(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "=======OUPUT TEACHER======="+
               "\nName =  "+super.name+
               "\nGender = "+super.gender+
               "\nPhone number = "+super.phoneNumber+
               "\nBirth Day = "+super.birthDate+
               "\nEmail = "+super.email+
               "\nBassicSalary = " + bassicSalary + 
               "\nSubsidy = " + subsidy;
               
    }

    
    
}
