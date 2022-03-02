package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Territories {
	public WebDriver ldriver;

	public Territories(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Territories']")
	@CacheLookup
	WebElement menuTerritories;

	public void clickTerritories() {
		ldriver.manage().window().maximize();
		menuTerritories.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
