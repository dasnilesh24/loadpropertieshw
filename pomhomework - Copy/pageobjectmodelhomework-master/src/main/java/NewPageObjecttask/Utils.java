package NewPageObjecttask;
//all methods should be there


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    //SELECT ELEMENT
    public static void select_element(By by) {
        driver.findElement(by).click();
    }

    //open browser method
    public static void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\program-java\\NewPageObjecttask27\\src\\main\\java\\browserdriver\\chromedriver.exe");
        //asign driver
        driver = new ChromeDriver();
        //30second implicitywait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open full screen
        // driver.manage().window().fullscreen();
        //open url
        driver.get("https://demo.nopcommerce.com");
    }

    //Close browser method
    public static void closebrowser() {
        driver.quit();
    }

    // methood for ENTER TEXT BY SENDKEYS

    public static void enter_text(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    //method to select an element by value
    public static void selectByValue(By by, String number) {
        Select value = new Select(driver.findElement(by));
        value.selectByValue(number);
    }

    //select by index method

    public static void selectByIndex(By by, int number) {
        Select value = new Select(driver.findElement(by));
        value.selectByIndex(number);
    }

    //     //Select by visible text method
    public static void selectbyVisibleText(By by, String text) {
        Select value = new Select(driver.findElement(by));
        value.selectByVisibleText(text);
    }

    //select date stamp
    public static String dateStamp() {
        DateFormat date = new SimpleDateFormat("MMddYYHHMMSS");
        Date date1 = new Date();
        String date2 = date.format(date1);
        return date2;
    }

    //gettext
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }
    //

}








