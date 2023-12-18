package org.choco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class up {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
         os.addArguments("--remote-allow-origins=*");
         WebDriver driver=new ChromeDriver(os);
         driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("https://www.flipkart.com/")).click();
	     

	}

}
