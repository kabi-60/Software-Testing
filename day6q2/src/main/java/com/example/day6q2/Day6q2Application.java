package com.example.day6q2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Day6q2Application {
	public static void main(String[] args) throws Exception {
        ChromeOptions options = new ChromeOptions();
        // To block ads
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        WebDriver driver = new ChromeDriver(options);
        Actions action = new Actions(driver);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // Step 1
        driver.get("https://www.moneycontrol.com/");

        // Step 2
        wait.until((d) -> d.findElement(By.id("search_str")));
        WebElement search = driver.findElement(By.id("search_str"));
        search.click();

        // Step 3
        search.sendKeys("Reliance Industries\n");

        // Step 4
        wait.until((d) -> d.findElement(By.linkText("Reliance Industries")));
        driver.findElement(By.linkText("Reliance Industries")).click();

        // Step 5
        String title = driver.findElement(By.cssSelector("#stockName h1")).getText();
        if (title.equals("Reliance Industries Ltd.")) {
            System.out.println("The text is \"Reliance Industries Ltd.\"");
        }

        // Step 6
        action.moveToElement(driver.findElement(By.cssSelector("[cid=\"2\"]"))).perform();
        driver.findElement(By.linkText("SIP Return")).click();

        // Step 7
        wait.until((d) -> d.findElement(By.id("ff_id")));
        Select mutualFundDropdown = new Select(driver.findElement(By.id("ff_id")));
        mutualFundDropdown.selectByVisibleText("Axis Mutual Fund");

        // Step 8
        wait.until((d) -> d.findElement(By.id("im_id")));
        Select mutualFundSchemeDropdown = new Select(driver.findElement(By.id("im_id")));
        mutualFundSchemeDropdown.selectByVisibleText("Axis Arbitrage Fund - Regular Plan (D)");

        // Step 9
        wait.until((d) -> d.findElement(By.id("invamt")));
        driver.findElement(By.id("invamt")).sendKeys("100000");

        // Step 10
        Select sipFrequencyDropdown = new Select(driver.findElement(By.id("frq")));
        sipFrequencyDropdown.selectByVisibleText("Monthly");

        // Step 11
        driver.findElement(By.id("stdt")).sendKeys("2021-08-02");
        driver.findElement(By.id("endt")).sendKeys("2023-08-17");

        // Step 12
        driver.findElement(By.cssSelector("[title=\"Calculate\"]")).click();

        // Step 13
        String investmentPeriod = driver
                .findElement(By.xpath("/html/body/div[9]/div[2]/div/div[3]/div[2]/div[6]/table/tbody/tr[1]/td[2]"))
                .getText();
        String totalAmountInvested = driver
                .findElement(By.xpath("/html/body/div[9]/div[2]/div/div[3]/div[2]/div[6]/table/tbody/tr[3]/td[2]"))
                .getText();

        System.out.println("Investment Period: " + investmentPeriod);
        System.out.println("total amount invested: " + totalAmountInvested);

        driver.close();
    }

}
