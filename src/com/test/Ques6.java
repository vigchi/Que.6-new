package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh Chinnappa\\eclipse-workspace\\Day2Task\\Drivers\\chromedriver.exe");
		//Launching Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/a"));
		//Sign.click();
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		user.sendKeys("vigneshchinna@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		pass.sendKeys("123456");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", button);

	}

}
