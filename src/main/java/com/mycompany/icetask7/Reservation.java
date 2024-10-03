/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask7;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
class Reservation {
    private String bookingcode;
    private String password;
    
    //Validate Booking Code
    public boolean checkBookingCode(String bookingcode){
        //Temp variable for checking
        boolean Found = false;
        //Check booking code
        if(bookingcode.contains("_") && bookingcode.length() <=12){
            //Assign to true
            Found = true;
        }else{
            //Assign to false
            Found = false;
        }
        return Found;    
    }
    
    //Validate password.
    public boolean checkPasswordComplexity(String password){
        //Pattern regex
        Pattern check_num = Pattern.compile("[0123456789]");
        Pattern check_uppercase = Pattern.compile("[QWERTYUIOPLKJHGFDSAZXCVBNM]");
        Pattern check_specials = Pattern.compile("[!@#$%^&*()-_=+\\|{};:/?.>]");
        
        //Declare a temp variable
        boolean Found = false;
        //Check all here
        if(check_num.matcher(password).find() && (check_uppercase.matcher(password).find()) && (check_specials.matcher(password).find())){
            //Assign temp variable to true
            Found = true;
        }else{
            //Re-assign to false
            Found = false;
        }
        return Found;
    }
    
    //Make a reservation
    public String makeReservation(String bookingcode, String password){
        this.bookingcode = bookingcode;
        this.password = password;
        
        if(!checkBookingCode(bookingcode)){
            System.out.println("Booking code is incorrectly formatted.");
            return "Booking code is incorrectly formatted.";
        }else if(!checkPasswordComplexity(password)){
            System.out.println("Password does not meet the complexity requirements.");
            return "Password does not meet the complexity requirements.";
        }else{
            System.out.println("Reservation successfully made!");
            return "Reservation successfully made!";
        }
    }
    
}
