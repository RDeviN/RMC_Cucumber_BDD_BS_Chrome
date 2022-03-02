package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forecast {
	public WebDriver ldriver;

	public Forecast(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Forecast']")
	@CacheLookup
	WebElement menuForecast;

	public void clickForecast() {
		ldriver.manage().window().maximize();
		menuForecast.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
