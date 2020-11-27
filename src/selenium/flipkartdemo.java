package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import javax.management.ListenerNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\gecko\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> d=driver.findElements(By.tagName("a"));
		//System.out.println(d.size());
		//List al=new ArrayList<WebElement>();

		for (WebElement aa : d) {

			String value=aa.getAttribute("href");
			String value1=aa.getText();
			System.out.println("this is value:" +value+"this is value 1:"+  value1);
			
		}
		//Collections.sort(al);
		//int a=al.size();
		//System.out.println(a);
		/*	for (Object ob : al) {

			System.out.println(ob);
		}
		System.out.println("-----------aftet sort--------------");
		Collections.sort(al);
		/*for (Object s : al) {
			System.out.println(s);
		}*/

	}}
