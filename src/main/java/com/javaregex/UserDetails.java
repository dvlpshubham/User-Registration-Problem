package com.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserDetails {
        /**
         * regex - regex pattern to be matched with user input
         */
        public String regex;

        /**
         * Method to match first name with regex
         *
         * @param firstName - User's First Name
         * @return
         */
        public boolean firstName(String firstName) {
            regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }

        /**
         * Method to match last name with regex
         *
         * @param lastName - User's Last Name
         * @return
         */
        public boolean lastName(String lastName) {
            regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        }

        /**
         * Method to match email with regex
         *
         * @param email - User's email
         * @return
         */
        public boolean email(String email) {
            regex = "^[a-z0-9]+([.][a-z0-9]+)*@bl[.]co[.][a-z]{2,3}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();

        }

        /**
         * Method to match phone with regex
         *
         * @param mobile - User's mobile
         * @return
         */
        public boolean mobile(String mobile) {
            regex = "^[0-9]{2}(\\s){1}[0-9]{10}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobile);
            return matcher.matches();
        }

        /***
         * Method to match password with regex
         *
         * @param password - User's password
         * @return
         */
        public boolean password(String password) {
            regex = "^[a-zA-Z0-9]{8,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }