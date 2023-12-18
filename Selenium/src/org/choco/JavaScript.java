package org.choco;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");	     ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     
	     WebElement uname = driver.findElement(By.id("email"));
	     JavascriptExecutor kis=(JavascriptExecutor)driver;
	     kis.executeScript("arguments[0].setAttribute('value','kishore')",uname);
	     
	     WebElement pd = driver.findElement(By.id("pass"));
	     JavascriptExecutor ki=(JavascriptExecutor)driver;
	     ki.executeScript("arguments[0].setAttribute('value','kishore')",pd);
	     
	     WebElement ok = driver.findElement(By.name("login"));
	     JavascriptExecutor li=(JavascriptExecutor)driver;
	     li.executeScript("arguments[0].click()",ok);  
	}

}
