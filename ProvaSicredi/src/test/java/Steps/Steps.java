package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	

	@Given("que acesse a url {string}")
	public void que_acesse_a_url(String url) throws IOException {
		m.executarNavegador(url, "CHROME", "Abrindo navegador");
	}

	@Given("selecione a opcao AddRecord")
	public void selecione_a_opcao_add_record() throws IOException, InterruptedException {
		m.pauser(2000, "Pausa");
		m.clicar(e.getBtnAddRecord(), "Selecionando botao add records");
	}

	@Given("preencha o formulario com o nome {string}")
	public void preencha_o_formulario_com_o_nome(String name) throws IOException, InterruptedException {
		m.pauser(2000, "Pausa");
		m.preencher(e.getCustomerName(), name, "Preenchendo customer name");

	}

	@Given("preencha o last name {string}")
	public void preencha_o_last_name(String lastname) throws IOException {
		m.preencher(e.getFirstName(), lastname, " Preenchendo campo last name");
	}

	@Given("preencha o contactFirstname {string}")
	public void preencha_o_contact_firstname(String fistname) throws IOException {
		m.preencher(e.getFirstName(), fistname, "Preenchendo campo first name");
	}

	@Given("preencha o phone {string}")
	public void preencha_o_phone(String telefone) throws IOException {
		m.preencher(e.getPhone(), telefone, "Preenchendo campo telefone");
	}

	@Given("preencha o AddressLine1  {string}")
	public void preencha_o_address_line1(String endereco1) throws IOException {
		m.preencher(e.getAndressLine1(), endereco1, "Preenchendo endereco 1");
	}

	@Given("preencha o AddressLine2 {string}")
	public void preencha_o_address_line2(String endereco2) throws IOException {
		m.preencher(e.getAndressLine2(), endereco2, "Preenchendo endereco2");
	}

	@Given("preencha o City {string}")
	public void preencha_o_city(String cidade) throws IOException {
		m.preencher(e.getCity(), cidade, "Preenchendo cidade");
	}

	@Given("preencha o State {string}")
	public void preencha_o_state(String estado) throws IOException {
		m.preencher(e.getState(), estado, "Preenchendo estado ");
	}

	@Given("preencha o PostalCode {string}")
	public void preencha_o_postal_code(String cep) throws IOException {
		m.preencher(e.getPostalCode(), cep, "Preenchendo cep");
	}

	@Given("preencha o Country {string}")
	public void preencha_o_country(String pais) throws IOException {
		m.preencher(e.getCountry(), pais, "Preenchendo pais");
	}

	@Given("preencha o from Employeer {string}")
	public void preencha_o_from_employeer(String string) throws IOException {
		m.preencher(e.getSalesRepEmployeeNumber(), string, "Preenchedo campo sales");
	}

	@Given("preencha o CreditLimit {string}")
	public void preencha_o_credit_limit(String string) throws IOException {
		m.preencher(e.getCreditLimite(), string, "Preenchendo campo credit limit");
	}

	@When("clicar no botao save")
	public void clicar_no_botao_save() throws IOException, InterruptedException {
		m.pauser(2000, "Pausa");
		m.clicar(e.getBtnSave(), "Clicando botao salvar");
	}

	@Then("realizo validacao da mensagem {string}")
	public void realizo_validacao_da_mensagem(String string) throws IOException, InterruptedException {
		String Evidencia = "Validação";
		m.pauser(2000, "Pausa");
		m.validarTexto(e.getFraseValidacao(), string, "Validando texto");
		m.pauser(5000, "Pausa");
		m.screnShoot("./Evidencia/" + Evidencia + ".png");
		m.fecharBrowser("Fechando navegador");
	}
}
