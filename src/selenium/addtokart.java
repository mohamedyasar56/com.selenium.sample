package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class addtokart {

	public static void main(String[] args) throws InterruptedException{


		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chrome\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");


		driver.navigate().to("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		WebElement mob=driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		mob.sendKeys("9597673531");
		WebElement id=	driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		id.sendKeys("yasarT");
		WebElement btn= driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		btn.click();

		String parent = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement searchbox=  driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchbox.sendKeys("samsung m30s");
		WebElement button=  driver.findElement(By.xpath("//button[@class='vh79eN']"));
		button.click();

		WebElement btn1= driver.findElement(By.xpath("//div[@class='_3wU53n']"));
		btn1.click();


		Set<String> children= driver.getWindowHandles();
		Thread.sleep(3000);   

		for(String kart:children) 
		{
			if(!parent.equals(kart)) 
			{
				driver.switchTo().window(kart);
				WebElement btn3= driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
				btn3.click();

				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parent);
		WebElement img1=driver.findElement(By.xpath("//img[@class='_1e_EAo']"));
		img1.click();
		Thread.sleep(2000);
		WebElement img2= driver.findElement(By.xpath(" //a[@class='_3ko_Ud']"));
		img2.click();  
		Thread.sleep(3000);

		WebElement img3=driver.findElement(By.xpath("//img[@class='_1e_EAo']"));
		img3.click();


		Actions action=new Actions(driver);
		WebElement parentitem=driver.findElement(By.name("My Account"));
		action.moveToElement(parentitem);
		WebElement childitem=driver.findElement(By.id("container"));
		action.moveToElement(childitem);
		action.click().build().perform();
		





	}	

}


