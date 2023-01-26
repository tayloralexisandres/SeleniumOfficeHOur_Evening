package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


    public static void main(String[] args) {

        ///TC #1: Facebook title verification
        //1// Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2// Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //3// Verify title:
//          VerifyExpected: “Facebook –log in or sign up”
       // WebElement title=driver.findElement(By.cssSelector("title[id='pageTitle']"));
       String expectedTitle="Facebook - log in or sign up";
       String actualTitle=driver.getTitle();
       if(actualTitle.equals(expectedTitle)){
           System.out.println("Title verification PASS");
       }else {
           System.out.println("Title verification FAIL");
       }



driver.close();



    }
}




