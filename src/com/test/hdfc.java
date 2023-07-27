package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		username.sendKeys("AJAY");
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		search.sendKeys("anna");
		
		
		
	}

}
