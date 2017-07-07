package br.com.CieloAutomacaoExercicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class AutomacaoSomaAleatoria {

public static void main(String[] args) throws InterruptedException {

	// Configurando servidor do Selenium no contexto da aplicação
	System.setProperty("webdriver.gecko.driver", "C:\\app\\selenium\\geckodriver.exe");

	// Criando Webdriver do Firefox
	WebDriver driver = new FirefoxDriver();
	driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/1desafio/");
	
   //Buscando o elemento number1 e number2, que representa os numeros decimais que serão somandos.//
	String numero1 = driver.findElement(By.id("number1")).getText();
	String numero2 = driver.findElement(By.id("number2")).getText();
	
	//Buscando os elementos soma e submit que representa os campos de realização da soma dos valores decimais e exibição de resultado.// 
	int resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
	driver.findElement(By.name("soma")).sendKeys(String.valueOf(resultado));
	driver.findElement(By.name("submit")).click();
	
	//Realizando a verificação da mensagem do resultado.//
	Assert.assertEquals("CORRETO", driver.findElement(By.id("resultado")).getText());
}
}
