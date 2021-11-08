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

public class CreationOfQuotasPage {

	private ButtonPages buttonPages;
	private Questions questions;
	private ListPages listPages;

	@FindBy(how = How.ID, using = "CuposListForm:nit_input")
	private WebElement btnNumbDoc;

	@FindBy(how = How.ID, using = "CuposListForm:fechaalta_input")
	private WebElement btnDateOn;

	@FindBy(how = How.ID, using = "CuposListForm:fechavencimiento_input")
	private WebElement btnDateOff;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CuposListForm:limitetotal_input\"]")
	private WebElement btnLimit;

	@FindBy(how = How.ID, using = "CuposListForm:datalist:0:j_idt75_input")
	private WebElement btnModalidad;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CuposListForm:datalist:0:j_idt75_input\"]")
	private WebElement btnValConf;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"CuposListForm:datalist:0:j_idt75_input\"]")
	private WebElement btnprueba;
	
	

	public CreationOfQuotasPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);

	}

	public void clientData(String numbDoc, String dateOn, String dateOff) {
		btnNumbDoc.sendKeys(numbDoc);
		questions.tiempoSegundos(1);
		btnNumbDoc.sendKeys(Keys.ENTER);
		questions.tiempoSegundos(1);
		btnDateOn.sendKeys(dateOn);
		btnDateOff.sendKeys(dateOff);


	}

	public void clientDataTwo(String limit, String prueba) throws InterruptedException {
		Thread.sleep(500);
		btnLimit.clear();
		Thread.sleep(500);
		btnLimit.sendKeys(limit);
		Thread.sleep(500);
		btnLimit.sendKeys(Keys.TAB);
		btnLimit.sendKeys(Keys.TAB);
		btnLimit.sendKeys(Keys.TAB);
		btnprueba.clear();
		btnprueba.sendKeys(prueba);

		
		

		
		//listPages.coinList(coinList);

	//	btnValConf.clear();
	//	btnValConf.sendKeys(limit);
	//	buttonPages.btnInfo();
		
		

	}

}
