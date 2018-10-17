package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SaffireLoginPage 
{
	WebDriver driver;
	
	public SaffireLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using ="MainContent_content_Login1_etbx_username_tbx_etbx_username") WebElement txtBx_Username;
	@FindBy(how = How.ID, using = "MainContent_content_Login1_etbx_password_tbx_etbx_password")WebElement txtBx_Password; 
	@FindBy(how = How.ID, using = "MainContent_content_Login1_lbtn_signin")WebElement btn_Logout;
	
	public void enter_txtBx_Username()
	{
		txtBx_Username.sendKeys("khushboo@saffire.com");
	}
	
	public void enter_Bx_Password()
	{
		txtBx_Password.sendKeys("saffire@123");
	}
	
	public void clickOn_btn_Login()
	{
		btn_Logout.click();
	}

}
