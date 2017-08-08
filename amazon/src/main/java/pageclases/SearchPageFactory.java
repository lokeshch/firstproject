package pageclases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	@FindBy(id="header-history-hp")
	WebElement headerHistory;
	@FindBy(id="flight-origin-hp-flight")
	WebElement originCity;
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;
	@FindBy(id="flight-type-multi-dest-label-hp-flight")
	WebElement multipleDestination;
	@FindBy(css=".btn-primary.btn-action.gcw-submit")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightTab()
	{
		//headerHistory.click();
		flightTab.click();
	}
	public void setOriginCity(String origin)
	{
		originCity.sendKeys(origin);
	}
	public void setDestinationCity(String destination)
	{
		destinationCity.sendKeys(destination);
	}
	public void setDepartureDate(String depDate)
	{
		departureDate.sendKeys(depDate);
	}
	public void setreturnDate(String teturnDate)
	{
		returnDate.sendKeys(teturnDate);
	}
	public void ClickSearchbutton()
	{
		searchButton.click();
	}
	public void clickRoundTrip()
	{
		roundTrip.click();
	}
	public void clickMultipleDestination()
	{
		multipleDestination.click();
	}
}
