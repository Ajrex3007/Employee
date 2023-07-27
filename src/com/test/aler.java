package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aler {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alert.click();
		
		WebElement alert1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		alert1.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("ajay");
		 
		alert2.accept();
		
		WebElement text = driver.findElement(By.xpath("//p[text()='Hello ajay How are you today']"));
		String text2 = text.getText();
		System.out.println(text2);
		
		
		
		

	}

}
