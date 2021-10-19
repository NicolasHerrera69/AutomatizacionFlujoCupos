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
	
	@FindBy(how = How.ID, using = "CuposListForm:nit_input")
	private WebElement btnNumbDoc;

	@FindBy(how = How.ID, using = "CuposListForm:fechaalta_input")
	private WebElement btnDateOn;

	@FindBy(how = How.ID, using = "CuposListForm:fechavencimiento_input")
	private WebElement btnDateOff;

	@FindBy(how = How.ID, using = "CuposListForm:limitetotal_input")
	private WebElement btnLimit;

	public QuotaAuthorizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);

	}

}
