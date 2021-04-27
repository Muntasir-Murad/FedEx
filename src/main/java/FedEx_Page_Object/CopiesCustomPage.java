package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopiesCustomPage extends AbstractClass {
    ExtentTest logger;
    public CopiesCustomPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "//img[@alt='Copies & Custom Projects']") WebElement CopiesCustom;

    public void CopiesCustomMethod(){
        Reusable_Actions_PageObject.clickOnElement(driver,CopiesCustom,logger,"Copies & Custom");
    }

}
