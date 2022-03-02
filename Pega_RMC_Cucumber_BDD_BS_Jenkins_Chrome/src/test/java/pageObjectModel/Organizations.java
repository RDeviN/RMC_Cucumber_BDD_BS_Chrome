package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations {
	public WebDriver ldriver;

	public Organizations(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Organizations']")
	@CacheLookup
	WebElement menuOrganizations;

	public void clickOrganizations() {
		ldriver.manage().window().maximize();
		menuOrganizations.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
