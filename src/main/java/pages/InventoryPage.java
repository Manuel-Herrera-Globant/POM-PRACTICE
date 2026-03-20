package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Random;

public class InventoryPage extends BasePage {

    @FindBy(className = "inventory_item")
    private List<WebElement> products;

    @FindBy(className = "btn_inventory")
    private List<WebElement> addToCartButtons;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void addRandomProduct() {
        Random random = new Random();
        int index = random.nextInt(addToCartButtons.size());
        addToCartButtons.get(index).click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}