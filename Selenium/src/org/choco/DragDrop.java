package org.choco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
           
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
	     ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     driver.get("https://demo.guru99.com/test/drag_drop.html");
	     
	     Actions a=new Actions(driver);
	     WebElement src = driver.findElement(By.id("credit1"));
	     WebElement des = driver.findElement(By.id("loan"));
	     a.dragAndDrop(src, des).build().perform();
	     
	     WebElement src1 = driver.findElement(By.id("fourth"));
	     WebElement des2 = driver.findElement(By.id("amt8"));
	     a.dragAndDrop(src1, des2).build().perform(); 
	     
	     
	}

}
