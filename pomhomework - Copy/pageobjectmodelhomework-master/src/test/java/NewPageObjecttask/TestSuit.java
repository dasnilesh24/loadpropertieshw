package NewPageObjecttask;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    private static RegistrationPage object;
    AssertMethod assertobj = new AssertMethod();
    //program =1

    @Test

    public void user_should_register_succesfully() {
        RegistrationPage object = new RegistrationPage(driver);
        object.register();
        object.gender();
        object.firstname();
        object.lastname();
        object.birthday();
        object.birthmonth();
        object.birthyear();
        object.email();
        object.companyname();
        object.newsletter();
        object.password();
        object.confirmpassword();
        object.registerbutton();
        assertobj.yourregistrationcompleted();
        object.entercontinue();
        System.out.println("Pass 1");


    }

    //Programme 2
    @Test
    public void user_should_able_to_email_friend() {
        EmailPage email = new EmailPage(driver);

        user_should_register_succesfully();
        email.productclick();
        email.emailfriend();
        email.emailaddress();
        email.personalmessage();
        email.sendemailbutton();
        assertobj.yourmessagehasbeensent();
        System.out.println("Pass 2");


    }

    @Test
    public void unregister_user_shouldnot_able_to_send_email_friend() {
        ProductPage product = new ProductPage(driver);
        product.productclick();
        product.emailfriend();
        product.emailaddress();
        product.youremailaddress();
        product.personalmessage();
        product.sendemailbutton();
        assertobj.onlyregisteredcustomerscanuseemailafriendfeature();
        System.out.println("Pass 3");

    }

    @Test
    public void user_should_accept_terms_and_condition() {
        AddtocartPage addtocart = new AddtocartPage(driver);
        addtocart.clickOnProduct();
        addtocart.addToCart();
        addtocart.clickOnCart();
        addtocart.clickCheckout();
        assertobj.pleaseacceptthetermsofservicebeforethenextstep();
        System.out.println("pass 4");


    }
     @Test
    public void  useer_should_able_to_buy_product_successfully(){

     }

}

