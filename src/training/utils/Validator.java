/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.utils;

/**
 *
 * @author NhiLamHet
 */
public class Validator {
    
    public Validator(){
        
    }
    
    public boolean checkMark(double mark){
        if(mark >= 0 && mark <= 10)
            return true;
        else
            return false;
    }
    public boolean checkBirthDay(String date){
        if(!date.matches("\\d{2}/\\d{2}/\\d{4}"))
            return false;
        else
            return true;
    }
    
    public boolean checkEmail(String email){
        if(!email.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}"))
            //^(.+)@(.+)$
            return false;
        else
            return true;
    }
}
