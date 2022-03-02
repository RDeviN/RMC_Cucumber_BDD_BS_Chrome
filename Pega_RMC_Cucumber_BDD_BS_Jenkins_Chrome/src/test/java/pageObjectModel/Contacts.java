package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts {
	public WebDriver ldriver;

	public Contacts(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Contacts']")
	@CacheLookup
	WebElement menuContacts;

	public void clickContacts() {
		ldriver.manage().window().maximize();
		menuContacts.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
