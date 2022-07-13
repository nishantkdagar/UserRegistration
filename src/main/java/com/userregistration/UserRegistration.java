package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    public static void main(String[] args){
        System.out.println("To Check Name Validity, Press 1 for First Name or 2 for Last Name\n" +
                "or 3 for Email or 4 for Mobile Number and 5 for password");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1:
                firstName();
                break;
            case 2:
                lastName();
                break;
            case 3:
                emailID();
                break;
            case 4:
                phoneNo();
                break;
            case 5:
                passwordCheck();
                break;
            default:
                System.out.println("Please Enter either 1 or 2");
        }
    }
    public static void  firstName(){
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String name = input.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if(result)
        {
            System.out.println("Valid First Name");
        }else {
            System.out.println("Invalid First Name");
        }
    }
    public static void lastName(){
        String regex="^[A-Z]{1}[a-z]{2,}$";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        String name = input.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result){
            System.out.println("Last name is Valid");
        }else{
            System.out.println("Invalid Last Name");
        }
    }
    public static void emailID(){
        String regex="^[a-z]{3}[a-zA-z.]{0,}+@+bl.co+[a-z.]{0,}$";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Email Address: ");
        String email = input.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if(result){
            System.out.println("Email is valid");
        }else {
            System.out.println("Email is invalid");
        }
    }
    public static void phoneNo(){
        String regex="^[+]{1}[1-9]{1}[0-9]{0,1}\\s{1}[1-9]{1}[0-9]{9}$";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String number = input.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        boolean result = matcher.matches();
        if(result){
            System.out.println("Mobile number is valid");
        }else{
            System.out.println("Mobile number is invalid");
        }
    }
    public static void passwordCheck(){
        String regex="^(?=.*[A-Z])[A-Za-z0-9!@#$%^&*_]{7,}$";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        if(result){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid");
        }
    }
}
