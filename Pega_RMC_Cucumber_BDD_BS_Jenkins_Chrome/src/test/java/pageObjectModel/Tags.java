package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tags {
	public WebDriver ldriver;

	public Tags(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Tags']")
	@CacheLookup
	WebElement menuTags;

	public void clickTags() {
		ldriver.manage().window().maximize();
		menuTags.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
