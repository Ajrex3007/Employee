package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoGuru {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s= driver.findElement(By.id("credit2"));
		WebElement d= driver.findElement(By.id("bank"));
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(s,d).perform();
		
		
	}
	
	
}
