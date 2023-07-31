package com.webmath.algebra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AlgebraInequalities {
	public WebDriver driver;
	public Properties properties;

	@BeforeMethod

	public void setUp() throws IOException {

		properties = new Properties();
		String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\inequalities.properties";
		FileInputStream fis = new FileInputStream(configFilePath);
		properties.load(fis);

		String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void solvingInequalities() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String solving = properties.getProperty("solving");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String expressionBox3 = properties.getProperty("expressionBox3");
			String input1 = properties.getProperty("input1");
			String input2 = properties.getProperty("input2");
			String input3 = properties.getProperty("input3");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(solving)).click();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input1);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input2);
			driver.findElement(By.xpath(expressionBox3)).sendKeys(input3);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void graphing() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String algebra = properties.getProperty("algebra");
			String graphing = properties.getProperty("graphing");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String input4 = properties.getProperty("input4");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(graphing)).click();
			driver.findElement(By.xpath(expressionBox1)).clear();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input4);
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