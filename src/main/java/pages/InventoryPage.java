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

    public void addMultipleProducts(int amount) {
        for (int i = 0; i < amount; i++) {
            addToCartButtons.get(i).click();
        }
    }

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    public void logout() {
        menuButton.click();
        click(logoutLink); 
    }
}