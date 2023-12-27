package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage extends BasePage{

    public FlightsPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//li[@class='menu_Flights']//a[contains(.,'Flights')]")
    WebElement btnFlight;

    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")
    WebElement btnFromCity;

    @FindBy(xpath = "//div[.='Bangkok, Thailand BangkokBKK']")
    WebElement inputFromCity;

    @FindBy(xpath = "//input[@id='toCity']")
    WebElement btnToCity;

    @FindBy(xpath = "//div[.='Dubai, United Arab Emirates Dubai InternationalDXB']")
    WebElement inputToCity;

    @FindBy(xpath = "//div[@class='DayPicker-Months']//div[@class='DayPicker-Day']/div[.='1']")
    WebElement inputDate;

    @FindBy(xpath = "//div[@class='flt_fsw_inputBox flightTravllers inactiveWidget ']")
    WebElement btnTC;

    @FindBy(xpath = "//div[@class='appendBottom20']/ul[@class='guestCounter font12 darkText gbCounter']/li[.='\u200E3']")
    WebElement selectP;

    @FindBy(xpath = "//button[@class='primaryBtn btnApply pushRight']")
    WebElement btnApply;

    @FindBy(xpath = "//a[.='Search']")
    WebElement btnSearch;

    public void train(){
        clickAndWait(btnFlight);
        clickAndWait(btnFromCity);
        clickAndWait(inputFromCity);
        clickAndWait(btnToCity);
        clickAndWait(inputToCity);
        clickAndWait(inputDate);
        clickAndWait(btnTC);
        clickAndWait(selectP);
        clickAndWait(btnApply);
        clickAndWait(btnSearch);

    }
}
