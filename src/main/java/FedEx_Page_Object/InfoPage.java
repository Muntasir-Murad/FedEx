package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPage extends AbstractClass {
    ExtentTest logger;

    public  InfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }
    @FindBy(xpath ="//a[text()='CONTINUE WITH EXISTING']")
    WebElement ContinueEXISTING;


    public void ClickonContinueExisting() throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.clickOnElement(driver,ContinueEXISTING,logger,"Continue EXISTING");
    }
    @FindBy(xpath = "//input[@class='quantity-field']")
    WebElement quantity;

    public void enterQuantity(String NumberofQuantiy) throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.sendKeysMethod(driver,quantity,NumberofQuantiy,logger,"Quantity");

    }

    @FindBy(xpath = "//button[text()='Add to cart']") WebElement AddToCart;
    public void AddToCartMethod() throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.clickOnElement(driver, AddToCart, logger, "AddToCart");

    }
}
