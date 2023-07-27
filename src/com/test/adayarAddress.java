package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adayarAddress {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		
		WebElement text = driver.findElement(By.xpath("//span[text()='No:11,']"));
		text.getText();
		System.out.println(text);
		
		

	}

}
