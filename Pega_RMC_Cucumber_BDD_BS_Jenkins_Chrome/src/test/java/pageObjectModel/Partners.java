package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Partners {
	public WebDriver ldriver;

	public Partners(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Partners']")
	@CacheLookup
	WebElement menuPartners;

	public void clickPartners() {
		ldriver.manage().window().maximize();
		menuPartners.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
