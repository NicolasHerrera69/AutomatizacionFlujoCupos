package CuposWeb.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.ListPages;
import CuposWeb.Steps.Questions;

public class CreateClientsPage {
	private ListPages listPages;
	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.ID, using = ("ClientesCreateForm:nombre"))
	private WebElement Name;

	@FindBy(how = How.ID, using = "ClientesCreateForm:nit")
	private WebElement DocumentNum;

	@FindBy(how = How.ID, using = "ClientesCreateForm:digitochequeo")
	private WebElement DigitCh;

	@FindBy(how = How.ID, using = "ClientesCreateForm:desde_input")
	private WebElement Date;

	@FindBy(how = How.ID, using = ("ClientesCreateForm:rating_input"))
	private WebElement Rating;

	@FindBy(how = How.ID, using = ("ClientesCreateForm:valoractivo_input"))
	private WebElement Activo;

	@FindBy(how = How.ID, using = ("ClientesCreateForm:valorventas_input"))
	private WebElement Ventas;

	@FindBy(how = How.ID, using = ("ClientesCreateRelacionForm:participacion_input"))
	private WebElement PorcentajeP;

	@FindBy(how = How.ID, using = ("ClientesCreateRelacionForm:empleados_input"))
	private WebElement NumeroE;

	public CreateClientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.listPages = new ListPages(driver);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}

	public void basicInformationFirstPart(String documents, String documentNum, String digit, String name,
			String date) {
		buttonPages.btnDocument();
		questions.tiempoSegundos(2);
		listPages.documentType(documents);
		questions.tiempoSegundos(1);
		DocumentNum.sendKeys(documentNum);
		DocumentNum.sendKeys(Keys.TAB);
		questions.tiempoSegundos(1);
		questions.tiempoSegundos(1);

		Name.sendKeys(name);
		DigitCh.sendKeys(digit);
		Date.sendKeys(date);
	}

	public void basicInformationSecondPart(String groups, String banks, String SubSeg, String Gestor) {
		buttonPages.btnGroup();
		listPages.group(groups);
		questions.tiempoSegundos(1);
		buttonPages.btnBank();
		listPages.localBank(banks);
		questions.tiempoSegundos(1);
		buttonPages.btnSubSegment();
		listPages.SubSegmento(SubSeg);
		questions.tiempoSegundos(1);
		buttonPages.btnGestor();
		listPages.GestorComercial(Gestor);
		questions.tiempoSegundos(1);

	}

	public void financialInformation(String rating, String activo, String ventas) {

		Rating.clear();
		Rating.sendKeys(rating);
		questions.tiempoSegundos(1);
		Activo.clear();
		Activo.sendKeys(activo);
		Ventas.clear();
		questions.tiempoSegundos(1);
		Ventas.sendKeys(ventas);
		buttonPages.btnGuardar();
		questions.tiempoSegundos(2);

	}

	public void additionalData(String roles, String porcentaje, String numeroE) {

		buttonPages.btnRolJ();
		listPages.Rol(roles);
		questions.tiempoSegundos(1);
		PorcentajeP.sendKeys(porcentaje);
		NumeroE.sendKeys(numeroE);
		questions.tiempoSegundos(1);
		buttonPages.btnDeAcuerdo();

	}
}
