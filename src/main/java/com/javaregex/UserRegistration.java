package com.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static final Scanner scanner = new Scanner(System.in);

    /*
     * @Purpose : Take First Name And Check It Is Getting Matched With Regex/Regular
     * Expression Or Not
     *
     * @param : Name, Regex, Matches
     */

    public static void validFirstName() {

        System.out.println("Enter First Name :");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();

        if (r)
            System.out.println("It Is A Valid First Name");
        else
            System.out.println("It Is Invalid First Name");

    }
    public static void validLastName() {

        System.out.println("Enter Last Name:");
        String lname = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lname);
        boolean r = m.matches();

        if (r)
            System.out.println("It Is A Valid Last Name");
        else
            System.out.println("It Is Invalid Last name");

    }
    public static void validEmail() {

        System.out.println("Enter E-mail:");
        String email = scanner.next();
        String regex = "^[a-z0-9]+([.][a-z0-9]+)*@bl[.]co[.][a-z]{2,3}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();

        if (r)
            System.out.println("Valid Email Address");
        else
            System.out.println("Email Address is Invalid");

    }
    public static void validMobileNumber() {

        System.out.print("Enter your Mobile Number : ");
        String phoneNo = scanner.nextLine();
        String regex3 = "^[0-9]{2}(\s){1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone Number is Valid");
        else
            System.out.println("Phone Number is Invalid");
    }
    public static void validPassRule1() {
        System.out.print("Enter The Password Atleast Eight Character : ");
        String passWord = scanner.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(passWord);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
}
