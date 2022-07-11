package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    public static void main(String[] args){
        System.out.println("To Check Name Validity, Press 1 for First Name or 2 for Last Name");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1:
            firstName();
            break;
            case 2:
            lastName();
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
}
