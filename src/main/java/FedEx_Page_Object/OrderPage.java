package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends AbstractClass {

    ExtentTest logger;
    public  OrderPage(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;




    }

    @FindBy(xpath = "//a[contains(@aria-label,'Start Order')]")
    WebElement StartOrder;

    public void ClickonStartOrder(){
        Reusable_Actions_PageObject.clickOnElement(driver,StartOrder,logger,"StartOrder");
    }


}
