package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
		firstname.sendKeys("ajay");
		
		WebElement lastname = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
		lastname.sendKeys("annadurai");	

	}

}
