package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    public static void main(String[] args){
        System.out.println("Check if First Name is Valid");
        firstName();
    }
    public static void  firstName(){
        String name;
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        name = input.nextLine();
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
}
