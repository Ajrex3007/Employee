package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class order {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("ajayanna1999@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Reyfie@3007");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("nuts" +Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.xpath("(//a[contains(text(),'Add')] )[1]"));
		add.click();
		
		Thread.sleep(3000);
		WebElement add1 = driver.findElement(By.xpath("//button[@id='cart-21']"));
		add1.click();
		
		
		Thread.sleep(3000);
		WebElement add3= driver.findElement(By.xpath("//button[@id='cart-22']"));
		add3.click();
		
		Thread.sleep(3000);
		WebElement gocart = driver.findElement(By.xpath("//a[contains(text(), 'Go To Cart ')]"));
		gocart.click();
		
		Thread.sleep(3000);
		//tagname[@text()='text']
		WebElement deliveryadd = driver.findElement(By.xpath("//div[@data-target='#addressModal']"));
		deliveryadd.click();
		
		Thread.sleep(3000);
		WebElement Addtype = driver.findElement(By.xpath("//select[@placeholder='Select']"));
		Addtype.sendKeys("Work");
			
		Thread.sleep(3000);
		WebElement  first = driver.findElement(By.xpath("//input[@placeholder='First name*']"));
		first.sendKeys("Ajay");
		
		Thread.sleep(3000);
		WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last name*']"));
		last.sendKeys("rey");
		
		Thread.sleep(3000);
		WebElement contact = driver.findElement(By.xpath("//input[@placeholder='Contact No*']"));
		contact.sendKeys("8754936187");
		
		Thread.sleep(3000);
		WebElement housenum  = driver.findElement(By.xpath("//input[@placeholder='House No*']"));
		housenum.sendKeys("168");
		
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.xpath("//input[@placeholder='Address*']"));
		address.sendKeys("north main street ");
		
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("India");
		Select selectcountry = new Select(country);
		selectcountry.selectByIndex(1);
		
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.name("state"));
		Select selectstate = new Select(state);
		selectstate.selectByVisibleText("Tamil Nadu");
		
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("thanjavur");
		
		Thread.sleep(3000);
		WebElement zipCode = driver.findElement(By.name("zipcode"));
		zipCode.sendKeys("613009");
		
		Thread.sleep(3000);
		WebElement save = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		save.click();
		
		
		
		
	}

}
