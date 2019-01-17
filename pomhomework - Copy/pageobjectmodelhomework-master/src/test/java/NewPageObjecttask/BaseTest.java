package NewPageObjecttask;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils {

    protected static WebDriver driver;


    @BeforeTest

    public void openwebpage(){
        openbrowser();
    }

  //  @AfterTest
    public void closewebpage(){
        closebrowser();
    }

}
