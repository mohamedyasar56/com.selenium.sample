package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\gecko\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement link1=driver.findElement(By.linkText("Create Account"));
		link1.click();
		WebElement textbox1=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
		textbox1.sendKeys("yasar");
		WebElement textbox2=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]"));
		textbox2.sendKeys("yasar123@gmail.com");
		WebElement textbox3=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input"));
		textbox3.sendKeys("12345");
		WebElement textbox4=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[11]/td[3]/input"));
		textbox4.sendKeys("12345");
		WebElement textbox5=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input"));
		textbox5.sendKeys("yasar123452@gmail.com");
		WebElement textbox6=driver.findElement(By.xpath("//*[@id=\"mobno\"]"));
		textbox6.sendKeys("9597673531");
		WebElement drop1=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select s=new Select(drop1);
		s.selectByIndex(2);
		WebElement drop2=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
		Select s1=new Select(drop2);
		s1.selectByVisibleText("MAR");
		WebElement drop3=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		Select s2=new Select(drop3);
		s2.selectByValue("1994");

	}

}
