package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tools {
	public WebDriver ldriver;

	public Tools(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Tools']")
	@CacheLookup
	WebElement menuTools;

	public void clickTools() {
		ldriver.manage().window().maximize();
		menuTools.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
