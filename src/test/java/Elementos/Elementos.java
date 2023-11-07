package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnparavoce = By.id("bt1");
	private By btnabrirpicpay = By.cssSelector(
			"#__next > div > main > div.sc-lf7zbt-0.jWzQdL > div > div.sc-rsc2zo-0.gjQLiM > button > div > div");
	private By camponome = By.id("Nome");
	private By campocpf = By.id("CPF");
	private By campoemail = By.id("E-mail");
	private By campocelular = By.id("Celular");
	private By checkbox = By.id("terms");

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnparavoce() {
		return btnparavoce;
	}

	public By getBtnabrirpicpay() {
		return btnabrirpicpay;
	}

	public By getCamponome() {
		return camponome;
	}

	public By getCampocpf() {
		return campocpf;
	}

	public By getCampoemail() {
		return campoemail;
	}

	public By getCampocelular() {
		return campocelular;
	}

	public By getCheckbox() {
		return checkbox;
	}

	public By getBtnenviar() {
		return btnenviar;
	}

	public By getTextobaixeoappefinalizeseucadastro() {
		return textobaixeoappefinalizeseucadastro;
	}

	private By btnenviar = By.cssSelector("#radix-0 > div.sc-1xfxss8-0.gUOFli > button.sc-12j2mds-1.xkEwc > div > div");
	private By textobaixeoappefinalizeseucadastro = By
			.cssSelector("#radix-0 > div.sc-a6570t-0.izirIZ.sc-8gwwnp-0.fMIaEN > span.sc-1nn9vzw-0.QPfLm");

}
