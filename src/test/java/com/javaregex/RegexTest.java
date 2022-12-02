package com.javaregex;

import org.junit.jupiter.api.Test;

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
    public void testFistName() {
        boolean result = userDetails.firstName("Shubham");
        assertTrue(result);
    }

    /**
     * Methoed to verify last name
     */
    @Test
    public void testLastName() {
        boolean result = userDetails.lastName("Raj");
        assertTrue(result);
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
