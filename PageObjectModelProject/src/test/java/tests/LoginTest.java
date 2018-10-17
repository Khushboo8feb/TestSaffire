package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SaffireHeaderPage;
import pages.SaffireLoginPage;

public class LoginTest extends TestBase 
{
  @Test
  public void VerifyLogin() 
  {
	  SaffireHeaderPage HeaderPage = PageFactory.initElements(driver, SaffireHeaderPage.class);
	  HeaderPage.clickOn_Lnk_SignIn();
	  
	  SaffireLoginPage LoginPage = PageFactory.initElements(driver, SaffireLoginPage.class);
	  LoginPage.enter_txtBx_Username();
	  LoginPage.enter_Bx_Password();
	  LoginPage.clickOn_btn_Login();
	  
	  HeaderPage.clickOn_Lnk_SignOut();
	 
  }
}
