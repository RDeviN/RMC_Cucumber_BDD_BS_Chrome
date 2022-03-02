package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkEmails {
	public WebDriver ldriver;

	public BulkEmails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Bulk emails']")
	@CacheLookup
	WebElement menuBulkEmails;

	public void clickBulkEmails() {
		ldriver.manage().window().maximize();
		menuBulkEmails.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
