package FedEx_Page_Object;


import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PickupInfoPage extends AbstractClass {
    ExtentTest logger;
    public PickupInfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//select[@id='radiusSelect']")
    WebElement Miles;

    public void radius(String miles) throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.dropdownByText(driver,Miles,miles,logger,"Miles");
    }

    @FindBy(xpath = "//input[@id='loc_seacrh_text']") WebElement ZipCode;

    public void ZipCodeMethod(String zip) throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.sendKeysMethod(driver,ZipCode,zip,logger,"ZipCode");
    }
    @FindBy(xpath = "//a[@id='saveNContBtn']") WebElement Continue;
    public void ContinueMethod() throws InterruptedException {
        Thread.sleep(3000);
        Reusable_Actions_PageObject.clickOnElement(driver, Continue, logger, "Continue");


    }
}
