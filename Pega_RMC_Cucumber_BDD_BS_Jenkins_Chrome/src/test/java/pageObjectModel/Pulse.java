package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pulse {
	public WebDriver ldriver;

	public Pulse(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Pulse']")
	@CacheLookup
	WebElement menuPulse;

	public void clickPulse() {
		ldriver.manage().window().maximize();
		menuPulse.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
