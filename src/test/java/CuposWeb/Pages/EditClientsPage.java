package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.Questions;

public class EditClientsPage {
	private ButtonPages buttonPages;
	private Questions questions;


	@FindBy(how = How.ID, using = "ClientesListForm:datalist:j_idt30:filter")
	private WebElement btnFilterDoc;
	
	@FindBy(how = How.ID, using = ("ClientesEditForm:nombre"))
	private WebElement Name;

	@FindBy(how = How.ID, using = ("ClientesEditForm:rating_input"))
	private WebElement Rating;
	
	@FindBy(how = How.ID, using = ("ClientesEditForm:valorventas_input"))
	private WebElement Ventas;
	
	@FindBy(how = How.ID, using = "ClientesEditForm:estadocliente")
	private WebElement btnEstado;
	
	public EditClientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}

	// Metodo para editar clientes
	public void edit(String FilterDoc, String NewName, String rating, String ventas ) {
		btnFilterDoc.sendKeys(FilterDoc);
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.localId();
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.btnEdit();
		Name.clear();
		Name.sendKeys(NewName);
		questions.screenShot();
		questions.tiempoSegundos(1);
		Rating.clear();
		Rating.sendKeys(rating);
		questions.tiempoSegundos(1);
		Ventas.clear();
		Ventas.sendKeys(ventas);
		questions.screenShot();
		questions.tiempoSegundos(1);



		
		
		
		
	}

}
