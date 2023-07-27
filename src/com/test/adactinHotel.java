package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinHotel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App! ')]"));
		String text1 = text.getText();
		System.out.println(text1);
		

	}

}
