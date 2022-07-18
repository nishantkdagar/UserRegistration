package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface firstName{
    boolean validFirstName(String text) throws InvalidFirstName;
}
public class UserRegistration {
    firstName fName = name -> {
     if (name == null){
         throw new InvalidFirstName("First Name Can't  be Null");
    }
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if(!result)
        {
            throw new InvalidFirstName("First name needs to be minimum three chars long and start with a capital letter");
        }else {
            return result;
        }
    };
    public boolean lastName(String name) throws InvalidLastName{
        String regex="^[A-Z]{1}[a-z]{2,}$";
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String name = input.nextLine();*/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (!result){
            throw new InvalidLastName("Last name needs to be minimum three chars long and start with a capital letter");
        }else{
            return result;
        }

    }
    public boolean emailID(String email) throws InvalidEmail{
        String regex="^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter Email Address: ");
        String email = input.nextLine();*/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if(!result){
            throw new InvalidEmail("The email you entered is not valid, please enter your actual email.");
        }else {
            return result;
        }

    }
    public boolean phoneNo(String number){
        String regex="^[+]{1}[1-9]{1}[0-9]{0,1}\\s{1}[1-9]{1}[0-9]{9}$";
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String number = input.nextLine();*/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        boolean result = matcher.matches();
        /*if(result){
            System.out.println("Mobile number is valid");
        }else{
            System.out.println("Mobile number is invalid");
        }*/
        return result;
    }
    public boolean passwordCheck(String password){
        String regex="^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&_+=()])[A-Za-z0-9@#$%^&_=()]{8,}$";
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.nextLine();*/
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        /*if(result){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid");
        }*/
        return result;
    }
}
