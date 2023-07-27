package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class omrHotel {

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
		
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select selectstate = new Select(state);
		selectstate.selectByVisibleText("Tamil Nadu");
		
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
		Select cityname = new Select(city);
		cityname.selectByVisibleText("Tiruchirappalli");
		
		WebElement selectRoomType = driver.findElement(By.id("room_type"));
		Select room = new Select(selectRoomType);
		room.selectByVisibleText("Deluxe");

		WebElement checkIndate = driver.findElement(By.xpath("//input[@name='check_in']"));
		checkIndate.sendKeys("2023-07-05 " + Keys.ENTER);

		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='check_out']"));
		checkoutdate.sendKeys("2023-07-07" + Keys.ENTER);

		WebElement seltRoom = driver.findElement(By.id("no_rooms"));
		Select sltroom = new Select(seltRoom);
		sltroom.selectByIndex(1);

		WebElement noofAdult = driver.findElement(By.id("no_adults"));
		Select adult = new Select(noofAdult);
		adult.selectByIndex(2);

		Thread.sleep(1000);
		WebElement noofchild = driver.findElement(By.xpath("//input[@id='no_child']"));
		Select nofchild = new Select(seltRoom);
		nofchild.selectByIndex(1);
		
		
			
	}

}