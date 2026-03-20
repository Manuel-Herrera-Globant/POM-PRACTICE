package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CheckoutPage;

public class PurchaseTest extends BaseTest {

    @Test
    public void testPurchaseProduct() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        
        inventoryPage.addRandomProduct();
        inventoryPage.goToCart();

        checkoutPage.fillInformation("Manuel", "Herrera", "764007");
        checkoutPage.finishOrder();

        Assert.assertEquals(checkoutPage.getConfirmationMessage(), "Thank you for your order!", 
            "El mensaje de éxito no es el esperado");
    }
}