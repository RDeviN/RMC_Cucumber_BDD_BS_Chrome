package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accounts {
	public WebDriver ldriver;

	public Accounts(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Accounts']")
	@CacheLookup
	WebElement menuAccounts;

	public void clickAccounts() {
		ldriver.manage().window().maximize();
		menuAccounts.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
