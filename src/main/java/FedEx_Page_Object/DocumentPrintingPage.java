package FedEx_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentPrintingPage extends AbstractClass {
    ExtentTest logger;

    public  DocumentPrintingPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.logger = AbstractClass.logger;

    }

    @FindBy(xpath = "//a[@title='Document Printing']")
    WebElement DocumentPrinting;

    public void ClickonDocumentPrinting() {
        Reusable_Actions_PageObject.clickOnElement(driver, DocumentPrinting, logger, "Document Printing");

    }
}
