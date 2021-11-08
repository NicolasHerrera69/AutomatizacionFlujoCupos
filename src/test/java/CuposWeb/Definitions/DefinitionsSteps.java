package CuposWeb.Definitions;

import org.openqa.selenium.WebDriver;
import CuposWeb.Pages.ConsultClientsPage;
import CuposWeb.Pages.CreateClientsPage;
import CuposWeb.Pages.CreationOfQuotasPage;
import CuposWeb.Pages.QuotaManagementPage;
import CuposWeb.Pages.QuotaModificationPage;
import CuposWeb.Pages.EditClientsPage;
import CuposWeb.Pages.LoginPage;
import CuposWeb.Pages.OperativaPage;
import CuposWeb.Pages.QuotaAuthorizationPage;
import CuposWeb.Pages.QuotaConsultationPage;
import CuposWeb.Pages.RemoveClientsPage;
import CuposWeb.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private OperativaPage operativaPage = new OperativaPage(driver);
	private ConsultClientsPage consultClientsPage = new ConsultClientsPage(driver);
	private RemoveClientsPage removeClientsPage = new RemoveClientsPage(driver);
	private CreateClientsPage createClientsPage = new CreateClientsPage(driver);
	private EditClientsPage editClientsPage = new EditClientsPage(driver);
	private QuotaManagementPage quotaManagementPage = new QuotaManagementPage(driver);
	private CreationOfQuotasPage creationOfQuotasPage = new CreationOfQuotasPage(driver);
	private QuotaModificationPage quotaModificationPage = new QuotaModificationPage(driver);
	private QuotaAuthorizationPage quotaAuthorizationPage = new QuotaAuthorizationPage(driver);
	private QuotaConsultationPage quotaConsultationPage = new QuotaConsultationPage(driver);

	// AbrirNavegador
	@Given("^Abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	// Login
	@And("^Diligenciar usuario (.*) y contraseña (.*)$")
	public void loginIn(String userName, String password) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.loginIn(userName, password);

	}

	// IngresoAFlujoOperativaCliente
	@And("^Al llegar a el flujo de Operativa-Clientes$")
	public void optionCreation() {
		this.operativaPage = new OperativaPage(driver);
		this.operativaPage.optionClientes();
	}

	// IngresoACreacionCliente
	@And("^Al llegar al fomulario de creacion de cliente y dar click en crear$")
	public void optionClientes() {
		this.operativaPage = new OperativaPage(driver);
		this.operativaPage.optionClientes();
		this.operativaPage.optionCreation();
	}

	// MetodoConsultaCliente
	@When("^Ingrese el numero de identificacion a consultar (.*) ,de click en el boton de Consultar y en el de cerrar$")
	public void consult(String FilterDoc) {
		this.consultClientsPage = new ConsultClientsPage(driver);
		this.consultClientsPage.consult(FilterDoc);

	}

	// MetodoEliminarCliente
	@When("^Ingrese el numero de identificacion a consultar (.*) y de click en el boton de Eliminar$")
	public void remove(String FilterIds) {
		this.removeClientsPage = new RemoveClientsPage(driver);
		this.removeClientsPage.remove(FilterIds);
	}

	// MetodoEditarCliente
	@When("^Ingrese el numero de identificacion a editar (.*) ,click en el boton editar, agregamos el nuevo nombre (.*), el nuevo rating (.*) y ventas (.*)$")
	public void edit(String FilterDoc, String NewName, String rating, String ventas) {
		this.editClientsPage = new EditClientsPage(driver);
		this.editClientsPage.edit(FilterDoc, NewName, rating, ventas);
	}

	// MetodoCrearClienteParte1
	@When("^Seleccione tipo de documento (.*) ,diligenciar el numero de documento (.*) (.*) , y nombre (.*) , y fecha (.*)$")
	public void basicInformationFirstPart(String documents, String documentNum, String digit, String name,
			String date) {
		this.createClientsPage = new CreateClientsPage(driver);
		this.createClientsPage.basicInformationFirstPart(documents, documentNum, digit, name, date);
	}

	// MetodoCrearClienteParte2
	@And("^Seleccione el grupo (.*) ,la banca local (.*) , el Subsegmento (.*) , y el gestor(.*)$")
	public void basicInformationSecondPart(String groups, String banks, String SubSeg, String Gestor) {
		this.createClientsPage = new CreateClientsPage(driver);
		this.createClientsPage.basicInformationSecondPart(groups, banks, SubSeg, Gestor);
	}

	// MetodoCrearClienteParteFinanciera
	@And("^Ingresar cifra del rating (.*) , el valor activo (.*) , y el valor de ventas (.*)$")
	public void financialInformation(String rating, String activo, String ventas) {
		this.createClientsPage = new CreateClientsPage(driver);
		this.createClientsPage.financialInformation(rating, activo, ventas);
	}

	// MetodoCrearDatosAdicionales
	@And("^Se selecciona el rol jerarquico (.*) , Se agrega el porcentaje de participacion (.*) y numero de empleados (.*)$")
	public void additionalData(String roles, String porcentaje, String numeroE) {
		this.createClientsPage = new CreateClientsPage(driver);
		this.createClientsPage.additionalData(roles, porcentaje, numeroE);
	}

	// IngresoAFlujoManejo de cupos
	@And("^Ingresar al flujo de Manejo de cupos - Creacion de cupos$")
	public void quotaManagement() {
		this.quotaManagementPage = new QuotaManagementPage(driver);
		this.quotaManagementPage.quotaManagement();
		this.quotaManagementPage.creation();

	}

	// Ingreso de datos para creacion de cupo Parte 1
	@And("^Ingresamos el numero de documento (.*) ,la fecha del alta (.*) , fecha de vencimiento (.*)$")
	public void clientData(String numbDoc, String dateOn, String dateOff) {
		this.creationOfQuotasPage = new CreationOfQuotasPage(driver);
		this.creationOfQuotasPage.clientData(numbDoc, dateOn, dateOff);
	}

	// Ingreso de datos para creacion de cupo Parte 1
	@And("^Ingresamos el valor limite (.*) , y valor prueba (.*)$")
	public void clientData(String limit,String prueba) throws InterruptedException {
		this.creationOfQuotasPage = new CreationOfQuotasPage(driver);
		this.creationOfQuotasPage.clientDataTwo(limit, prueba);
	}

	// @And("^Ingresamos el valor sublime autorizado a la modalidad escogida (.*)$")
	// public void asignationList(String mod ) {
	// this.creationOfQuotasPage = new CreationOfQuotasPage(driver);
	// this.creationOfQuotasPage.asignationList(mod);
	// }

	// Ingreso a modificacion de cupos
	@And("^Ingresar al flujo de Manejo de cupos - Modificacion de cupos$")
	public void quotaModification() {
		this.quotaManagementPage = new QuotaManagementPage(driver);
		this.quotaManagementPage.quotaManagement();
		this.quotaManagementPage.modification();

	}
	
	//Datos a modificar
		@And("^Ingresamos numero de documento (.*) ingresamos el nuevo limite total (.*)$")
		public void Master(String id, String date) {
			this.quotaModificationPage = new QuotaModificationPage(driver);
			this.quotaModificationPage.Master(id, date);
		}

	// Ingreso al flujo autorizar Cupos
	@And("^Ingresar al flujo de Autoriza cupos$")
	public void quotaAuthorization() {
		this.quotaManagementPage = new QuotaManagementPage(driver);
		this.quotaManagementPage.quotaManagement();
		this.quotaManagementPage.authorization();
	}

	// Busqueda de cupo por autorizar
	@And("^Ingresamos el documento con el cupo a autorizar (.*) , fecha de vencimiento (.*) , y valor total (.*)$")
	public void pendingAuthorizations(String doc, String dateOff, String limit) throws InterruptedException {
		this.quotaAuthorizationPage = new QuotaAuthorizationPage(driver);
		this.quotaAuthorizationPage.pendingAuthorizations(doc, dateOff, limit);

	}
	

	// Ingreso al flujo consulta de cupos
	@And("^Ingresar al flujo de consulta de cupos$")
	public void query() {
		this.quotaManagementPage = new QuotaManagementPage(driver);
		this.quotaManagementPage.quotaManagement();
		this.quotaManagementPage.query();
	}

	// Ingreso de documento a consultar
	@And("^Ingresamos el numero de identificacion  (.*)$" )
	public void queryId(String id) {
		this.quotaConsultationPage = new QuotaConsultationPage(driver);
		this.quotaConsultationPage.queryId(id);
	}
}