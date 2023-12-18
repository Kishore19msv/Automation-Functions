package org.choco;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");	
		 ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();

	     driver.get("https://www.amazon.in/");
	     
	     String ki = driver.getWindowHandle();
	     
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 13 (128GB) - Pink");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     Thread.sleep(2000); 
	     
	     WebElement gk = driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Pink"));
	     gk.click();
	     
	     Set<String> child = driver.getWindowHandles();
	     
	     for (String ss : child) {
	    	 
	    	 if (!ki.equals(child)) {
	    		 
	    		 driver.switchTo().window(ss);
				
			}
			 
		}
	     
	    driver.findElement(By.id("add-to-cart-button")).click(); 
	}

}
