package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends AbstractClass {
    ExtentTest logger;
    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//a[@id='cartToCheckoutBtn']") WebElement Checkout;

    public void CheckoutMethod() throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.clickOnElement(driver,Checkout,logger,"Checkout");
    }


    @FindBy(xpath = "//a[@id='continueAsGuest']")
    WebElement ProceedAsGuest;



    public void ProceedAsGuestMethod() throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.clickOnElement(driver,ProceedAsGuest,logger,"Proceed as a guest");


    }
}
