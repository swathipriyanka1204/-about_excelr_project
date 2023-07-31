package com.webmath.algebra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InequalitiesAlgebra {
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
    
    @Test
    public void testPowersSection() {
        navigateToWebMath_url();
        testSolvingInequalities();
    }

    @Test
    public void testProductsSection() {
        navigateToWebMath_url();
        testGraphingExpression();
    }
    
    public void navigateToWebMath_url() {
        String webmathUrl = properties.getProperty("webmath_url");
        driver.get(webmathUrl);
    }
    public void testSolvingInequalities() {
        try {
            String webmathUrl = properties.getProperty("webmath_url");
            String solvingLinkText = properties.getProperty("solving_link_text");
            String inputExpressionLocator = properties.getProperty("input_expression_locator");
            String inputValueLocator = properties.getProperty("input_value_locator");
            String inputVariableLocator = properties.getProperty("input_variable_locator");
            String solveButtonLocator = properties.getProperty("solve_button_locator");
            String algebraLinkText = properties.getProperty("algebra_link_text");

            WebDriverWait wait = new WebDriverWait(driver,null);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText(solvingLinkText))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputExpressionLocator))).sendKeys(properties.getProperty("inequality_expression"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputValueLocator))).sendKeys(properties.getProperty("inequality_value"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputVariableLocator))).sendKeys(properties.getProperty("inequality_variable"));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(solveButtonLocator))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.linkText(algebraLinkText))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void testGraphingExpression() {
        try {
        	 String webmathUrl = properties.getProperty("webmath_url");
             String algebraLinkText = properties.getProperty("algebra_link_text");
             String graphingLinkText = properties.getProperty("graphing_link_text");
             String plottingInputLocator = properties.getProperty("plotting_input_locator");
             String plottingButtonLocator = properties.getProperty("plotting_button_locator");

             driver.get(webmathUrl);

             WebDriverWait wait = new WebDriverWait(driver,null);
             wait.until(ExpectedConditions.elementToBeClickable(By.linkText(algebraLinkText))).click();
             wait.until(ExpectedConditions.elementToBeClickable(By.linkText(graphingLinkText))).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(plottingInputLocator))).clear();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(plottingInputLocator))).sendKeys(properties.getProperty("graphing_expression"));
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath(plottingButtonLocator))).click();
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
