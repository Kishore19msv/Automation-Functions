package org.choco;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Brave {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\programeclipse\\Selenium\\Driver\\chromedriver.exe");	   
		ChromeOptions os=new ChromeOptions();
	     os.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	     os.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(os);
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.facebook.com/signup");
	     
	     WebElement Fname = driver.findElement(By.name("firstname"));
	     Fname.sendKeys("Kishore");
	     
	     WebElement Lname = driver.findElement(By.name("lastname"));
	     Lname.sendKeys("Kishore");
	     
	     WebElement mail = driver.findElement(By.name("reg_email__"));
	     mail.sendKeys("Kishore@gmail.com");
	     
	     WebElement Email = driver.findElement(By.name("reg_email_confirmation__"));
	     Email.sendKeys("Kishore@gmail.com");
	     
	     WebElement pass = driver.findElement(By.name("reg_passwd__"));
	     pass.sendKeys("Kishore@19");
	     
	     WebElement kis = driver.findElement(By.id("day"));
	     Select a=new Select(kis);
	     a.selectByValue("19");
	     
	     WebElement Mon = driver.findElement(By.name("birthday_month"));
	     Select b=new Select(Mon);
	     b.selectByVisibleText("Sep");
	     
	     WebElement year = driver.findElement(By.name("birthday_year"));
	     Select c=new Select(year);
	     c.selectByValue("2002");
	     
	     WebElement Gender = driver.findElement(By.xpath("(//*[@class=\"_8esa\"])[2]"));
	     Gender.click();
	     
	     List<WebElement> jkbro = c.getOptions();
	     
	     for (int i = 0; i < jkbro.size(); i++) {
	    	 
	    	 WebElement shan = jkbro.get(i);
	         String tony = shan.getText();
	         System.out.println(tony);
			
		}
	     
	     
	     
	     
	 
	     
	     
	     
	     //WebElement submit = driver.findElement(By.name("websubmit"));
	     //submit.click(); 
	     
	     
	     
	}

}
