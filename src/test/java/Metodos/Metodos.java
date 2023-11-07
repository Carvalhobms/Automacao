package Metodos;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Metodos {

	public static WebDriver driver;

	public void screnShot(String print) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srFile = scrShot.getScreenshotAs(OutputType.FILE);
		File Desfile = new File(print);
		FileUtils.copyFile(srFile, srFile);

	}

	public void pausa(int tempo, String descricaopasso) throws InterruptedException {
		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaopasso);
		}

	}

	public void preencher(By elememento, String texto, String descricaoPasso) throws IOException {

		try {
			driver.findElement(elememento).sendKeys(texto);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaoPasso);
			screnShot(descricaoPasso);
		}

	}

	public void click(By elemento, String descricaopasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaopasso);
			screnShot(descricaopasso);
		}

	}
	public void fecharNavegador(String descricaopasso) throws IOException {
		try {
			driver.quit();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaopasso);
			screnShot(descricaopasso);
		}
		
	}
	public void executarNavegador(String url,  String descricaopasso) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
}
