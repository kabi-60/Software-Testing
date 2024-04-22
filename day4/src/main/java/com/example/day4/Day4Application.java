package com.example.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4Application {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 WebDriver driver2 = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver2.get("https://support.mozilla.org/en-US/products/firefox/install-and-update-firefox");
		driver2.manage().window().fullscreen();
		driver.manage().window().fullscreen();
		driver.findElement(By.className("gb_Ld")).click();
		driver.findElement(By.id("identifierId")).sendKeys("969870");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("5250");
		Thread.sleep(1000);
		driver.findElement(By.className("VfPpkd-dgl2Hf-ppHlrf-sM5MNb")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("VfPpkd-Jh9lGc")).click();
		SpringApplication.run(Day4Application.class, args);
	}

}
