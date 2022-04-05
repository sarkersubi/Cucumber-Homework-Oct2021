package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Accounts extends TestBase {
	WebDriver driver;
	
	public void accountdetails(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement accounttitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement descriptions;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement initialbalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement accountnumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement contactperson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]]")
	WebElement bankurl;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement button;
//@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[1]/h5") WebElement headermanageaccount;

	public void entersaccounttitle(String Accounttitle) {
		accounttitle.sendKeys(Accounttitle );
	}

	public void enterdescription(String Description) {
		descriptions.sendKeys(Description);
	}

	public void enterintialbalance(String Initialbalance) {
		initialbalance.sendKeys(Initialbalance);
	}

	public void enteraccountnum(String Accountnum) {
		accountnumber.sendKeys("Accountnum"+ generateRandom(999));
	}

	public void entercontactperson(String Contactperson) {
		contactperson.sendKeys(Contactperson);
	}

	public void enterphonenum(String Phone) {
		phone.sendKeys("Phone"+ generateRandom(999));
	}

	public void enterbnakurl(String Bankurl) {
		bankurl.sendKeys(Bankurl);
	}

	

	public void clickbutton() {
		button.click();
	}
}
