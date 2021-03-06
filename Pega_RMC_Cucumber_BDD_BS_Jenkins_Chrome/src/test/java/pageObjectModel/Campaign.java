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
import java.util.Set;

public class Campaign {
	public WebDriver ldriver;

	public Campaign(WebDriver rdriver) {
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
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			Thread.sleep(5000);
			ldriver.switchTo().frame(ldriver.findElement(By.id("top_nav")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='l'][.='crm']")));
			WebElement linkCRM = ldriver.findElement(By.xpath("//a[@class='l'][.='crm']"));
			linkCRM.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			Thread.sleep(5000);
			ldriver.switchTo().frame(ldriver.findElement(By.id("top_nav")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='l'][.='crm']")));
			WebElement linkCRM = ldriver.findElement(By.xpath("//a[@class='l'][.='crm']"));
			linkCRM.click();
		}		
	}

	public void clickProspects() throws InterruptedException {
		Actions action = new Actions(ldriver);
		Thread.sleep(5000);
		String parentWindow = ldriver.getWindowHandle();
		Set<String> handles =  ldriver.getWindowHandles();
		for(String windowHandle  : handles)
		{
		if(!windowHandle.equals(parentWindow))
          {
			ldriver.switchTo().window(windowHandle);
			System.out.println(getPageTitle());
          }
		}
		try {			
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rmcHubTab']/a")));
			WebElement clickProspects = ldriver.findElement(By.xpath("//*[@id='rmcHubTab']/a"));
			clickProspects.click();
			Thread.sleep(5000);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rmcHubTab']/a")));
			WebElement clickProspects = ldriver.findElement(By.xpath("//*[@id='rmcHubTab']/a"));
			clickProspects.click();
			Thread.sleep(5000);
		}		
	}

	public void clickQuickAdd() throws InterruptedException {
		Actions action = new Actions(ldriver);
		String parentWindow = ldriver.getWindowHandle();
		Set<String> handles =  ldriver.getWindowHandles();
		for(String windowHandle  : handles)
		{
		if(!windowHandle.equals(parentWindow))
          {
			ldriver.switchTo().window(windowHandle);
			System.out.println(getPageTitle());
          }
		}
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@name='PortalLeftPanel_pyDisplayHarness_7']")));
			WebElement menuQuickAdd = ldriver.findElement(By.xpath("//a[@name='PortalLeftPanel_pyDisplayHarness_7']"));	
			menuQuickAdd.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@name='PortalLeftPanel_pyDisplayHarness_7']")));
			WebElement menuQuickAdd = ldriver.findElement(By.xpath("//a[@name='PortalLeftPanel_pyDisplayHarness_7']"));	
			menuQuickAdd.click();
		}
	}

	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void addContact() {
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			ldriver.switchTo().frame(1);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fd28b87d']")));
		    WebElement ipFirstName = ldriver.findElement(By.xpath("//input[@id='fd28b87d']"));		    
		    ipFirstName.sendKeys("Demo_04Mar2022_1");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='84ea8b8f']")));
		    WebElement ipEmail = ldriver.findElement(By.xpath("//input[@id='84ea8b8f']"));		    
		    ipEmail.sendKeys("campaignpegatest@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='fb48e245']")));
		    WebElement ddState = ldriver.findElement(By.xpath("//select[@id='fb48e245']"));		    
		    ddState.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fb48e245']/option[2]")));
		    WebElement selectState = ldriver.findElement(By.xpath("//*[@id='fb48e245']/option[2]"));		    
		    selectState.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='9b49a6c7']")));
		    WebElement ddPreferredLanguage = ldriver.findElement(By.xpath("//select[@id='9b49a6c7']"));		    
		    ddPreferredLanguage.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='9b49a6c7']/option[2]")));
		    WebElement selectPreferredLanguage = ldriver.findElement(By.xpath("//*[@id='9b49a6c7']/option[2]"));		    
		    selectPreferredLanguage.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='3f8de351']")));
		    WebElement selectCertificate = ldriver.findElement(By.xpath("//input[@id='3f8de351']"));		    
		    selectCertificate.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='6efbb833Prospective Recruits']")));
		    WebElement selectProspective = ldriver.findElement(By.xpath("//label[@for='6efbb833Prospective Recruits']"));		    
		    selectProspective.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='63c2dc9c']")));
		    WebElement select1on1Campaign = ldriver.findElement(By.xpath("//input[@id='63c2dc9c']"));		    
		    select1on1Campaign.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='ContactDetails_pyWorkPage_32']")));
		    WebElement btnAdd = ldriver.findElement(By.xpath("//button[@name='ContactDetails_pyWorkPage_32']"));		    
		    btnAdd.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebDriverWait wait = new WebDriverWait(ldriver, 50);
			ldriver.switchTo().frame(1);
			//ldriver.switchTo().frame(ldriver.findElement(By.id("PegaGadget1Ifr")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fd28b87d']")));
		    WebElement ipFirstName = ldriver.findElement(By.xpath("//input[@id='fd28b87d']"));		    
		    ipFirstName.sendKeys("Demo_User_10");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='84ea8b8f']")));
		    WebElement ipEmail = ldriver.findElement(By.xpath("//input[@id='84ea8b8f']"));		    
		    ipEmail.sendKeys("campaignpegatest@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='fb48e245']")));
		    WebElement ddState = ldriver.findElement(By.xpath("//select[@id='fb48e245']"));		    
		    ddState.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fb48e245']/option[2]")));
		    WebElement selectState = ldriver.findElement(By.xpath("//*[@id='fb48e245']/option[2]"));		    
		    selectState.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='9b49a6c7']")));
		    WebElement ddPreferredLanguage = ldriver.findElement(By.xpath("//select[@id='9b49a6c7']"));		    
		    ddPreferredLanguage.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='9b49a6c7']/option[2]")));
		    WebElement selectPreferredLanguage = ldriver.findElement(By.xpath("//*[@id='9b49a6c7']/option[2]"));		    
		    selectPreferredLanguage.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='3f8de351']")));
		    WebElement selectCertificate = ldriver.findElement(By.xpath("//input[@id='3f8de351']"));		    
		    selectCertificate.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='6efbb833Prospective Recruits']")));
		    WebElement selectProspective = ldriver.findElement(By.xpath("//label[@for='6efbb833Prospective Recruits']"));		    
		    selectProspective.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='63c2dc9c']")));
		    WebElement select1on1Campaign = ldriver.findElement(By.xpath("//input[@id='63c2dc9c']"));		    
		    select1on1Campaign.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='ContactDetails_pyWorkPage_32']")));
		    WebElement btnAdd = ldriver.findElement(By.xpath("//button[@name='ContactDetails_pyWorkPage_32']"));		    
		    btnAdd.click();
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

	public void verifyEmail() {
		WebDriverWait wait = new WebDriverWait(ldriver, 50);
		ldriver.get("https://accounts.google.com/signin");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
		WebElement l = ldriver.findElement(By.id("identifierId"));
		l.sendKeys("campaignpegatest@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Next']")));
		WebElement b = ldriver.findElement(By.xpath("//span[.='Next']"));
		b.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password'][@name='password']")));
		WebElement p = ldriver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		p.sendKeys("Pegarmc@123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='VfPpkd-vQzf8d'][.='Next']"))).click();
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
