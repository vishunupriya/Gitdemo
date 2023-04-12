package greens.miniProject;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Vishnuraj.Mavenjava.TBasefunctions;

public class Minitest  extends TBasefunctions{
	@BeforeTest
	public void test() {
		browserlauncher("edge");
		gourl("http://testfire.net/login.jsp");
		
	}
	
	@Test(dataProvider="login credentials")
		public void login(String credentials,String username,String password)
		{
		
		MiniElements mini = new MiniElements(driver);
		mini.getUser().sendKeys(username);
		mini.getPwd().sendKeys(password);
		mini.getLogin().click();
		
		if(credentials.equals("Invalid credentials"))
		{
			WebElement failmsg = mini.getFailmsg();
			Assert.assertTrue(failmsg.isDisplayed());
			System.out.println("Login failed->Invalid credentials");
			
		}
		else if(credentials.equals("valid credentials"))
		{
			
			Assert.assertEquals(mini.getPassmsg().getText(), "Congratulations!");
			System.out.println("Login success");
		}
		}
		@DataProvider(name="login credentials")
		public Object[][] getdata()
		{
			Object[][] ob = new Object[2][3];
			ob[0][0]= "Invalid credentials";
			ob[0][1]="demo_user";
		    ob[0][2]="demo_password";
		    
		    ob[1][0]= "valid credentials";
			ob[1][1]="admin";
		    ob[1][2]="admin";
		    
			return ob;
			
		}
		@Test
		public void mata()
		{
			MiniElements mini = new MiniElements(driver);
			mini.getAccsummary().click();
			WebElement drop = mini.getDrop();
			dropindex(drop,1);
			mini.getGo().click();;
		}
		@Test
		public void nassertbalance()
		{
			MiniElements mini = new MiniElements(driver);
			Assert.assertEquals(mini.getAvailBalance().getText(), mini.getAvailBalance().getText());
			System.out.println("Balance validated");
			
		}
		@Test
		public void validatetransaction()
		{
			MiniElements mini = new MiniElements(driver);
			String amount="12300";
			mini.getTransferfund().click();
			WebElement dropacc = mini.getDropacc();
			dropindex(dropacc, 1);
			mini.getTransferamount().sendKeys("12300");
			mini.getTransfer().click();
			String accountmsg = mini.getAccountmsg().getText();
			boolean contains = accountmsg.contains(amount);
			if(contains==true)
			{
			System.out.println(contains+"Transaction message validated with correct amount");
			}
			else
			{
				System.out.println("There is a problem with Transaction");
			}
			mini.getRecenttrans().click();
			String recenttrans = mini.getTwotransac().getText();
			Assert.assertEquals(recenttrans,"$"+amount+"."+"00");
			System.out.println("Transaction amount validated");
		}
		@AfterTest
		public void signinoff()
		{
			MiniElements mini = new MiniElements(driver);
			mini.getContact().click();
			mini.getOnlineform().click();
			mini.getName().sendKeys("vishnu");
			mini.getEmail().sendKeys("chittu@gmail.com");
			mini.getSubmit().click();
			String text = mini.getThankyou().getText();
			Assert.assertEquals(text, "Thank You");
			System.out.println("Thank you validated");
			mini.getSignoff().click();
			
		}

}
