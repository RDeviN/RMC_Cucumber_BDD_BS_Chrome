package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	public WebDriver ldriver;

	public Dashboard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Dashboard']")
	@CacheLookup
	WebElement menuDashboard;

	public void clickDashboard() {
		ldriver.manage().window().maximize();
		menuDashboard.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
