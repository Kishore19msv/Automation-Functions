package org.choco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class hotel {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions os=new ChromeOptions();
		os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		os.addArguments("--remote-allow-origins=*");
         WebDriver driver=new ChromeDriver(os);
         driver.manage().window().maximize();
         
         driver.get("https://adactinhotelapp.com/index.php");
         
         driver.findElement(By.id("username")).sendKeys("Kishoreabcd");
         driver.findElement(By.id("password")).sendKeys("12345678");
         driver.findElement(By.id("login")).click();
         
         WebElement men = driver.findElement(By.id("adult_room"));
         Select ki=new Select(men);
         List<WebElement> gk1 = ki.getOptions();

         for (int i = 0; i < gk1.size(); i++) {
         	
         	WebElement fg = gk1.get(i);
 			String text = fg.getText();
 			System.out.println(text);
	}
 
}
}
