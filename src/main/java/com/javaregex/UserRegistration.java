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
}
