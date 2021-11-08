package CuposWeb.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	private WebDriver driver;

	@FindBy(how = How.ID, using = "form:j_idt27")
	private WebElement btnLogin;

	@FindBy(how = How.CLASS_NAME, using = "ui-panelmenu-panel")
	private WebElement btnOperativa;

	@FindBy(how = How.CLASS_NAME, using = "ui-menuitem-text")
	private WebElement btnCliente;

	@FindBy(how = How.ID, using = "ClientesListForm:datalist:createButton")
	private WebElement btnCrear;

	@FindBy(how = How.ID, using = "ClientesCreateForm:tipodocumento")
	private WebElement btnDocument;

	@FindBy(how = How.ID, using = "ClientesCreateForm:desde_input")
	private WebElement btnCalendar;

	@FindBy(how = How.ID, using = "ClientesCreateForm:grupo_label")
	private WebElement btnGroup;

	@FindBy(how = How.ID, using = "ClientesCreateForm:banca")
	private WebElement btnBank;

	@FindBy(how = How.ID, using = "ClientesCreateForm:bancaCorporativa_label")
	private WebElement btnClas;

	@FindBy(how = How.ID, using = "ClientesListForm:datalist:viewButton")
	private WebElement btnConsult;

	@FindBy(how = How.ID, using = "ClientesListForm:datalist:deleteButton")
	private WebElement btnRemove;

	@FindBy(how = How.ID, using = "ClientesListForm:datalist:editButton")
	private WebElement btnEdit;

	@FindBy(how = How.ID, using = "ClientesViewForm:j_idt204")
	private WebElement btnExit;

	@FindBy(how = How.ID, using = "ClientesCreateForm:j_idt370_label")
	private WebElement btnSubSegment;

	@FindBy(how = How.ID, using = "ClientesCreateForm:gestorcomercial_label")
	private WebElement btnGestor;

	@FindBy(how = How.ID, using = "ClientesCreateForm:guardar")
	private WebElement btnGuardar;

	@FindBy(how = How.ID, using = "ClientesCreateRelacionForm:j_idt446")
	private WebElement btnDeAcuerdo;

	@FindBy(how = How.ID, using = "CuposListForm:moneda_label")
	private WebElement btnCoin;

	@FindBy(how = How.ID, using = "CuposListForm:estado")
	private WebElement btnState;

	@FindBy(how = How.ID, using = "CuposListForm:j_idt50")
	private WebElement btnSave;

	@FindBy(how = How.ID, using = "CuposListForm:datalist:0:createButton")
	private WebElement btnInfo;

	public ButtonPages(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void btnState() {
		btnState.click();
	}

	public void btnLogin() {
		btnLogin.click();
	}

	public void btnOperativa() {
		btnOperativa.click();

	}

	public void btnCliente() {
		btnCliente.click();

	}

	public void btnCrear() {
		btnCrear.click();

	}

	public void btnDocument() {
		btnDocument.click();

	}

	public void btnCalendar() {
		btnCalendar.click();

	}

	public void btnGroup() {
		btnGroup.click();

	}

	public void btnBank() {
		btnBank.click();

	}

	public void btnClas() {
		btnClas.click();

	}

	public void localId() {
		WebElement btnIdLoc = driver.findElement(By.xpath("//div[3]//table//tbody//tr//td"));
		btnIdLoc.click();
	}

	public void btnConsult() {
		btnConsult.click();

	}

	public void btnRemove() {
		btnRemove.click();

	}

	public void btnConfirmRemove() {
		WebElement btnIdLoc = driver.findElement(By.xpath("//button[@name ='ClientesListForm:j_idt87']"));
		btnIdLoc.click();
	}

	public void btnEdit() {
		btnEdit.click();
	}

	public void btnDateDay() {
		WebElement btnDateDay = driver.findElement(By.xpath("//button//span[@class='ui-button-text']"));
		btnDateDay.click();
	}

	public void btnExit() {
		btnExit.click();

	}

	public void btnIDate() {
		WebElement btnIDate = driver.findElement(By.xpath("//span//button[@type = 'button' ]"));
		btnIDate.click();
	}

	public void btnSubSegment() {

		btnSubSegment.click();
	}

	public void btnGestor() {

		btnGestor.click();
	}

	public void btnGuardar() {

		btnGuardar.click();
	}

	public void btnRolJ() {

		WebElement btnRolJ = driver.findElement(By.xpath("//*[@id=\"ClientesCreateRelacionForm:jerarquico\"]/div[3]"));
		btnRolJ.click();
	}

	public void btnDeAcuerdo() {

		btnDeAcuerdo.click();
	}

	public void btnManejoCupos() {

		WebElement btnMC = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/h3/a"));
		btnMC.click();
	}

	public void btnCreacionCupos() {
		WebElement btnCreationQu = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/ul/li[1]/a/span"));
		btnCreationQu.click();
	}

	public void btnCoin() {
		btnCoin.click();
	}

	public void btnSave() {
		btnSave.click();
	}

	public void btnModificationQuota() {
		WebElement btnModificationQ = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/ul/li[2]/a"));
		btnModificationQ.click();
	}

	public void btnAuthorize() {

		WebElement btnAu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[4]/h3/a"));
		btnAu.click();
	}

	public void btnAuthorizeTwo() {

		WebElement btnAuT = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div/ul/li/a"));
		btnAuT.click();
	}
	public void btnInfo() {

	}
	
	public void btnPending() {

		WebElement btnPending = driver.findElement(By.xpath("//*[@id=\"ClientesListForm:datalist_data\"]/tr/td[4]"));
		btnPending.click();
	}
	
	public void btnQuery() {

		WebElement btnQuery = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/ul/li[3]/a"));
		btnQuery.click();
	}
}
