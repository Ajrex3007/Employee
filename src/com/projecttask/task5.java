package com.projecttask;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		
		
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
		System.out.println(room);

		WebElement checkIndate = driver.findElement(By.xpath("//input[@name='check_in']"));
		checkIndate.sendKeys("2023-07-12" + Keys.ENTER);

		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='check_out']"));
		checkoutdate.sendKeys("2023-07-19" + Keys.ENTER);

		WebElement seltRoom = driver.findElement(By.id("no_rooms"));
		Select sltroom = new Select(seltRoom);
		sltroom.selectByVisibleText("2-Two");

		WebElement noofAdult = driver.findElement(By.id("no_adults"));
		Select adult = new Select(noofAdult);
		adult.selectByVisibleText("2-Two");

		Thread.sleep(1000);
		WebElement noofchild = driver.findElement(By.xpath("//input[@id='no_child']"));
		noofchild.sendKeys("1");

		WebElement search = driver.findElement(By.id("hotelsearch_iframe"));

		driver.switchTo().frame(search);

		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		
		WebElement clck = driver.findElement(By.xpath("(//a[text()='Continue'])[1]"));
		clck.click();
		
		driver.switchTo().alert().accept();
		
		WebElement optn = driver.findElement(By.id("own"));
		optn.click();
		
		WebElement title = driver.findElement(By.id("user_title"));
		title.sendKeys("Mr");
	
		WebElement name2 = driver.findElement(By.id("first_name"));
		name2.sendKeys("Ajay");
		
		WebElement name3 = driver.findElement(By.id("last_name")); 
		name3.sendKeys("Anna");
		
		WebElement name4 = driver.findElement(By.id("user_phone"));
		name4.sendKeys("8754936187");
		
		WebElement name5 = driver.findElement(By.id("user_email"));
		name5.sendKeys("ajayanna@1999gmail.com");
		
		WebElement chckbx = driver.findElement(By.id("gst"));
		chckbx.click();
		
		WebElement GSTNUM = driver.findElement(By.id("gst_registration"));
		GSTNUM.sendKeys("9043592058");
		
		WebElement cmpnum = driver.findElement(By.id("company_name"));
		cmpnum.sendKeys("Greens Tech OMR Branch");
		
		WebElement cmpadd = driver.findElement(By.id("company_address"));
		cmpadd.sendKeys("Thoraipakkam");
		
		WebElement clck1 = driver.findElement(By.id("step1next"));
		clck1.click();
		
		WebElement clck2 = driver.findElement(By.id("step2next"));
		clck2.click();
		
		WebElement card = driver.findElement(By.xpath("//h5[text()='Credit/Debit/ATM Card']"));
		card.click();
		
		WebElement cardtype = driver.findElement(By.id("payment_type"));
		cardtype.sendKeys("Debit Card");
		
		WebElement cardv = driver.findElement(By.id("card_type"));
		cardv.sendKeys("Visa");
		
		WebElement cardnum = driver.findElement(By.id("card_no"));
		cardnum.sendKeys("5555555555552222");
		
		WebElement cardname = driver.findElement(By.id("card_name"));
		cardname.sendKeys("ajay");
		
		WebElement cardmnth = driver.findElement(By.id("card_month"));
		cardmnth.sendKeys("December");
		
		WebElement cardyear = driver.findElement(By.id("card_year"));
		cardyear.sendKeys("2023");
		
		WebElement cardcvv = driver.findElement(By.id("cvv"));
		cardcvv.sendKeys("123");
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement submit = driver.findElement(By.xpath("(//button[text()='Submit'])[1]"));	
		submit.click();
		
		String textget = driver.findElement(By.xpath("//Strong[text()='#QZTIM60570']")).getText();
		System.out.println(textget);
		
		
		
		
		
		
		
	}

}
