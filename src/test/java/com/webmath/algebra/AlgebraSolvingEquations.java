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

public class AlgebraSolvingEquations {
	public WebDriver driver;
	public Properties properties;

	@BeforeMethod
	public void setUp() throws IOException {
		String chromeDriverPath = properties.getProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		properties = new Properties();
		String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\com\\webmath\\algebra\\solvingequations.properties";
		FileInputStream fis = new FileInputStream(configFilePath);
		properties.load(fis);
	}

	@Test(priority = 1)
	public void oneEquation() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String oneequation = properties.getProperty("oneequation");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String expressionBox3 = properties.getProperty("expressionBox3");
			String input1 = properties.getProperty("input1");
			String input2 = properties.getProperty("input2");
			String input3 = properties.getProperty("input3");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(oneequation)).click();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input1);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input2);
			driver.findElement(By.xpath(expressionBox3)).sendKeys(input3);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void twoEquations() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String algebra = properties.getProperty("algebra");
			String twoequations = properties.getProperty("twoequations");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String expressionBox3 = properties.getProperty("expressionBox3");
			String expressionBox4 = properties.getProperty("expressionBox4");
			String expressionBox5 = properties.getProperty("expressionBox5");
			String expressionBox6 = properties.getProperty("expressionBox6");
			String input4 = properties.getProperty("input4");
			String input5 = properties.getProperty("input5");
			String input6 = properties.getProperty("input6");
			String input7 = properties.getProperty("input7");
			String input8 = properties.getProperty("input8");
			String input9 = properties.getProperty("input9");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(twoequations)).click();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input4);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input5);
			driver.findElement(By.xpath(expressionBox3)).sendKeys(input6);
			driver.findElement(By.xpath(expressionBox4)).sendKeys(input7);
			driver.findElement(By.xpath(expressionBox5)).sendKeys(input8);
			driver.findElement(By.xpath(expressionBox6)).sendKeys(input9);
			driver.findElement(By.xpath(submit)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void numerically() {
		try {
			String webmathUrl = properties.getProperty("webmath_url");
			String algebra = properties.getProperty("algebra");
			String numerically = properties.getProperty("numerically");
			String expressionBox1 = properties.getProperty("expressionBox1");
			String expressionBox2 = properties.getProperty("expressionBox2");
			String expressionBox3 = properties.getProperty("expressionBox3");
			String input10 = properties.getProperty("input10");
			String input11 = properties.getProperty("input11");
			String input12 = properties.getProperty("input12");
			String submit = properties.getProperty("submit");

			driver.get(properties.getProperty("webmath_url"));
			driver.findElement(By.linkText(algebra)).click();
			driver.findElement(By.linkText(numerically)).click();
			driver.findElement(By.xpath(expressionBox1)).sendKeys(input10);
			driver.findElement(By.xpath(expressionBox2)).sendKeys(input11);
			driver.findElement(By.xpath(expressionBox3)).sendKeys(input12);
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
