package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leads {
	public WebDriver ldriver;

	public Leads(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[@class='menu-item-icon-imageclass pi pi-home-solid']")
	@CacheLookup
	WebElement menuHover;

	@FindBy(xpath = "//span[@class='menu-item-icon-imageclass pi pi-flashlight-ne-solid']")
	@CacheLookup
	WebElement menuLeads;

	@FindBy(xpath = "//button[@data-test-id='20141211043154016568414']")
	@CacheLookup
	WebElement btnCreate;

	@FindBy(xpath = "//span[@class='menu-item-title'][.='Individual']")
	@CacheLookup
	WebElement submenuIndividual;

	@FindBy(xpath = "//input[@id='546ad300']")
	@CacheLookup
	WebElement keyinFN;

	@FindBy(xpath = "//input[@id='6e54da89']")
	@CacheLookup
	WebElement keyinLN;

	@FindBy(xpath = "//input[@id='671676a5']")
	@CacheLookup
	WebElement keyinAddress;

	@FindBy(xpath = "//input[@id='3e859dcf']")
	@CacheLookup
	WebElement keyinCity;

	@FindBy(xpath = "//input[@id='89ef27f0']")
	@CacheLookup
	WebElement keyinState;

	@FindBy(xpath = "//input[@id='31004d41']")
	@CacheLookup
	WebElement keyinZip;

	@FindBy(xpath = "//select[@id='7d503c42']")
	@CacheLookup
	WebElement menuCountry;

	@FindBy(xpath = "//select[@id='7d503c42']/option[.='United States']")
	@CacheLookup
	WebElement selectCountryUS;

	@FindBy(xpath = "//button[.='Submit']")
	@CacheLookup
	WebElement btnSubmit;

	@FindBy(xpath = "//button[@data-test-id='20141211043154016568414']")
	@CacheLookup
	WebElement removeHover;

	@FindBy(xpath = "//input[@id='6d36aebb']")
	@CacheLookup
	WebElement searchLead;

	@FindBy(xpath = "//i[@data-test-id='20190911130636037429876']")
	@CacheLookup
	WebElement btnsearchLead;

	@FindBy(xpath = "//a[@title='Lead name']")
	@CacheLookup
	WebElement selectIndividualLead;

	@FindBy(xpath = "//div[@class='content-item content-sub_section item-2 remove-all-spacing flex flex-row']/div/div/div/div/div/div/span/button")
	@CacheLookup
	WebElement btnEdit;

	@FindBy(xpath = "//div[@class='content-item content-sub_section item-2 remove-all-spacing flex flex-row']/div/div/div[3]/span/button")
	@CacheLookup
	WebElement btnActions;

	@FindBy(xpath = "//span[.='Convert lead']")
	@CacheLookup
	WebElement menuConvertlead;

	@FindBy(xpath = "//input[@id='d118ec10']")
	@CacheLookup
	WebElement keyinFirstname;

	@FindBy(xpath = "//input[@id='8dcd183b']")
	@CacheLookup
	WebElement keyinOpportunityname;

	@FindBy(xpath = "//input[@id='1dfe6fd2']")
	@CacheLookup
	WebElement keyinAmount;

	@FindBy(xpath = "//input[@id='c0445fa3']")
	@CacheLookup
	WebElement keyinClosedate;

	@FindBy(xpath = "//button[.='Submit']")
	@CacheLookup
	WebElement btnConvertLeadSubmit;

	public void clickContinue() throws InterruptedException {
		Actions action = new Actions(ldriver);
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Continue']")));
			WebElement btnContinue = ldriver.findElement(By.xpath("//span[.='Continue']"));
			btnContinue.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Continue']")));
			WebElement btnContinue = ldriver.findElement(By.xpath("//span[.='Continue']"));
			btnContinue.click();
		}
	}
	
	public void ipVerificationCode() throws InterruptedException {
		Actions action = new Actions(ldriver);
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-77']")));
			WebElement ipVerificationCode = ldriver.findElement(By.xpath("//input[@id='input-77']"));
			ipVerificationCode.click();
			ipVerificationCode.sendKeys("000000");
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-77']")));
			WebElement ipVerificationCode = ldriver.findElement(By.xpath("//input[@id='input-77']"));
			ipVerificationCode.sendKeys("000000");
		}
	}

	public void clickNext() throws InterruptedException {
		Actions action = new Actions(ldriver);
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Next']")));
			WebElement btnNext = ldriver.findElement(By.xpath("//span[.='Next']"));
			btnNext.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Next']")));
			WebElement btnNext = ldriver.findElement(By.xpath("//span[.='Next']"));
			btnNext.click();
		}
	}

	public void clickCRM() throws InterruptedException {
		Actions action = new Actions(ldriver);
		String s = ldriver.getWindowHandles();
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			for(String i:s){
				String t=driver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
			/*
			ldriver.switchTo().frame(0);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='l'][.='crm']")));
			WebElement linkCRM = ldriver.findElement(By.xpath("//a[@class='l'][.='crm']"));
			linkCRM.click();
			ldriver.switchTo().parentFrame();
			*/
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			for(String i:s){
				String t=driver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
			/*
			ldriver.switchTo().frame(0);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='l'][.='crm']")));
			WebElement linkCRM = ldriver.findElement(By.xpath("//a[@class='l'][.='crm']"));
			linkCRM.click();
			ldriver.switchTo().parentFrame();
			*/
		}
		
	}

	public void clickLeads() throws InterruptedException {
		Actions action = new Actions(ldriver);
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-home-solid']")));
			WebElement menuHover = ldriver.findElement(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-home-solid']"));	
			action.moveToElement(menuHover).perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-flashlight-ne-solid']")));
			WebElement menuLeads = ldriver.findElement(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-flashlight-ne-solid']"));
			menuLeads.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-home-solid']")));
			WebElement menuHover = ldriver.findElement(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-home-solid']"));
			action.moveToElement(menuHover).perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-flashlight-ne-solid']")));
			WebElement menuLeads = ldriver.findElement(By.xpath("//span[@class='menu-item-icon-imageclass pi pi-flashlight-ne-solid']"));
			menuLeads.click();
		}
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void clickCreateLeads() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test-id='20141211043154016568414']")));
		btnCreate.click();
	}

	public void selectIndividual() {
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-item-title'][.='Individual']")));
		    WebElement submenuIndividual = ldriver.findElement(By.xpath("//span[@class='menu-item-title'][.='Individual']"));		    
		    submenuIndividual.click();	
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='menu-item-title'][.='Individual']")));
		    WebElement submenuIndividual = ldriver.findElement(By.xpath("//span[@class='menu-item-title'][.='Individual']"));		    
		    submenuIndividual.click();
		}
	}

	public void keyinLeadIndividual() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='546ad300']")));
		keyinFN.sendKeys("James");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='6e54da89']")));
		keyinLN.sendKeys("A");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='671676a5']")));
		keyinAddress.sendKeys("600, Asylum Avenue");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='3e859dcf']")));
		keyinCity.sendKeys("Hartford");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='89ef27f0']")));
		keyinState.sendKeys("CT");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Submit']")));
		btnSubmit.click();
	}

	public void removeHover() {
		Actions action = new Actions(ldriver);
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test-id='20141211043154016568414']")));
			WebElement removeHover = ldriver.findElement(By.xpath("//button[@data-test-id='20141211043154016568414']"));
			action.moveToElement(removeHover).perform();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test-id='20141211043154016568414']")));
			WebElement removeHover = ldriver.findElement(By.xpath("//button[@data-test-id='20141211043154016568414']"));
			action.moveToElement(removeHover).perform();
		}
	}

	public void searchLead() {
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='6d36aebb']")));
			WebElement searchLead = ldriver.findElement(By.xpath("//input[@id='6d36aebb']"));
			searchLead.clear();
			searchLead.click();
			searchLead.sendKeys("James");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@data-test-id='20190911130636037429876']")));
			WebElement btnsearchLead = ldriver.findElement(By.xpath("//i[@data-test-id='20190911130636037429876']"));
			btnsearchLead.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='6d36aebb']")));
			WebElement searchLead = ldriver.findElement(By.xpath("//input[@id='6d36aebb']"));
			searchLead.clear();
			searchLead.click();
			searchLead.sendKeys("James");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@data-test-id='20190911130636037429876']")));
			WebElement btnsearchLead = ldriver.findElement(By.xpath("//i[@data-test-id='20190911130636037429876']"));
			btnsearchLead.click();
		}
	}

	public void selectIndividualLead() throws InterruptedException {
		try {
			//fix for preview issue
			Thread.sleep(5000);
		    WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Lead name']")));
			WebElement selectIndividualLead = ldriver.findElement(By.xpath("//a[@title='Lead name']"));
		    selectIndividualLead.click();	
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			//fix for preview issue
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Lead name']")));
			WebElement selectIndividualLead = ldriver.findElement(By.xpath("//a[@title='Lead name']"));
		    selectIndividualLead.click();
		}
	}

	public void clickEdit() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='content-item content-sub_section item-2 remove-all-spacing flex flex-row']/div/div/div/div/div/div/span/button")));
		btnEdit.click();
	}

	public void editIndividualLead() {
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='31004d41']")));
			WebElement editZipcode = ldriver.findElement(By.xpath("//input[@id='31004d41']"));
			editZipcode.clear();
			editZipcode.sendKeys("06105");
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='31004d41']")));
			WebElement editZipcode = ldriver.findElement(By.xpath("//input[@id='31004d41']"));
			editZipcode.clear();
			editZipcode.sendKeys("06105");
		}

		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Submit']")));
			WebElement btnSubmit = ldriver.findElement(By.xpath("//button[.='Submit']"));
			btnSubmit.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Submit']")));
			WebElement btnSubmit = ldriver.findElement(By.xpath("//button[.='Submit']"));
			btnSubmit.click();
		}
	}

	public void clickActions() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='content-item content-sub_section item-2 remove-all-spacing flex flex-row']/div/div/div[3]/span/button")));
		btnActions.click();		
	}
	
	public void clickConvertlead() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Convert lead']")));
		menuConvertlead.click();		
	}

	public void submitConvertlead() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='d118ec10']")));
		keyinFirstname.sendKeys("Alexa");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='8dcd183b']")));
		keyinOpportunityname.sendKeys("Family Insurance");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='1dfe6fd2']")));
		keyinAmount.sendKeys("1000");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='c0445fa3']")));
		keyinClosedate.sendKeys("9/30/2021");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Submit']")));
		btnConvertLeadSubmit.click();
	}

	public void leadCreationSuccessful() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='CV']")));
	}
	
	public void leadEditSuccessful() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='CV']")));
		// fix for the subsequent click issue
		Thread.sleep(10000);
	}

}
