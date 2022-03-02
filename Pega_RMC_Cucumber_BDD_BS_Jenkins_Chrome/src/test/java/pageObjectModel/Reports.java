package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {
	public WebDriver ldriver;

	public Reports(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Reports']")
	@CacheLookup
	WebElement menuReports;

	public void clickReports() {
		ldriver.manage().window().maximize();
		menuReports.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
