package org.choco;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
	     ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.facebook.com/");
	     Actions k=new Actions(driver);
	     Robot co=new Robot();
	     
	     WebElement user = driver.findElement(By.id("email"));
	     user.sendKeys("kishore");
	     WebElement kis = driver.findElement(By.id("email"));
	     
	     k.doubleClick(kis).build().perform();
	     k.contextClick(kis).build().perform();
	     
	    
	     for (int i = 0; i < 3; i++) {
	    	 co.keyPress(KeyEvent.VK_DOWN); 
	    	 co.keyRelease(KeyEvent.VK_DOWN);
			
		}
	     
	     Thread.sleep(500);
	     co.keyPress(KeyEvent.VK_ENTER);
	     co.keyRelease(KeyEvent.VK_ENTER);
	     
	     WebElement red = driver.findElement(By.id("pass"));
	     k.contextClick(red).build().perform();
	     
	     for (int i = 0; i < 4; i++) {
	    	 co.keyPress(KeyEvent.VK_DOWN);
	    	 co.keyRelease(KeyEvent.VK_DOWN);
			
		}
	     Thread.sleep(500);
	     co.keyPress(KeyEvent.VK_ENTER);
	     co.keyRelease(KeyEvent.VK_ENTER);  
	     
	     
	     
	     
	     
	}
}
