package CuposWeb.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import CuposWeb.Steps.ButtonPages;
import CuposWeb.Steps.Questions;

public class QuotaManagementPage {

	private ButtonPages buttonPages;
	private Questions questions;

	public  QuotaManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}
	
	public void quotaManagement() {
		questions.screenShot();
		buttonPages.btnManejoCupos();
		questions.screenShot();
	}
	
	public void creation() {
		questions.screenShot();
		buttonPages.btnCreacionCupos();
		questions.screenShot();
		
	}
	
	public void modification() {
		questions.screenShot();
		buttonPages.btnModificationQuota();
		questions.screenShot();
		
	}

}
