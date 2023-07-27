package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBuss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Thanjavur");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("chennai");
		

	}

}
