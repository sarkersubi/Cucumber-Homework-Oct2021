package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public void loginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id=\"username\"]")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name=\"login\"]")
	WebElement SigninButton;

	public void enterusername(String username) {
		Username.sendKeys(username);
	}

	public void enterpassword(String password) {
		Password.sendKeys(password);
	}

	public void clicksignin() {
		SigninButton.click();
	}

	public String getpagetitle() {
		return driver.getTitle();
	}

}
