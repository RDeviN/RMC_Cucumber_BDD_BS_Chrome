package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaigns {
	public WebDriver ldriver;

	public Campaigns(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Campaigns']")
	@CacheLookup
	WebElement menuCampaigns;

	public void clickCampaigns() {
		ldriver.manage().window().maximize();
		menuCampaigns.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
