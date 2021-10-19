package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.Questions;

public class OperativaPage {

	private ButtonPages buttonPages;
	private Questions questions;

	public OperativaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}

	public void optionClientes() {
		questions.screenShot();
		buttonPages.btnOperativa();
		buttonPages.btnCliente();
		questions.screenShot();
	}

	public void optionCreation() {
		questions.tiempoSegundos(1);
		buttonPages.btnCrear();
		questions.screenShot();

	}

}
