package selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class qatestingproject {

	public static <Webelement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chrome\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   // String oldwindow=driver.getWindowHandle();
	WebElement frame=driver.findElement(By.xpath("google_ads_iframe_/42115163/IP_money.rediff.com_Desk_300x250_ME_ATF_HVR_0']"));
	driver.switchTo().frame(frame);
	WebElement fbtn=driver.findElement(By.xpath("//img[@alt='Advertisement']"));
	fbtn.click();
	System.out.println("ok");
	

		//WebElement link=driver.findElement(By.linkText("PRACTICE"));
		//link.click();
				
		//open tab
	/*	WebElement tab=driver.findElement(By.xpath("//a[@id='opentab']"));
		tab.click();
		Set<String>	 hanndling=driver.getWindowHandles();
		for (String string : hanndling) {
			driver.switchTo().window(string);
		}
		System.out.println("ok");
		WebElement contact=driver.findElement(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']"));
		contact.click();
		System.out.println("ok");*/
		
	/*List<WebElement>totalframes=driver.findElements(By.tagName("iframe"));
	int size=totalframes.size();
	System.out.println(size);
	driver.switchTo().frame("courses-iframe");
	System.out.println("success");
	WebElement contact=driver.findElement(By.linkText("Contact"));
	contact.click();
	//System.out.println("success");
		
		

		Radio Button
		WebElement radio1=driver.findElement(By.xpath("//input[@name='radioButton']"));
		boolean b=radio1.isDisplayed();
		System.out.println(b);

		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();

		WebElement radio3=driver.findElement(By.xpath("//input[@type='radio']"));
		boolean b1=	radio3.isEnabled();
		System.out.println(b1);
		
		//Auto Complete
		WebElement auto=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		auto.sendKeys("india");
		
		//DropDown
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		s.selectByVisibleText("Option2");
		s.selectByValue("option1");
		
		//CheckBox
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox.click();
		//Alert
		WebElement textbox=driver.findElement(By.xpath("//input[@id='name']"));
		textbox.sendKeys("yasar");
		WebElement btn2=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		btn2.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		//Window Handling
/*	WebElement btn=driver.findElement(By.xpath("//button[@id='openwindow']"));
		btn.click();
		
		
		Set<String>	handle=driver.getWindowHandles();
		for (String newwindow : handle) {
			driver.switchTo().window(newwindow);
		}
		WebElement youtube=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/t2T16A0Aueg']"));
		driver.switchTo().frame("youtube");
		WebElement btn3=driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
		btn3.click();
		System.out.println("ok");*/
	//	WebElement	link1=driver.findElement(By.xpath("//a[@href='https://www.youtube.com/channel/UCgx5SDcUQWCQ_1CNneQzCRw']"));
	//	link1.click();
	//	System.out.println("clicked");
	/*	Set<String>  handle1=driver.getWindowHandles();
		for (String newwindow1 : handle1) {
			driver.switchTo().window(newwindow1);
		}
		
		
		WebElement search=driver.findElement(By.id("search"));
		search.sendKeys("yasar");*/
			
		
	//	WebElement subscribe=driver.findElement
	//			(By.xpath("//paper-button[@id='button'][@class='style-scope ytd-button-renderer style-default size-default']"));
	//	subscribe.click();
	//	System.out.println("ok");
		
		
		
		
			//	
		
	
		
		}	
	}




































