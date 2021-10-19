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

	//@FindBy(how = How.ID, using = "CuposListForm:nit_input")
	//private WebElement btnNumbId;

	public QuotaModificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);

	}

	

}
