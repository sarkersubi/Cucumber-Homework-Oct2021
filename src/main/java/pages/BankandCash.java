package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankandCash {
	WebDriver driver;
	
	public void bankandcash(WebDriver driver) {
		this.driver=driver;
	}
 @FindBy(how=How.XPATH, using="//*[@id=\"side-menu\"]/li[10]/a")WebElement bank_cash;
 @FindBy(how=How.XPATH, using="//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")WebElement new_account;
 
 public void clickbankandcash() {
	 bank_cash.click();
 }
 public void clicknewaccount() {
	 new_account.click();
 }
}
