import FedEx_Page_Object.FedEx_BaseClass;
import ReusableLibrary.AbstractClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FedEx_Page_Object_Test extends AbstractClass {

    @Test

    public void fedex() throws InterruptedException {
        driver.get("https://www.fedex.com/en-us/home.html");

        FedEx_BaseClass.homePage().ClickonDesign();
        FedEx_BaseClass.homePage().ClickonAllProducts();


        FedEx_BaseClass.startOrderPage().ClickonStartOrder();


       FedEx_BaseClass.documentPrintingPage().ClickonDocumentPrinting();



        // Asset that you are on "FedEx Office Print Online" page
        String actualPageTitle = driver.getTitle();
        String expectedTitle = "FedEx Office Print Online";
        Assert.assertEquals(actualPageTitle,expectedTitle);

        //  -Copies & Custom Projects-
        FedEx_BaseClass.copiesCustomPage().CopiesCustomMethod();



        // -File Upload -
        FedEx_BaseClass.fileUploadPage().FileUploadMethod();
        FedEx_BaseClass.fileUploadPage().ImgUpload("C:\\Users\\Muntasir\\Pictures\\pjZiJ7.jpg");

        //FedEx_BaseClass.fileUploadPage().FileUploadMethod();
        //FedEx_BaseClass.fileUploadPage().ImgUpload("C:\\Users\\Muntasir\\Pictures\\pjZiJ7.jpg");


        // -PrintInfo-
        FedEx_BaseClass.printInfoPage().ClickonContinueExisting();
        FedEx_BaseClass.printInfoPage().enterQuantity("5");
        FedEx_BaseClass.printInfoPage().AddToCartMethod();

        // -CheckOutPage-
        FedEx_BaseClass.checkOutPage().CheckoutMethod();
        FedEx_BaseClass.checkOutPage().ProceedAsGuestMethod();

        // -PickupInfoPage-
        FedEx_BaseClass.pickupInfoPage().radius("10 Miles");
        FedEx_BaseClass.pickupInfoPage().ZipCodeMethod("08109");
        FedEx_BaseClass.pickupInfoPage().ContinueMethod();


        FedEx_BaseClass.addressPage().captureaddress();




















    }
}