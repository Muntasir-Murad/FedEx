package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends AbstractClass {
    ExtentTest logger;

    public  AddressPage(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;



    }
   @FindBy(xpath ="(//li[contains(@class,'active')])[2]")
    WebElement location;


    public void captureaddress() throws InterruptedException {
        Thread.sleep(5000);
        String addres = Reusable_Actions_PageObject.captureText(driver,location,0,logger,"Location");
        System.out.println(addres);

        logger.log(LogStatus.INFO, addres);
    }




}
