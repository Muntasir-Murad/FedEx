package FedEx_Page_Object;


import ReusableLibrary.AbstractClass;

public class FedEx_BaseClass extends AbstractClass {
    //Home Page
    public static HomePage homePage(){
       HomePage homePage = new HomePage(driver);
        return homePage;
    }
    //Home Page
    public static DocumentPrintingPage documentPrintingPage(){
        DocumentPrintingPage documentPrintingPage = new DocumentPrintingPage(driver);
        return documentPrintingPage;
    }

    public static OrderPage startOrderPage(){
        OrderPage startOrderPage = new OrderPage(driver);
        return startOrderPage;
    }
    //Home Page
    public static CopiesCustomPage copiesCustomPage(){
        CopiesCustomPage copiesCustomPage = new CopiesCustomPage(driver);
        return copiesCustomPage;
    }
    //Home Page
    public static FileUploadPage fileUploadPage(){
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        return fileUploadPage;
    }
    //Home Page
    public static InfoPage printInfoPage(){
        InfoPage printInfoPage = new InfoPage(driver);
        return printInfoPage;
    }
    //Home Page
    public static CheckOutPage checkOutPage(){
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        return checkOutPage;
    }
    //Home Page
    public static PickupInfoPage pickupInfoPage(){
        PickupInfoPage pickupInfoPage = new PickupInfoPage(driver);
        return pickupInfoPage;
    }
    //Home Page
    public static AddressPage addressPage(){
        AddressPage addressPage = new AddressPage(driver);
        return addressPage;
    }
}
