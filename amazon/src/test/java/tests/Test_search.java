package tests;

import java.util.concurrent.TimeUnit;

import pageclases.homePage;
import pageclases.loginPage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

public class Test_search {

	static WebDriver driver;

	homePage HomePage;

	loginPage LoginPage;

  @BeforeMethod

  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srini\\eclipse-workspace\\amazon\\browsers\\geckodriver.exe");
	  driver = new FirefoxDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://www.store.demoqa.com");

      HomePage = new homePage(driver) ;

      LoginPage = new loginPage(driver) ;

  }

  @Test

  public void test() {

      HomePage.lnk_MyAccount.click();

      LoginPage.LogIn_Action("lokesh ch", "bujjigadu123");

      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

      HomePage.lnk_LogOut.click();

  }

  @AfterMethod

  public void afterMethod() {

	  driver.quit();

  }

}