package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("^que o usuário acesse a url \"([^\"]*)\"$")
	public void que_o_usuário_acesse_a_url(String url) throws Throwable {
	    m.executarNavegador(url, "Abrindo navegador");
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
	    m.click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");
	}

	@Given("^selecionar o botao abrir sua conta no picpay$")
	public void selecionar_o_botao_abrir_sua_conta_no_picpay() throws Throwable {
		m.pausa(5000, "Pausa para carregar o botao abrir conta");
	   m.click(e.getBtnparavoce(), "Selecionando botao abrir sua conta no picpay");
	}

	@Given("^selecionaer o botao abrir conta picpay$")
	public void selecionaer_o_botao_abrir_conta_picpay() throws Throwable {
	    m.click(e.getBtnabrirpicpay(), "Selecionar o botao abrir conta picpay");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
	    m.preencher(e.getCamponome(), "Flash Code", "Preenchendo o campo nome");
	    m.preencher(e.getCampocpf(), "39152300064", "Preenchendo o campo cpf");
	    m.preencher(e.getCampoemail(), "semidentidade12@gmail.com", "Preenchendo o campo email");
	    m.preencher(e.getCampocelular(), "12131416171", "Preenchendo o campo celular");
	    
	    
	}

	@When("^selecionar o checkbox$")
	public void selecionar_o_checkbox() throws Throwable {
		 m.click(e.getCheckbox(), "Selecionando o checkbox");
	}

	@When("^selecionar o botao enviar$")
	public void selecionar_o_botao_enviar() throws Throwable {
		m.click(e.getBtnenviar(), "Selecionando o botão enviar");
	}

	@Then("^valido o texto baixe o app e finalize seu cadastro$")
	public void valido_o_texto_baixe_o_app_e_finalize_seu_cadastro() throws Throwable {
	   
	}
	
}
