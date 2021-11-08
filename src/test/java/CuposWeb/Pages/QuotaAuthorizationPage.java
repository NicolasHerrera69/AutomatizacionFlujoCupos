package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.ListPages;
import CuposWeb.Steps.Questions;

public class QuotaAuthorizationPage {

	private ButtonPages buttonPages;
	private Questions questions;
	private ListPages listPages;

	@FindBy(how = How.ID, using = "ClientesListForm:datalist:j_idt30:filter")
	private WebElement btnFilterDoc;

	@FindBy(how = How.ID, using = "CuposListForm:fechavencimiento_input")
	private WebElement btnDateOff;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CuposListForm:limitetotal_input\"]")
	private WebElement btnLimit;

	public QuotaAuthorizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);

	}

	public void pendingAuthorizations(String doc, String dateOff, String limit) throws InterruptedException {

		btnFilterDoc.sendKeys(doc);
		questions.tiempoSegundos(1);
		buttonPages.btnPending();
		questions.tiempoSegundos(1);
		btnDateOff.sendKeys(dateOff);
		questions.tiempoSegundos(1);
		btnLimit.clear();
		

		btnLimit.sendKeys(limit);
		Thread.sleep(2000,200);

	}

}
