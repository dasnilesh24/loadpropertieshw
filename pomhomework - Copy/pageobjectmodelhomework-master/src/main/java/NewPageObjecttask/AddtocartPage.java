package NewPageObjecttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtocartPage extends Utils {
    //

    public AddtocartPage(WebDriver driver) {
    }

    //public void user_should_accept_terms_and_condition() {
//        //click on product
    public void clickOnProduct() { select_element(By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
    }

            //add to cart
    public void addToCart(){ select_element(By.xpath("//input[@id=\"add-to-cart-button-18\"]"));}
       //click on cart
public void clickOnCart(){select_element(By.xpath("//span[@class=\"cart-label\"]"));}
    //select checkout
public void clickCheckout(){       select_element(By.id("checkout"));}
//        String actualmessage = driver.findElement(By.id("terms-of-service-warning-box")).getText();
//        System.out.println("actualmessage");
//        String expectedresult = "Please accept the terms of service before the next step.";
//        Assert.assertEquals("test case failed", actualmessage, expectedresult);


}