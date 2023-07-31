package com.webmath.algebra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebMathAlgebraSimplyfingExpressions {
	 public WebDriver driver;
	    public Properties properties;

	    @BeforeMethod
	    public void setUp() throws IOException {
	        properties = new Properties();
	        String configFilePath = "E:\\02.07.2023\\about_excelr_project\\src\\test\\java\\com\\webmath\\algebra\\config.properties";
	        FileInputStream fis = new FileInputStream(configFilePath);
	        properties.load(fis);

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\Downloads\\swathi\\02.07.2023\\jarfoldar\\chromeDriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testPowersSection() {
	        navigateToWebMath();
	        powersSection();
	    }

	    @Test
	    public void testProductsSection() {
	        navigateToWebMath();
	        productsSection();
	    }

	    @Test
	    public void testLikeTermsSection() {
	        navigateToWebMath();
	        likeTermsSection();
	    }

	    @Test
	    public void testAnythingElseSection() {
	        navigateToWebMath();
	        anythingElseSection();
	    }

	    public void navigateToWebMath() {
	        String webmathUrl = properties.getProperty("webmath_url");
	        driver.get(webmathUrl);
	    }

	    public void powersSection() {
	        try {
	            String powersLinkText = properties.getProperty("powers_link_text");
	            String powersExpressionInputXpath = properties.getProperty("powers_expression_input_xpath");
	            String powersExpressionToEnter = properties.getProperty("powers_expression_to_enter");
	            String powersSimplifyButtonXpath = properties.getProperty("powers_simplify_button_xpath");

	            driver.findElement(By.linkText(powersLinkText)).click();
	            driver.findElement(By.xpath(powersExpressionInputXpath)).clear();
	            driver.findElement(By.xpath(powersExpressionInputXpath)).sendKeys(powersExpressionToEnter);
	            driver.findElement(By.xpath(powersSimplifyButtonXpath)).click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void productsSection() {
	        try {
	            String productsLinkText = properties.getProperty("products_link_text");
	            String productsProductsLinkText = properties.getProperty("products_products_link_text");
	            String productsExpressionInputXpath = properties.getProperty("products_expression_input_xpath");
	            String productsExpressionToEnter = properties.getProperty("products_expression_to_enter");
	            String productsSimplifyButtonXpath = properties.getProperty("products_simplify_button_xpath");

	            driver.findElement(By.linkText(productsLinkText)).click();
	            driver.findElement(By.linkText(productsProductsLinkText)).click();
	            driver.findElement(By.xpath(productsExpressionInputXpath)).clear();
	            driver.findElement(By.xpath(productsExpressionInputXpath)).sendKeys(productsExpressionToEnter);
	            driver.findElement(By.xpath(productsSimplifyButtonXpath)).click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void likeTermsSection() {
	        try {
	            String likeTermsLinkText = properties.getProperty("like_terms_link_text");
	            String likeTermsLikeTermsLinkText = properties.getProperty("like_terms_like_terms_link_text");
	            String likeTermsExpressionInputXpath = properties.getProperty("like_terms_expression_input_xpath");
	            String likeTermsExpressionToEnter = properties.getProperty("like_terms_expression_to_enter");
	            String likeTermsSimplifyButtonXpath = properties.getProperty("like_terms_simplify_button_xpath");

	            driver.findElement(By.linkText(likeTermsLinkText)).click();
	            driver.findElement(By.linkText(likeTermsLikeTermsLinkText)).click();
	            driver.findElement(By.xpath(likeTermsExpressionInputXpath)).clear();
	            driver.findElement(By.xpath(likeTermsExpressionInputXpath)).sendKeys(likeTermsExpressionToEnter);
	            driver.findElement(By.xpath(likeTermsSimplifyButtonXpath)).click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void anythingElseSection() {
	        try {
	            String anythingElseLinkText = properties.getProperty("anything_else_link_text");
	            String anythingElseAnythingElseLinkText = properties.getProperty("anything_else_anything_else_link_text");
	            String anythingElseExpressionInputXpath = properties.getProperty("anything_else_expression_input_xpath");
	            String anythingElseExpressionToEnter = properties.getProperty("anything_else_expression_to_enter");
	            String anythingElseSimplifyButtonXpath = properties.getProperty("anything_else_simplify_button_xpath");

	            driver.findElement(By.linkText(anythingElseLinkText)).click();
	            driver.findElement(By.linkText(anythingElseAnythingElseLinkText)).click();
	            driver.findElement(By.xpath(anythingElseExpressionInputXpath)).clear();
	            driver.findElement(By.xpath(anythingElseExpressionInputXpath)).sendKeys(anythingElseExpressionToEnter);
	            driver.findElement(By.xpath(anythingElseSimplifyButtonXpath)).click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }}