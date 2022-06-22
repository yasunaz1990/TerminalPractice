package tests;

import base.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Listeners(utils.TestListener.class)
public class SmokeTest extends TestBase {

    @Test
    public void testCase4() {
       // -- Test Data -- //
       String invalidUser = data().internet().emailAddress();
       String invalidPass = data().internet().password();
       String expected = "There isn't an account for this email";

       // -- Test Script -- //
       home().open();
       home().isDisplayed();
       home().clickLogInLink();

       login().signInWith(invalidUser, invalidPass);
       String actual = login().getErrorMessage();

       // -- Test Assertion -- //
       Assert.assertEquals(actual, expected);
   }

    @Test
    public void testCase5() {

        // -- Test Script -- //
        home().open();
        home().isDisplayed();
        home().clickSignUpLink();

        login().signInWith(invalidUser, invalidPass);
        String actual = login().getErrorMessage();

        // -- Test Assertion -- //
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testCase6() {
        // -- Test Data -- //
        String invalidUser = data().internet().emailAddress();
        String invalidPass = data().internet().password();

        // -- Test Script -- //
        home().open();
        home().isDisplayed();
        home().terminateAccount();

        login().signInWith(invalidUser, invalidPass);
        String actual = login().getErrorMessage();

        // -- Test Assertion -- //
        Assert.assertEquals(actual, expected);
    }
}