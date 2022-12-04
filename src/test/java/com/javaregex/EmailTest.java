package com.javaregex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {
    /**
     * emailIds - Email id's to be checked expectedResult - is it valid (true) or
     * invalid email(false)
     */
    private String emailIds;
    private boolean expectedResult;

    /**
     * Constructor
     *
     * @param emailIds       - Email id's to be checked
     * @param expectedResult - result expectation - true or false for valid or
     *                       invalid
     */
    public EmailTest(String emailIds, boolean expectedResult) {
        this.emailIds = emailIds;
        this.expectedResult = expectedResult;
    }

    /**
     * Collection method with all emails and their expected results
     *
     * @return - Array list returned to be checked with test
     */
    @Parameterized.Parameters
    public static Collection mailIdsExpectedResult() {
        return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", false } });
    }

    /**
     * Test to check all the emails First created instance of Email Validator.
     * defined boolean result for the the instance by emailIdValidator with emailIds
     * Asserted if result is same as expected result
     */
    @Test
    public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
        EmailValidator testEmailIds = new EmailValidator();
        boolean result = testEmailIds.emailIdValidator(this.emailIds);
        Assertions.assertEquals(this.expectedResult, result);
    }
}
