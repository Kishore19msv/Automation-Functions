package org.choco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");	     ChromeOptions os=new ChromeOptions();
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     //driver.get("https://www.amazon.in/");
	     //WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	     //Actions a =new Actions(driver);
	     //a.moveToElement(account).build().perform();
	     
	     driver.get("https://www.snapdeal.com/");
	     WebElement men = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
	     Actions b=new Actions(driver);
	     b.moveToElement(men).build().perform();
	     
	     
	}

}
