package com.javaregex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {
    /**
     * New instance userDetails created for UserDetails
     */
    UserDetails userDetails = new UserDetails();

    /**
     * Method to verify first name
     */
    @Test
    public void testFistName() throws NullPointerException {
        boolean result = userDetails.testFirstName(null);
        assertTrue(result);
    }

    /**
     * Method to verify last name
     */
    @Test
    public void testLastName() {
        boolean result = userDetails.testLastName("Raj");
        assertTrue(result);
    }
    @Test
    public void testLastNameFalse() {
        boolean result = userDetails.testLastName("raj");
        assertFalse(result);
    }

    /**
     * Method to verify email
     */
    @Test
    public void testEmail() {
        boolean result = userDetails.email("shubham.raj@bl.co.in");
        assertTrue(result);
    }

    /**
     * Method to test Mobile no.
     */
    @Test
    public void testMobile() {
        boolean result = userDetails.mobile("91 7004635191");
        assertTrue(result);
    }

    /**
     * Method to test password
     */
    @Test
    public void testPassword() {
        boolean result = userDetails.password("shuB12345");
        assertTrue(result);
    }
}
