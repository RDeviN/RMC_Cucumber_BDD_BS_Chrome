package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver ldriver;
	public String device_type;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		ldriver.manage().window().maximize();
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id='txtUserID']")
	@CacheLookup
	WebElement usernameTxtbox;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	@CacheLookup
	WebElement passwordTxtbox;

	@FindBy(xpath = "//button[@id='sub']")
	@CacheLookup
	WebElement loginBtn;

	public void username(String stext) {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUserID']")));
		usernameTxtbox.clear();
		usernameTxtbox.sendKeys(stext);
	}

	public void password(String stext) {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));
		passwordTxtbox.clear();
		passwordTxtbox.sendKeys(stext);
	}

	public void clickLogin() {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='sub']")));
		loginBtn.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
