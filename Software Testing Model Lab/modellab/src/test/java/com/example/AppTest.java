package com.example;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
   
    WebDriver driver;
    @Test
    public void testCase() throws  InterruptedException, IOException
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.opentable.com");
        Thread.sleep(3000);
        String data=excel(1,1);
         driver.findElement(By.xpath("/html/body/div[1]/div/div/main/header/div/span/div/div/div[2]/div[1]/div/input")).sendKeys(data);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/header/div/span/div/div/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/a/h6")).click();

        
    }

    public String excel(int row,int cell) throws IOException
    {
        FileInputStream fs=new FileInputStream("C:\\Users\\bear boi\\Desktop\\Software Testing Model Lab\\modellab\\src\\resource\\data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fs);
        XSSFSheet sheet=workbook.getSheetAt(0);
        Row rows=sheet.getRow(row);
        Cell cells=rows.getCell(cell);
        String data=cells.getStringCellValue();
        return data;
    }
}
