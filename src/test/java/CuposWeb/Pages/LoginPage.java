package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.Questions;

public class LoginPage {

	private ButtonPages buttonPages;
	private Questions questions;


	@FindBy(how = How.ID, using = "form:nombre")
	private WebElement inputUserName;

	@FindBy(how = How.ID, using = "form:clave")
	private WebElement inputUserPassword;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
	}

//Metodo para ingresar informacion del flujo de login
	public void loginIn(String userName, String password) {
		inputUserName.sendKeys(userName);
		inputUserPassword.sendKeys(password);
		questions.tiempoSegundos(1);
		questions.screenShot();	
		buttonPages.btnLogin();
		questions.tiempoSegundos(1);
		questions.screenShot();
		
	}
}