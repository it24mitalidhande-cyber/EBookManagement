package com.ebook.management;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbookSeleniumTest {

    @Test
    public void testEBookWebsite() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8081");

        driver.manage().window().maximize();

        // Check heading
        WebElement heading = driver.findElement(
                By.xpath("//h1[contains(text(),'E-Book Management System')]")
        );

        assertTrue(heading.isDisplayed());

        // Search for Java
        WebElement searchBox = driver.findElement(
                By.tagName("input")
        );

        searchBox.sendKeys("Java");

        Thread.sleep(2000);

        // Check Java Programming book
        WebElement javaBook = driver.findElement(
                By.xpath("//*[contains(text(),'Java Programming')]")
        );

        assertTrue(javaBook.isDisplayed());

        System.out.println("Selenium Test Passed Successfully!");

        driver.quit();
    }
}