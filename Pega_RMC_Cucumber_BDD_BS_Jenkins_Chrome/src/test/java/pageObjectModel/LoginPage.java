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
	@FindBy(xpath = "//input[@id='input-17']")
	@CacheLookup
	WebElement ipUser;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement ipPwd;

	@FindBy(xpath = "//span[.='Login']") 
	@CacheLookup
	WebElement btnLogin;

	public void username(String stext) {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-17']")));
		ipUser.clear();
		ipUser.sendKeys(stext);
	}

	public void password(String stext) {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		ipPwd.clear();
		ipPwd.sendKeys(stext);
	}

	public void clickLogin() {
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Login']")));
		btnLogin.click();
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

}
