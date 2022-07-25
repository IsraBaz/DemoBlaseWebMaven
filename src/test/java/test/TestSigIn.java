package test;

import org.testng.annotations.Test;

import com.project.pom.HomePage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TestSigIn {
	
	//Objeto Driver
	private WebDriver driver;
	
	HomePage homePage;
	
	@BeforeClass
	  public void beforeClass() {
		homePage = new HomePage(driver);
		driver = homePage.chromeDriverConnection();
		//Url de la aplicación
		homePage.navigateTo("https://www.demoblaze.com/");
		//Maximizar ventana
		driver.manage().window().maximize();	
	  }
	
	@Test
	public void login() {
		
		homePage.elementWait1();
		System.out.println("El localizador texto si se encuentra");
		homePage.clickSignUp();
		System.out.println("Se dio clic al botón Inscribirse");
	}



	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
