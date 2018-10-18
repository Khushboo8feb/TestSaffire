package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SaffireHeaderPage 
{
WebDriver driver;
	
	public SaffireHeaderPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	

    //Using FindBy for locating elements
	@FindBy(how = How.ID, using ="headerNav_uc_widgetContainer_ctl02_ctl00_ctl01_HeaderNavLoginStatus1_lbtn_changeSessionStatus")WebElement Lnk_SignIn;
	@FindBy(how =How.ID, using = "headerNav_uc_widgetContainer_ctl02_ctl00_ctl01_HeaderNavLoginStatus1_lbtn_changeSessionStatus")WebElement Lnk_SignOut;

	// Defining all the user actions (Methods) that can be performed in the Saffire home page
	
	// This method to click on SignIn link text
	public void clickOn_Lnk_SignIn()
	{
		Lnk_SignIn.click();
	}
	
	// This method to click on SignOut link text
		public void clickOn_Lnk_SignOut()
		{
			Lnk_SignOut.click();
		}
		
		public void message()
		{
			System.out.println("Test");
		}

}
