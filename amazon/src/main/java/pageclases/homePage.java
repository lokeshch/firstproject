package pageclases;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class homePage {
	final WebDriver driver;
	 
		@FindBy(xpath=".//*[@id='account']/a")
	    public WebElement lnk_MyAccount;
	   @FindBy(xpath=".//*[@id='account_logout']/a")
	    public WebElement lnk_LogOut;
	 
	// This is a constructor, as every page need a base driver to find web elements
	 
		public homePage(WebDriver driver)
	 
		{
	 
			this.driver=driver;
			PageFactory.initElements(driver, this);
	 
			}
	 
	}

