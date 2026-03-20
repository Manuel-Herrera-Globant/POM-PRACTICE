package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CartPage extends BasePage {

    @FindBy(className = "cart_button")
    private List<WebElement> removeButtons;

    @FindBy(className = "cart_item")
    private List<WebElement> cartItems;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void removeAllItems() {
        for (WebElement btn : removeButtons) {
            btn.click();
        }
    }

    public int getItemsCount() {
        return cartItems.size();
    }
}