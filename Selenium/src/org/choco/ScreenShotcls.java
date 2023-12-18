package org.choco;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotcls {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
    ChromeOptions os=new ChromeOptions();
    os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
    os.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(os);
    driver.manage().window().maximize();		
    
    driver.get("https://www.facebook.com/");
     TakesScreenshot tk= (TakesScreenshot)driver;
     File src = tk.getScreenshotAs(OutputType.FILE);
     File dec = new File("C:\\programeclipse\\Selenium\\screenshottttt\\facebook1.png");
     FileUtils.copyFile(src, dec);
     
     
      WebElement username = driver.findElement(By.id("email"));
      username.sendKeys("sasi");
      TakesScreenshot tk1=(TakesScreenshot)driver;
      File src1 = tk1.getScreenshotAs(OutputType.FILE);
      File dec1 = new File("C:\\programeclipse\\Selenium\\screenshottttt\\facebook2.png");
      FileUtils.copyFile(src1, dec1);
      
    	
	}

}
