package pageclases;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class loginPage {
	  final WebDriver driver;
	 
		@FindBy(id="log")
	    WebElement txtbx_UserName;
	    @FindBy(id="pwd")
	    WebElement txtbx_Password;
	    @FindBy(name= "submit")
	    WebElement btn_Login ;
	 
		public loginPage(WebDriver driver)
	 
		{
	 
			this.driver=driver;
			PageFactory.initElements(driver, this);
	 
			}
	 
	// This method will take two arguments ( Username nd Password)
	 
		public void LogIn_Action(String sUserName, String sPassword){
	 
			txtbx_UserName.sendKeys(sUserName);
	 
			txtbx_Password.sendKeys(sPassword);
	 
			btn_Login.click();
	 
		}
	 
	}


