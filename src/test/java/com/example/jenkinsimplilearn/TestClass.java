package com.example.jenkinsimplilearn;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	public WebDriver driver;
	public String browser = "chrome";
	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
	//	ChromeOptions options=new ChromeOptions();
	//	options.addArguments("--headless");
		driver =new ChromeDriver();
		String baseUrl="https://www.saucedemo.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();	
}
	@Test
	public void test2() {
		System.out.println("test run SucessFully!!!");
	}
	
	@Test
	public void test3() {
		System.out.println("New TEst Run added");
		driver.close();
	}
}

	

