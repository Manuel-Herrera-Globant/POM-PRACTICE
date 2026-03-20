package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement zipCodeInput;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    @FindBy(id = "finish")
    private WebElement finishBtn;

    @FindBy(className = "complete-header")
    private WebElement completeHeader;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationMessage() {
        return completeHeader.getText();
    }


    public void fillInformation(String fname, String lname, String zip) {
        checkoutBtn.click();
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        zipCodeInput.sendKeys(zip);
        continueBtn.click(); 
    }

    public void finishOrder() {
        click(finishBtn); 
    }
}