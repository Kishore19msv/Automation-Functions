package org.choco;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");	     
		ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.flipkart.com/");
	     
	     Thread.sleep(3000);
	     
	     //driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
	     //driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	     
	     
	  
	    WebElement fash = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(fash).build().perform();
	    
	    WebElement mens = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		a.moveToElement(mens).build().perform();
		
		WebElement Tshirt = driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
		Tshirt.click();
		
		driver.findElement(By.xpath("(//div[@class='_312yBx SFzpgZ'])[1]")).click();
	    
	    for(String Tab:driver.getWindowHandles())
	    {
	    	
	    	driver.switchTo().window(Tab);
	    }
	      
	    Thread.sleep(3000);
	  
	    
	    WebElement cart = driver.findElement(By.xpath("//*[@class='_1KOMV2']")); 
	    cart.click();
	    
	    
	    
	
	
	}
	
	


}

