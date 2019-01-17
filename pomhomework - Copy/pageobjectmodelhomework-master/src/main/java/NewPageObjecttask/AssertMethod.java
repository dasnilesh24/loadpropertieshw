package NewPageObjecttask;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class AssertMethod extends Utils {
    static SoftAssert softAssert = new SoftAssert();

    public void yourregistrationcompleted() {
        String actualRegisterSuccessmessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        String expectedresult = "Your registration completed";
        softAssert.assertEquals(actualRegisterSuccessmessage, expectedresult);
    }

    public void yourmessagehasbeensent() {
        String actualemailsentmessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();

        String expectedresult = "Your message has been sent.";
        softAssert.assertEquals(actualemailsentmessage, expectedresult);
    }

    public void onlyregisteredcustomerscanuseemailafriendfeature()
    {


        String acutalemailmessage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();

        String expectedresult = "Only registered customers can use email a friend feature";

        softAssert.assertEquals(acutalemailmessage, expectedresult);
    }
    public void pleaseacceptthetermsofservicebeforethenextstep(){

     String actualmessage = driver.findElement(By.id("terms-of-service-warning-box")).getText();
            String expectedresult = "Please accept the terms of service before the next step.";
           softAssert.assertEquals( actualmessage, expectedresult);}


}
