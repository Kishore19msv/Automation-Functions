package org.choco;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultiSnap {
	
	public static  WebDriver driver; 
	public static void snapit(String name) throws IOException {
		
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dec = new File("C:\\programeclipse\\Selenium\\screenshottttt\\"+name+".jpg");
	FileUtils.copyFile(src, dec);	
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions os=new ChromeOptions();
		os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		os.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(os);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		snapit("kis");
		
		driver.findElement(By.id("email")).sendKeys("kishore");
		snapit("ore");
		
	

	}

}
