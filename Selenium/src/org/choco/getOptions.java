package org.choco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions os=new ChromeOptions();
		os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		os.addArguments("--remote-allow-origins=*");
         WebDriver driver=new ChromeDriver(os);
         driver.manage().window().maximize();
         
         driver.get("https://output.jsbin.com/osebed/2");
         
         WebElement ft = driver.findElement(By.id("fruits"));
         Select k=new Select(ft);
         k.selectByIndex(1);
         
         List<WebElement> op = k.getAllSelectedOptions();
         
         
         for (WebElement gh : op) {
        	 String text = gh.getText();
        	 System.out.println("Selected Option is:"+ text);
			
		}
	   
        List<WebElement> fri = k.getOptions();
        
        for (int i = 0; i < fri.size(); i++) {
        	
        	WebElement fg = fri.get(i);
			String text = fg.getText();
			System.out.println(text);
		}
        
        
         
        
        
         
         
	}

}
