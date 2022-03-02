package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunities {
	public WebDriver ldriver;

	public Opportunities(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Opportunities']")
	@CacheLookup
	WebElement menuOpportunities;

	public void clickOpportunities() {
		ldriver.manage().window().maximize();
		menuOpportunities.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
