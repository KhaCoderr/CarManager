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
public class Student extends Person{
     private String studentID;
     private double theory;
     private double practice;

    public Student() {
    }

    public Student(String studentID, double theory, double practice) {
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }

    public Student(String studentID, double theory, double practice, String name, String gender, String phoneNumber, String email, String birthDate) {
        super(name, gender, phoneNumber, email, birthDate);
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    
    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }

   
    public double calculateFinalMark(){
            return (theory+practice)/2;
    }
    
    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("=====INPUT STUDENT======");
        System.out.println("========================");
        super.input();
        
        System.out.print("Enter student ID: ");
        studentID = sc.nextLine();
        
        do {            
            try {
                System.out.print("Enter Theory mark: ");
                setTheory(sc.nextDouble());
                if(!check.checkMark(theory)){
                    throw new Exception();
                }
                break;
                
            } catch (Exception e) {
                System.out.println("Something Wrong!!!!");
            }
        } while (true);
        
        do {            
            try {
                System.out.print("Enter Practice mark: ");
                setPractice(sc.nextDouble());
                if(!check.checkMark(practice)){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Something Wrong!!!!");
            }
        } while (true);
        
        
        
    }

    @Override
    public String toString() {
        return "=====OUTPUT STUDENT====="+
               "\nName =  "+super.name+
               "\nGender = "+super.gender+
               "\nPhone number = "+super.phoneNumber+
               "\nBirth Day = "+super.birthDate+
               "\nEmail = "+super.email+
               "\nStudent ID = "+studentID+
               "\nTheory = "+theory+
               "\nPractice = "+practice+
               "\n=========END===========\n";
    }
}
