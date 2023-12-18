package org.choco;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertForweb { 

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
	     ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    
	     //Simple Alert
	     Thread.sleep(2000);
	     driver.findElement(By.id("alertBox")).click();
	     Alert b=driver.switchTo().alert();
	     b.accept();
	     
	     WebElement out = driver.findElement(By.id("output"));
	     String text = out.getText();
	     System.out.println("output:"+text);
	     
	     //Confirm Alert
	     Thread.sleep(2000);
	     driver.findElement(By.id("confirmBox")).click();
	     Alert c=driver.switchTo().alert();
	     c.dismiss();
	     
	     //Prompt Alert
	     Thread.sleep(2000);
	     driver.findElement(By.id("promptBox")).click();
	     Alert d=driver.switchTo().alert();
	     d.sendKeys("kishore");
	     d.accept();
	         
	  
	     
	     
	}

}
