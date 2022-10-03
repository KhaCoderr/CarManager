/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entities;

import java.util.Scanner;
import training.utils.Validator;

/**
 *
 * @author NhiLamHet
 */
public abstract class Person {
    Validator check = new Validator();
    protected String name;
    protected String gender;
    protected String phoneNumber;
    protected String email;
    protected String birthDate;

    public Person() {
    }

    public Person(String name, String gender, String phoneNumber, String email, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       // if (email.matches("(.*)@(.*)"))
            this.email = email;
        
    }

    public String getBirthDate() {
            return birthDate;
    }

    public void setBirthDate(String birthDate) {
        //if (birthDate.matches("\\d{2}/\\d{2}/\\d{4}"))
            this.birthDate = birthDate;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        setName(sc.nextLine());
        
        System.out.print("Enter gender: ");
        setGender(sc.nextLine());
        
        System.out.print("Enter phone Number: ");
        setPhoneNumber(sc.nextLine());
        
        do {            
            try {
                System.out.print("Enter birthdate: ");
                setBirthDate(sc.nextLine());
                if(!check.checkBirthDay(birthDate)){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Something Wrong!!!");
            }
        } while (true);
        
        do {            
            try {
                System.out.print("Enter email: ");
                setEmail(sc.nextLine());
                if(!check.checkEmail(email)){
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Something Wrong!!!");
            }
        } while (true);
    }

    @Override
    public String toString() {
        return  super.toString();
    }


    
    
    
}
