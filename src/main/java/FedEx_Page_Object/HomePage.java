package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractClass {
    ExtentTest logger;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;
    }

    @FindBy(xpath ="//span[contains(text(),'Design')]")
    WebElement Design;

    public void ClickonDesign() {
        Reusable_Actions_PageObject.clickOnElement(driver,Design,logger,"Design & Print");
    }

    @FindBy(xpath ="//a[contains(@aria-label,'All Products')]")
    WebElement AllProducts;

    public void ClickonAllProducts() {
        Reusable_Actions_PageObject.clickOnElement(driver,AllProducts,logger,"All Products");
    }

}




