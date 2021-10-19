package CuposWeb.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPages {

	private WebDriver driver;

	public ListPages(WebDriver driver) {
		this.driver = driver;
	}

	public void documentType(String documents) {

		WebElement document = driver.findElement(By.xpath("//div//ul//li[text()='" + documents + "']"));
		document.click();
	}

	public void group(String groups) {
		WebElement group = driver.findElement(By.xpath("//div//ul//li[text()='" + groups + "']"));
		group.click();

	}

	public void localBank(String banks) {
		WebElement bank = driver.findElement(By.xpath("//div//ul//li[text()='" + banks + "']"));
		bank.click();

	}

	public void clas(String clasi) {
		WebElement clas = driver.findElement(By.xpath("//div//ul//li[@data-label='" + clasi+  "']"));
		clas.click();

	}
	
	public void SubSegmento(String SubSeg) {
		WebElement Sub = driver.findElement(By.xpath("//div//ul//li[@data-label='"+ SubSeg +"']"));
		Sub.click();

	}
	
	public void GestorComercial(String Gestor ) {
		WebElement Ges = driver.findElement(By.xpath("//div//ul//li[@data-label='"+ Gestor +"']"));
		Ges.click();

	}
	
	public void Rol(String roles ) {
		WebElement rol = driver.findElement(By.xpath("//div//ul//li[@data-label='"+ roles +"']"));
		rol.click();

	}
	
	public void coinList(String coinList ) {
		WebElement listsCoin = driver.findElement(By.xpath("//div//ul//li[@data-label='"+ coinList +"']"));
		listsCoin.click();

	}
	
	
}
