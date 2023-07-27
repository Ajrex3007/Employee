package com.projecttask;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2 {

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
		WebElement SelectState = driver.findElement(By.id("state"));
		Select state1 = new Select(SelectState);
		state1.selectByVisibleText("Tamil Nadu");

		WebElement SelectCity = driver.findElement(By.xpath("//select[@id='city']"));
		Select city1 = new Select(SelectCity);
		city1.selectByVisibleText("Tiruchirappalli");

		WebElement selectRoomType = driver.findElement(By.id("room_type"));
		Select room = new Select(selectRoomType);
		room.selectByVisibleText("Deluxe");

		WebElement checkIndate = driver.findElement(By.xpath("//input[@name='check_in']"));
		checkIndate.sendKeys("2023-07-12" + Keys.ENTER);

		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='check_out']"));
		checkoutdate.sendKeys("2023-07-19" + Keys.ENTER);

		WebElement seltRoom = driver.findElement(By.id("no_rooms"));
		Select sltroom = new Select(seltRoom);
		sltroom.selectByVisibleText("1-One");

		WebElement noofAdult = driver.findElement(By.id("no_adults"));
		Select adult = new Select(noofAdult);
		adult.selectByVisibleText("1-One");

		Thread.sleep(1000);
		WebElement noofchild = driver.findElement(By.xpath("//input[@id='no_child']"));
		noofchild.sendKeys("0");

		WebElement search = driver.findElement(By.id("hotelsearch_iframe"));

		driver.switchTo().frame(search);

		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		
		WebElement buttn = driver.findElement(By.xpath("//label[@for='value_pltoh']"));
		buttn.click();
		System.out.println(buttn.getText());
		
		String price1 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[6]")).getText();
		System.out.println(price1);
		
		String price2 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[5]")).getText();
		System.out.println(price2);
		
		String price3 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[4]")).getText();
		System.out.println(price3);
		
		String price4 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[3]")).getText();
		System.out.println(price4);
		
		String price5 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[2]")).getText();
		System.out.println(price5);
		
		String price6 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[1]")).getText();
		System.out.println(price6);
		
		}

		}
		
			
		
	
		
	

