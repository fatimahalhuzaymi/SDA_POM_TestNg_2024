import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C06_FacebookNegativeLoginTest {
    /*
    //Go to https://www.facebook.com/
//Log in (faker class)
//Test the "Failed to login" message
FacebookFacebook
Log into Facebook
Log into Facebook to start sharing and connecting with your friends, family, and people you know.
     */
@Test
public void driverClassTest() {
    Driver.getDriver().get("https://www.facebook.com/");

    //Verify title contains OrangeHRM.
    String title = Driver.getDriver().getTitle();
    Assert.assertTrue(title.contains("OrangeHRM"));
    Driver.closeDriver();
}
}
