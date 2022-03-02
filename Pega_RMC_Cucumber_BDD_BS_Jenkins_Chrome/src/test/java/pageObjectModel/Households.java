package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Households {
	public WebDriver ldriver;

	public Households(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Households']")
	@CacheLookup
	WebElement menuHouseholds;

	public void clickHouseholds() {
		ldriver.manage().window().maximize();
		menuHouseholds.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
