package br.com.CieloAutomacaoExercicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class ValidacaoTextoComportamentoOnTheFly {

public static void main(String[] args) throws InterruptedException {
		
	    // Configurando servidor do selenium no contexto da aplicação
		System.setProperty("webdriver.gecko.driver", "C:\\app\\selenium\\geckodriver.exe");
		// Criando Webdriver do Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.eliasnogueira.com/arquivos_blog/selenium/desafio/6desafio/");
		//Buscando o elemento xml do campo usuario e digitando o usuario.//
		WebElement usuario = driver.findElement(By.xpath(".//*[@id='usuario']"));
		usuario.sendKeys("cintia");
		//Buscando o elemento xml do campo senha e digitando a senha.//
		WebElement senha = driver.findElement(By.xpath(".//*[@id='senha']"));
		senha.sendKeys("123");
		//Validações de senha para o login .//
		//A senha deve conter pelo menos uma letra, letra maiuscula, 1 numero e 8 caracteres.//
		senha.sendKeys("a");		
		Assert.assertEquals("valid", driver.findElement(By.id("letra")).getAttribute("class"));
		senha.sendKeys("C");
		Assert.assertEquals("valid", driver.findElement(By.id("maiuscula")).getAttribute("class"));
		senha.sendKeys("1");
		Assert.assertEquals("valid", driver.findElement(By.id("numero")).getAttribute("class"));
		senha.sendKeys("aE5@iw7y");
		Assert.assertEquals("valid", driver.findElement(By.id("tamanho")).getAttribute("class"));
		
	
}
}
