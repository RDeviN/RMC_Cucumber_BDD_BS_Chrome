package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Operators {
	public WebDriver ldriver;

	public Operators(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Operators']")
	@CacheLookup
	WebElement menuOperators;

	public void clickOperators() {
		ldriver.manage().window().maximize();
		menuOperators.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
