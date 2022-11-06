package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    static Pattern emailId = Pattern.compile("^([a-z\\.]+)([a-z]*)@([a-z]{2,}+)\\.([a-z\\.]{2,}+)([a-z]*)$");

    static Pattern mobileNumber = Pattern.compile("^([0-9]{2,4}+)\\ ([0-9]{10}+)$");

    static Pattern passwordRule1 = Pattern.compile("^([A-za-z]{8,}+)$");

    static Pattern passwordRule2 = Pattern.compile("^(((?=.*?[A-Z])[A-Za-z]{8,}+))$");

    static Pattern passwordRule3 = Pattern.compile("^((?=.*?[A-Z])(?=.*?[0-9])[A-za-z0-9]{8,}+)$");

    static Pattern passwordRule4 = Pattern.compile("^((?=.*?[#@$?])(?=.*?[A-Z])(?=.*?[0-9])[A-za-z0-9#@$?]{8,}+)$");

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name : ");
        Matcher matcher1 = firstName.matcher(input.next());
        if(matcher1.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Enter Last name : ");
        Matcher matcher2 = lastName.matcher(input.next());
        if(matcher2.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Enter Email ID : ");
        Matcher matcher3 = emailId.matcher(input.next());
        if(matcher3.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Enter Mobile number With country code : ");
        Matcher matcher4 = mobileNumber.matcher(input.next());
        if(matcher4.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Set a password with minimum 8 characters : ");
        Matcher matcher5 = passwordRule1.matcher(input.next());
        if(matcher5.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Set a password with minimum 8 characters and having at least one capital letter  : ");
        Matcher matcher6 = passwordRule2.matcher(input.next());
        if(matcher6.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Set a password with minimum 8 characters and having at least one capital letter and at least one numeric value  : ");
        Matcher matcher7 = passwordRule3.matcher(input.next());
        if(matcher7.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Set a password with minimum 8 characters and having at least one capital letter, at least one numeric value and at least one special character : ");
        Matcher matcher8 = passwordRule4.matcher(input.next());
        if(matcher8.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }



    }

}
