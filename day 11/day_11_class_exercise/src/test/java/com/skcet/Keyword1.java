package com.skcet;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword1 { // Hybrid which combines data driven and Keyword
    WebDriver driver;

    @Test
    public void test1() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        FileInputStream fs = new FileInputStream(
                "E:\\Software Testing\\Selenium\\skcet_software_teesting\\day 11\\day_11_class_exercise\\assests\\workbook.xlsx");
        // create an workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);


        
        int rowCount = sheet.getLastRowNum();
        // int colCount=sheet.getRow(0).getLastCellNum();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i + 1);
            // keyword1 + data
            if (row.getCell(0).getStringCellValue().equals("open_url")) {
                driver.get(row.getCell(1).getStringCellValue());
                Thread.sleep(3000);
                row = sheet.getRow(2);
            }
            // //keyword2
            else if (row.getCell(0).getStringCellValue().equals("get_Title")) {
                System.out.println(driver.getTitle());
                org.junit.Assert.assertEquals(driver.getTitle(), "Google");
            }
            // //keyword3 + data
            else if (row.getCell(0).getStringCellValue().equals("send_contents")) {
                driver.findElement(By.name(row.getCell(2).getStringCellValue()))
                        .sendKeys(row.getCell(1).getStringCellValue(), Keys.ENTER);
                org.junit.Assert.assertTrue(driver.getTitle().contains(row.getCell(1).getStringCellValue()));
            }
        }

        fs.close();

    }

}
