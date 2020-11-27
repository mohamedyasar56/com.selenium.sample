package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ddf {

	WebDriver driver;

	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	public void login(String username,String password)
	{
		WebElement user=driver.findElement(By.xpath("//input[@id='login1']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement  link=driver.findElement(By.linkText("Sign in"));
		link.click();
		user.sendKeys(username);
		pass.sendKeys(password);
		user.clear();
		pass.clear();

	}
	public void teardown()
	{
		driver.close();
	}

	public Object[][] logindatas()
	{
		Object obj[][]=new Object[5][2];
		obj[0][0]="username1";
		obj[0][1]="password1";

		obj[1][0]="username1";
		obj[1][1]="password1";

		obj[2][0]="username1";
		obj[2][1]="password1";

		obj[3][0]="username1";
		obj[3][1]="password1";

		obj[4][0]="username1";
		obj[4][1]="password1";

		return obj;


	}
}
