package com.example.day5q1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day5q1Application {
	

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com");
	
			Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(d -> d.findElement(By.linkText("Laptops")));
	
			driver.findElement(By.linkText("Laptops")).click();
	
			wait.until(d -> d.findElement(By.linkText("MacBook air")));
			driver.findElement(By.linkText("MacBook air")).click();
	
			wait.until(d -> d.findElement(By.linkText("Add to cart")));
			driver.findElement(By.linkText("Add to cart")).click();
	
			Thread.sleep(3000);
			driver.switchTo().alert().dismiss();
			driver.findElement(By.linkText("Cart")).click();
	
			wait.until(d -> d.findElement(By.tagName("td")));
			List<WebElement> list = driver.findElements(By.tagName("td"));
			System.out.println("Title : " + list.get(1).getText());
			System.out.println("Price : " + list.get(2).getText());
	
			driver.close();
		
	}

}
