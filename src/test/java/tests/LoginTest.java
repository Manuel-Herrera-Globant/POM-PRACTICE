package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.login("standard_user", "secret_sauce");
        
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), 
            "El login falló o no redirigió a la página de inventario");
    }
}