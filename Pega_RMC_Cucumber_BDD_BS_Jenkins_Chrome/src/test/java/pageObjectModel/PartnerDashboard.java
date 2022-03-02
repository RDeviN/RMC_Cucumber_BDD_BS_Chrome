package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerDashboard {
	public WebDriver ldriver;

	public PartnerDashboard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Partner dashboard']")
	@CacheLookup
	WebElement menuPartnerDashboard;

	public void clickPartnerDashboard() {
		ldriver.manage().window().maximize();
		menuPartnerDashboard.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
