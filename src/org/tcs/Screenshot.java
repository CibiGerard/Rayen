package org.tcs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akgra\\eclipse-workspace\\Screenshot\\drive\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.id("nsefutureOptions MT15"));
	File s = element.getScreenshotAs(OutputType.FILE);
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
