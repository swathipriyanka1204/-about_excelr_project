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

public class AlgebraComplexNumbers {
	private WebDriver driver;
	private Properties properties;

	@BeforeMethod
	public void setUp() throws IOException {
		properties = new Properties();
		String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\com\\webmath\\algebra\\complexnumbers.properties ";
		FileInputStream fis = new FileInputStream(configFilePath);
		properties.load(fis);

		String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void powerOfi() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String powerofi = properties.getProperty("powerofi");
			String expressionbox = properties.getProperty("expressionbox");
			String input1 = properties.getProperty("input1");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(powerofi)).click();
			driver.findElement(By.xpath("expressionbox")).sendKeys("input1");
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void add() {
		try {
			String algebra = properties.getProperty("algebra");
			String add = properties.getProperty("add");
			String expressionbox = properties.getProperty("expressionbox");
			String input2 = properties.getProperty("input2");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(add)).click();
			driver.findElement(By.xpath("expressionbox")).sendKeys("input2");
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void subtract() {
		try {
			String algebra = properties.getProperty("algebra");
			String subtract = properties.getProperty("subtract");
			String expressionbox = properties.getProperty("expressionbox");
			String input3 = properties.getProperty("input3");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(subtract)).click();
			driver.findElement(By.xpath("expressionbox")).sendKeys("input3");
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void multiply() {
		try {
			String algebra = properties.getProperty("algebra");
			String multiply = properties.getProperty("multiply");
			String expressionbox = properties.getProperty("expressionbox");
			String input4 = properties.getProperty("input4");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(multiply)).click();
			driver.findElement(By.xpath("expressionbox")).sendKeys("input4");
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void crunch() {
		try {
			String algebra = properties.getProperty("algebra");
			String crunch = properties.getProperty("crunch");
			String expressionbox = properties.getProperty("expressionbox");
			String input5 = properties.getProperty("input5");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(crunch)).click();
			driver.findElement(By.xpath("expressionbox")).sendKeys("input5");
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
