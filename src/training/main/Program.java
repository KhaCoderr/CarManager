/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.main;

import java.util.Scanner;
import training.entities.Person;
import training.entities.PersonManage;
import training.entities.Student;
import training.entities.Teacher;

/**
 *
 * @author NhiLamHet
 */
public class Program {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Person person;
        PersonManage object = new PersonManage();
        int choice=0;
        do {    
                System.out.println("======ADD PERSON=====");
                System.out.println("1.Add new person: ");
                System.out.println("2.Update student: ");
                System.out.println("3.Display teacher: ");
                System.out.println("4.Report: ");
                System.out.println("Another Exit: ");
                System.out.print("Choice:  ");
                sc = new Scanner(System.in);
                choice= Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1:
                        int a;
                        do { 
                            System.out.println("=====INPUT PERSON=====");
                            System.out.println("1.Input student: ");
                            System.out.println("2.Input teacher: ");
                            System.out.println("Another Exit:");
                            System.out.print("Choice: ");
                            a = Integer.parseInt(sc.nextLine());
                            switch(a){
                                case 1:
                                person = new Student();
                                ((Student) person).inputStudent();
                                if (object.addPerson(person)) {
                                    System.out.println("Complied!!\n");
                                }
                                break;
                                case 2:
                                person = new Teacher();
                                ((Teacher)person).inputTeacher();
                                if(object.addPerson(person)){
                                    System.out.println("Complied!!");
                                }
                                break;
                                default:
                                    System.out.println("You have exited input new person!!!!");
                                break;
                            }
                            
                        } while (a <= 2);
                        break;
                    case 2:
                        System.out.print("Enter update Student: ");
                        String id =sc.nextLine();
                        object.updateStudent(id);
                        System.out.println("Success!!!!");
                        break;
                    case 3:
                        object.displayTeacher();
                        System.out.println("Success!!!!");
                        break;
                    case 4:
                        object.report();
                        break;
                    default:
                        System.out.println("You have exited the program!!!");
                    break;
                        
                }
            
        } while (choice >0 || choice <=4);
    }
}
