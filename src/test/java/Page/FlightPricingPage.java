package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPricingPage extends BasePage{
    public FlightPricingPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(),this);
    }

    @FindBy(xpath = "//div[@class='clusterContent']//div[@class='textRight flexOne']/div[.='₹ 29,404per adult']")
    WebElement txtFlightPrices;

    public String getPricesText(){
        return getText(txtFlightPrices);
    }
}
