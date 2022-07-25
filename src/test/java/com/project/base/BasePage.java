package com.project.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	//Objeto est�tico "driver" para la instancia de un solo valor
	protected static WebDriver driver;
	
	//Constructor
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	
	//M�todo para iniciar ChromeDriver
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	//M�todo para la URL
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	//M�todo para crear envoltorio del Wrapping para nuestro propio m�todo
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	//M�todo para devolver el texto de un elemento
	public String getText(WebElement element) {
		return element.getText();
	}
	
	//M�todo para devolver el texto de un elemento buscado
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	//M�todo para teclear texto
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//M�todo para dar clic
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	//M�todo para saber si un elemento esta visible para ser utilizado
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
}
