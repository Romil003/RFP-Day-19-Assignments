package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

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


    }

}
