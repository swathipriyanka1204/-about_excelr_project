package com.webmath.algebra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlgebraSimplifyngExpressions {

	private WebDriver driver;
	private Properties properties;

	@BeforeMethod
	public void setUp() throws IOException {
		properties = new Properties();
		String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\com\\webmath\\algebra\\simplifyingexpressions.properties";
		FileInputStream fis = new FileInputStream(configFilePath);
		properties.load(fis);

		String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void powers() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String powers = properties.getProperty("powers");
			String expressionbox = properties.getProperty("expressionbox");
			String input1 = properties.getProperty("input1");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(powers)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input1);
			driver.findElement(By.xpath(submit)).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void products() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String algebra = properties.getProperty("algebra");
			String products = properties.getProperty("products");
			String expressionbox = properties.getProperty("expressionbox");
			String input2 = properties.getProperty("input2");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(products)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input2);
			driver.findElement(By.xpath(submit)).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void likeTerms() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String algebra = properties.getProperty("algebra");
			String liketerms = properties.getProperty("liketerms");
			String expressionbox = properties.getProperty("expressionbox");
			String input3 = properties.getProperty("input3");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(liketerms)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input3);
			driver.findElement(By.xpath(submit)).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void anythingElse() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String algebra = properties.getProperty("algebra");
			String anythingelse = properties.getProperty("anythingelse");
			String expressionbox = properties.getProperty("expressionbox");
			String input4 = properties.getProperty("input4");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(anythingelse)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input4);
			driver.findElement(By.xpath(submit)).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	private void closeApp() {
		driver.close();
	}

}