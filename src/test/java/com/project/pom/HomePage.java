package com.project.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.base.BasePage;

public class HomePage extends BasePage {
	
	//Botón "Sigup" (Registrarse)
	By lincSignup = By.id("signin2");
	//Campo para registrar nombre de usuario nuevo
	By NameFieldUsNew = By.id("sign-username");
	//Campo para ingresar password de usuario nuevo
	By PwdFieldUsNew = By.id("sign-password");
	//Botón aceptar (para registrar nuevo usuario)
	By buttonAcceptSignUp = By.xpath("button[onclick='register()']");
	
	//Elemento de espera
	By webElTime1 = By.xpath("//a[@id='cat']");
	
	private static WebDriverWait wait;
	
	//Constructor SUPER para las propiedades de BasePage
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Elemento de espera "Categorías" / Espera explicita 
	public WebElement elementWait1() {
		//wait = (WebDriverWait) new WebDriverWait(driver,Duration.ofSeconds(10));
		wait = (WebDriverWait) new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(webElTime1));
	}
	
	public void clickSignUp() {
		click(lincSignup);
	}
	
	

}
