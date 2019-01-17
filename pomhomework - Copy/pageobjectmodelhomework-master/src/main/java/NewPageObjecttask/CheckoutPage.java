//package NewPageObjecttask;

import org.openqa.selenium.By;

//public class CheckoutPage extends Utils {
  //  By obj
//}
//  user_should_register_succesfully();
//click on product
//        select_element(By.xpath("//img[@alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
//        //add to cart
//        select_element(By.xpath("//input[@id=\"add-to-cart-button-18\"]"));
//        //click on cart
//        select_element(By.xpath("//span[@class=\"cart-label\"]"));
//        //select term of service
//        select_element(By.xpath("//label[@for=\"termsofservice\"]"));
//        //click on check out
//        select_element(By.id("checkout"));
//        //enter country
//        Select country = new Select(driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]")));
//        country.selectByVisibleText("India");
//        //enter cityname
//
//        enter_text(By.xpath("//input[@id=\"BillingNewAddress_City\"]"), "Mumbai");
//        enter_text(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]"), "simpoli road");
//        enter_text(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]"), "mumbai 92");
//        enter_text(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]"), "0795123123");
//        select_element(By.xpath("//div[@id=\"billing-buttons-container\"]/input"));
//        select_element(By.xpath("//div[@id=\"shipping-method-buttons-container\"]"));
//        select_element(By.xpath("//img[@alt=\"Credit Card\"]"));
//        select_element(By.xpath("//div[@id=\"payment-method-buttons-container\"]"));
//        enter_text(By.xpath("//input[@id=\"CardholderName\"]"), "Nilesh");
//        enter_text(By.xpath("//input[@id=\"CardNumber\"]"), "4111 1111 1111 1111");
//        Select month = new Select(driver.findElement(By.xpath("//select[@id=\"ExpireMonth\"]")));
//        month.selectByValue("3");
//        Select year = new Select(driver.findElement(By.xpath("//select[@id=\"ExpireYear\"]")));
//        year.selectByValue("2020");
//        enter_text(By.xpath("//input[@id=\"CardCode\"]"), "737");
//        select_element(By.xpath("//div[@id=\"payment-info-buttons-container\"]"));
//        select_element(By.xpath("//div[@id=\"confirm-order-buttons-container\"]"));
//        String actualmessage = driver.findElement(By.xpath("//strong[contains(text(),\"Your order has been successfully processed!\")]")).getText();
//
//        System.out.println("actualmessage");
//        String expectedresult = "Your order has been successfully processed!";
//        Assert.assertEquals("test case failed", actualmessage, expectedresult);