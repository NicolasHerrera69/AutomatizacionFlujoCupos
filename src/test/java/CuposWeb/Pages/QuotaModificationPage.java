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

public class QuotaModificationPage {

	private ButtonPages buttonPages;
	private Questions questions;
	private ListPages listPages;

	@FindBy(how = How.ID, using = "CuposListForm:nit_input")
	private WebElement btnNumbId;

	@FindBy(how = How.ID, using = "CuposListForm:datalist:4:j_idt76_input")
	private WebElement btnLimit;
	
	@FindBy(how = How.ID, using = "CuposListForm:fechavencimiento_input")
	private WebElement btnDateOff;

	public QuotaModificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);

	}

	public void Master(String id, String date) {

		btnNumbId.sendKeys(id);
		questions.tiempoSegundos(1);
		btnNumbId.sendKeys(Keys.ENTER);
		questions.tiempoSegundos(2);
		questions.tiempoSegundos(1);
		btnDateOff.clear();
		questions.tiempoSegundos(1);
;
		btnDateOff.sendKeys(date);
	}

}
