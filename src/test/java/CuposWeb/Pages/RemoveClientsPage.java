package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.Questions;


public class RemoveClientsPage {
	private ButtonPages buttonPages;
	private Questions questions;
	
	
	@FindBy(how = How.ID, using = "ClientesListForm:datalist:j_idt30:filter")
	private WebElement btnFilterId;
	
	public RemoveClientsPage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		
		
	}
	
	//Metodo para seleccionar documento a eliminar 
	public void remove(String FilterIds ) {
		btnFilterId.sendKeys(FilterIds);
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.localId();
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.btnRemove();
		questions.tiempoSegundos(1);
		questions.screenShot();
		buttonPages.btnConfirmRemove();
		questions.tiempoSegundos(3);
		questions.screenShot();
		
		
		
		
	}
}
