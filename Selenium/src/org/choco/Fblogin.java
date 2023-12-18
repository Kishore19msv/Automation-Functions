package org.choco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");    
	ChromeOptions os=new ChromeOptions();
     os.addArguments("--remote-allow-origins=*");
     WebDriver driver=new ChromeDriver(os);
     driver.get("https://www.facebook.com/");
     
     driver.manage().window().maximize();
     
     //WebElement print = driver.findElement(By.xpath("//h2[contains(text(),'Fa')]"));
     //String text = print.getText();
     //System.out.println(text);
     
     WebElement mail = driver.findElement(By.id("email"));
     mail.sendKeys("kishore@gmail.com");
     
     WebElement key = driver.findElement(By.id("pass"));
     key.sendKeys("123456");
     
     WebElement log = driver.findElement(By.name("login"));
     log.click(); 
	}

}
