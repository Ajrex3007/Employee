package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenTech {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.id("home-tab"));
		 text.click();
		
		WebElement text1 = driver.findElement(By.xpath("//b[text()='Velmurugan is a Test Manager at Hexaware.']"));
		String velmurugan = text1.getText();
		System.out.println(velmurugan);

	}

}

