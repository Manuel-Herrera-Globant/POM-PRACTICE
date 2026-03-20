package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.logout();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.equals("https://www.saucedemo.com/") || currentUrl.contains("index.html"), 
            "El logout falló: No se redirigió a la página de inicio de sesión. URL actual: " + currentUrl);
    }
}