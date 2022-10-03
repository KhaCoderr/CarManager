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
public class PersonManage {
        Scanner sc = new Scanner(System.in);
        Person[] list; 
        Validator check = new Validator();
        int numOfPerson;  
        final int MAX=10;   
        public PersonManage(){
                       list=new Person[MAX]; 
                       numOfPerson=0;
                 }    

        public boolean addPerson(Person person) {
        if (person == null || numOfPerson > MAX) {
            return false;
        }
        list[numOfPerson] = person;
        numOfPerson++;
        return true;
    }
    public void displayTeacher(){
          if(numOfPerson==0)
              System.out.println("The list is empty!!!!!Enter to display information");
          for(int i=0; i< numOfPerson; i++){
              if(list[i] instanceof Teacher && ((Teacher) list[i]).calculateSalary()>1000){
                System.out.println(list[i]);
              }
              else 
                System.out.println("List with salary less than 1000 or empty");
      }
    }
    public void updateStudent(String id){
        if(numOfPerson==0){
            System.out.println("The list is empty!!!!!Enter to display information");
        }
        for(int i=0; i< numOfPerson; i++){
            if(list[i] instanceof Student){
                if( ((Student)list[i]).getStudentID().equals(id)) {
                    System.out.print("Update Student Informations: ");
                    ((Student) list[i]).input();
                } 
            do {            
                try {
                    System.out.print("Enter Theory mark: ");
                    ((Student)list[i]).setTheory(sc.nextDouble());
                    if(!check.checkMark(((Student)list[i]).getTheory())){
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
                    ((Student) list[i]).setPractice(sc.nextDouble());
                    if(!check.checkMark(((Student)list[i]).getPractice())){
                            throw new Exception();
                }
                break;
                } catch (Exception e) {
                        System.out.println("Something Wrong!!!!");
                }
            } while (true);
        }
    }
}
    public void report(){
        if(numOfPerson==0){
            System.out.println("The list is empty!!!!Enter to display information");
        }
        for (int i = 0; i < numOfPerson; i++) {
            if(list[i] instanceof Student && ((Student)list[i]).calculateFinalMark() >= 6){
                System.out.println(list[i]);
            }
            else 
                System.out.println("List with final mark less than 6 or empty");
        }
    }

}
