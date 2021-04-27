package FedEx_Page_Object;


import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends AbstractClass {
    ExtentTest logger;
    public FileUploadPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = AbstractClass.logger;
    }
    @FindBy(xpath = "(//a[@name='upload-files-button'])[1]") WebElement FileUpload;
    public void FileUploadMethod(){
        Reusable_Actions_PageObject.clickOnElement(driver,FileUpload,logger,"File Upload");
    }

    public void ImgUpload(String path) throws InterruptedException {
        Reusable_Actions_PageObject.uploadFile(path);
        Thread.sleep(5000);
    }
}
