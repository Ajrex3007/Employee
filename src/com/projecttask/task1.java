package com.projecttask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class task1
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://omrbranch.com/");
	driver.manage().window().maximize();
	
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("ajayanna1999@gmail.com");

	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("Reyfie@3007");
	
	WebElement btnlogn = driver.findElement(By.xpath("//button[text()='Login']"));
	btnlogn.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.switchTo().frame("hotelsearch_iframe").findElement(By.id("searchBtn")).click();
	
	driver.switchTo().defaultContent();
	
	String text1 = driver.findElement(By.xpath("//div[text()='Please select state']")).getText();
	System.out.println(text1);
	
	String text2 = driver.findElement(By.xpath("//div[text()='Please select city']")).getText();
	System.out.println(text2);
	
	String text3= driver.findElement(By.xpath("//div[text()='Please select Check-in date']")).getText();
	System.out.println(text3);
	
	String text4= driver.findElement(By.xpath("//div[text()='Please select Check-out date']")).getText();
	System.out.println(text4);

	String text5= driver.findElement(By.xpath("//div[text()='Please select no. of rooms']")).getText();
	System.out.println(text5);

	String text6= driver.findElement(By.xpath("//div[text()='Please select no. of adults']")).getText();
	System.out.println(text6);
	
	
	//Thread.sleep(3000);
	//WebElement searchbut= driver.findElement(By.xpath("//button[@class ='btn filter_btn']"));
	//searchbut.click();
	
	
	}
	
	
}