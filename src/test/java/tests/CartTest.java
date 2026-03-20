package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;

public class CartTest extends BaseTest {

    @Test
    public void testRemoveElementsFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        
        inventoryPage.addMultipleProducts(3);
        inventoryPage.goToCart();

        cartPage.removeAllItems();

        Assert.assertEquals(cartPage.getItemsCount(), 0, "El carrito no está vacío después de remover los productos");
    }
}