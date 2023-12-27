package test;

import Page.FlightPricingPage;
import Page.FlightsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightsTest extends BaseWebTest{

    @Test
    public void successSearch() {
        FlightsPage trainPage = new FlightsPage(driver, explicitWait);
        FlightPricingPage flightPricingPage = new FlightPricingPage(driver,explicitWait);

        trainPage.train();
        System.out.println("Berhasil Select Data");
        String txtExpectedFlightPrices = "₹ 29,404\n" +
                "per adult";
        Assert.assertEquals(txtExpectedFlightPrices,flightPricingPage.getPricesText());

        //System.out.println(txtExpectedFlightPrices);

    }
}
