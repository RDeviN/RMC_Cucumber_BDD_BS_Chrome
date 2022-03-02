package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWork {
	public WebDriver ldriver;

	public MyWork(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='My Work']")
	@CacheLookup
	WebElement menuMyWork;

	public void clickMyWork() {
		ldriver.manage().window().maximize();
		menuMyWork.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
