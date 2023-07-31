package com.webmath.algebra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlgebraWordProblems {

	public WebDriver driver;
	public Properties properties;

	@BeforeMethod
	public void setUp() throws IOException {
		String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		properties = new Properties();
		String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\com\\webmath\\algebra\\wordproblems.properties";
		FileInputStream fis = new FileInputStream(configFilePath);
		properties.load(fis);
	}

	@Test
	public void percentage() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String percent = properties.getProperty("percent_link_locator");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String expressionBox3 = properties.getProperty("expressionBox3");
			String expressionBox4 = properties.getProperty("expressionBox4");
			String expressionBox5 = properties.getProperty("expressionBox5");
			String expressionBox6 = properties.getProperty("expressionBox6");
			String expressionBox7 = properties.getProperty("expressionBox7");
			String expressionBox8 = properties.getProperty("expressionBox8");
			String expressionBox9 = properties.getProperty("expressionBox9");
			String expressionBox10 = properties.getProperty("expressionBox10");
			String back = properties.getProperty("back");
			String input1 = properties.getProperty("input1");
			String input2 = properties.getProperty("input2");
			String input3 = properties.getProperty("input3");
			String input4 = properties.getProperty("input4");
			String input5 = properties.getProperty("input5");
			String input6 = properties.getProperty("input6");
			String input7 = properties.getProperty("input7");
			String input8 = properties.getProperty("input8");
			String input9 = properties.getProperty("input9");
			String input10 = properties.getProperty("input10");
			String submit1 = properties.getProperty("submit1");
			String submit2 = properties.getProperty("submit2");
			String submit3 = properties.getProperty("submit3");
			String submit4 = properties.getProperty("submit4");
			String submit5 = properties.getProperty("submit5");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(percent)).click();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input1);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input2);
			driver.findElement(By.xpath(submit1)).click();

			driver.findElement(By.xpath(back)).click();

			driver.findElement(By.xpath(expressionBox3)).sendKeys(input3);
			driver.findElement(By.xpath(expressionBox4)).sendKeys(input4);
			driver.findElement(By.xpath(submit2)).click();

			driver.findElement(By.xpath(back)).click();

			driver.findElement(By.xpath(expressionBox5)).sendKeys(input5);
			driver.findElement(By.xpath(expressionBox6)).sendKeys(input6);
			driver.findElement(By.xpath(submit3)).click();

			driver.findElement(By.xpath(back)).click();

			driver.findElement(By.xpath(expressionBox7)).sendKeys(input7);
			driver.findElement(By.xpath(expressionBox8)).sendKeys(input8);
			driver.findElement(By.xpath(submit4)).click();

			driver.findElement(By.xpath(back)).click();

			driver.findElement(By.xpath(expressionBox9)).sendKeys(input9);
			driver.findElement(By.xpath(expressionBox10)).sendKeys(input10);
			driver.findElement(By.xpath(submit5)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	private void closeApp() {
		driver.close();
	}
}
