package br.com.CieloAutomacaoExercicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class IDsDinamicos {

public static void main(String[] args) throws InterruptedException {
		
	    // Configurando servidor do selenium no contexto da aplicação
		System.setProperty("webdriver.gecko.driver", "C:\\app\\selenium\\geckodriver.exe");

		// Criando Webdriver do Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.eliasnogueira.com/arquivos_blog/selenium/desafio/5desafio/");
	   // Buscando os elementos que possui id xml dinamicos com o mesmo id, pelo nome do campo, digitando os valores e enviando.//
		driver.findElement(By.xpath("//label[text() = 'Username']/following-sibling::div/input")).sendKeys("cintia");
		driver.findElement(By.xpath("//label[text() = 'Username (repetir)']/following-sibling::div/input")).sendKeys("cintia1");
		driver.findElement(By.xpath("//label[text() = 'Password']/following-sibling::div/input")).sendKeys("12345");
		driver.findElement(By.xpath("//label[text() = 'Password (repetir)']/following-sibling::div/input")).sendKeys("12345");
		
		driver.findElement(By.id("submitBtn2")).click();
		
		/*
		 * Validar o resultado por não ter preenchido o campo username igual
		 */
		Assert.assertEquals("Os campos não tem o mesmo valor!", driver.findElement(By.id("submitBtn2")).getText());

	   
	    
}

}

