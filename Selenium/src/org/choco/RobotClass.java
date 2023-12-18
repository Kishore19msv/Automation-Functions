package org.choco;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
        
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
	     ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     Robot K=new Robot();
	     
	     driver.get("https://www.instagram.com/accounts/login/");
	     
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kishore");
	     
	     K.keyPress(KeyEvent.VK_CONTROL);
	     K.keyPress(KeyEvent.VK_A);
	     
	     K.keyRelease(KeyEvent.VK_CONTROL);
	     K.keyRelease(KeyEvent.VK_A);
	     
	     K.keyPress(KeyEvent.VK_CONTROL);
	     K.keyPress(KeyEvent.VK_C);
	     
	     K.keyRelease(KeyEvent.VK_CONTROL);
	     K.keyRelease(KeyEvent.VK_C);
	     
	     K.keyPress(KeyEvent.VK_TAB);
	     K.keyRelease(KeyEvent.VK_TAB);
	     
	     K.keyPress(KeyEvent.VK_CONTROL);
	     K.keyPress(KeyEvent.VK_V);
	     
	     K.keyRelease(KeyEvent.VK_CONTROL);
	     K.keyRelease(KeyEvent.VK_V);
	     
	     K.keyPress(KeyEvent.VK_ENTER);
	     K.keyRelease(KeyEvent.VK_ENTER);
	     
	                                           
	}

}
