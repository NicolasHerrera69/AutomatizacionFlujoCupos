package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.Questions;

public class ConsultClientsPage {

	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.ID, using = "ClientesListForm:datalist:j_idt30:filter")
	private WebElement btnFilterDoc;

	public ConsultClientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}

	// Metodo para consultar cliente
	public void consult(String FilterDoc) {
		btnFilterDoc.sendKeys(FilterDoc);
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.localId();
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.btnConsult();
		questions.tiempoSegundos(2);
		questions.screenShot();
		buttonPages.btnExit();
		questions.tiempoSegundos(1);
		questions.screenShot();

	}

}
