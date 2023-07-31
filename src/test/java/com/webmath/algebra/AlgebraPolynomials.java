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

public class AlgebraPolynomials {
	private WebDriver driver;
	private Properties properties;

	@BeforeMethod
	public void setUp() throws IOException {
		properties = new Properties();
		String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\com\\webmath\\algebra\\polynomials.properties";
		FileInputStream fis = new FileInputStream(configFilePath);
		properties.load(fis);

		String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void addSub() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String addsub = properties.getProperty("addsub");
			String expressionbox = properties.getProperty("expressionbox");
			String input1 = properties.getProperty("input1");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(addsub)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input1);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void multiply() {
		try {
			String algebra = properties.getProperty("algebra");
			String multiply = properties.getProperty("multiply");
			String input2 = properties.getProperty("input2");
			String expressionbox = properties.getProperty("expressionbox");
			String submit = properties.getProperty("submit");

			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(multiply)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input2);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	public void div() {
		try {
			String algebra = properties.getProperty("algebra");
			String div = properties.getProperty("div");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String input3 = properties.getProperty("input3");
			String input4 = properties.getProperty("input4");
			String submit = properties.getProperty("submit");

			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(div)).click();
			driver.findElement(By.xpath(expressionBox1)).clear();
			driver.findElement(By.xpath(expressionBox2)).clear();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input3);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input4);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=4)
	public void exponent() {
		try {

			String algebra = properties.getProperty("algebra");
			String exponent = properties.getProperty("exponent");
			String expressionbox = properties.getProperty("expressionbox");
			String input5 = properties.getProperty("input5");
			String submit = properties.getProperty("submit");

			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(exponent)).click();
			driver.findElement(By.xpath(expressionbox)).clear();
			driver.findElement(By.xpath(expressionbox)).sendKeys(input5);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void square() {
		try {

			String algebra = properties.getProperty("algebra");
			String square = properties.getProperty("square");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String input6 = properties.getProperty("input6");
			String input7 = properties.getProperty("input7");
			String submit = properties.getProperty("submit");

			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(square)).click();
			driver.findElement(By.xpath(expressionBox1)).clear();
			driver.findElement(By.xpath(expressionBox2)).clear();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input6);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input7);
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
