package br.com.CieloAutomacaoExercicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class AutomacaoAutoPreenchimentoDeCampos {

	
	public static void main(String[] args) throws InterruptedException {
		
		    // Configurando servidor do selenium no contexto da aplicação
			System.setProperty("webdriver.gecko.driver", "C:\\app\\selenium\\geckodriver.exe");
			
			// Criando Webdriver do Firefox
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/4desafio/");
			
			// Buscando o elemento xml do campo cep, clicando no campo e preenchendo com valor novo.//
			WebElement preenchercep = driver.findElement(By.xpath(".//*[@id='cep']"));
			preenchercep.click();
			preenchercep.sendKeys("01310200");
			
			// Tempo de parada por segundos após o preenchimento do campo cpf.//
			Thread.sleep(4000);
		    // Buscando o elemento vazio ao lado do campo cep para efetuar o clique, após isso o preenchimento dos demais campos é automatico.//
			WebElement clicar = driver.findElement(By.xpath(".//*[@id='wrap']/div[2]/form/div[1]/font"));
		    
			clicar.click();
			
			//Buscando o elemento xml do campo numero e efetuando o clique no campo, e o preenchimento.//
			WebElement preenchernumero = driver.findElement(By.xpath(".//*[@id='numero']"));
			
			preenchernumero.click();
			
			preenchernumero.sendKeys("1578");
			
			//Buscando o elemento xml do campo complemento efetuando clique e preenchimento do campo.//
			
			WebElement preenchercomplemento = driver.findElement(By.xpath(".//*[@id='complemento']")); 
			
			preenchercomplemento.click();
			
			preenchercomplemento.sendKeys("MASP");
			
			// Tempo de parada por segundos para efetuar a ação de clicar no botão "Limpar".//
            Thread.sleep(4000);
	          
	        // Buscando o elemento xml do botão "Limpar" e efetuando o clique no botão.//
	        WebElement limpar = driver.findElement(By.xpath(".//*[@id='wrap']/div[2]/form/input"));
	        limpar.click();
	        
			//Realizando a validação dos campos do cadastro preenchido.//
	        Assert.assertEquals("01310200",driver.findElement(By.xpath(".//*[@id='cep']")).getAttribute("value"));
	        Assert.assertEquals("MASP",driver.findElement(By.xpath(".//*[@id='complemento']")).getAttribute("value"));
	        Assert.assertEquals("1578",driver.findElement(By.xpath(".//*[@id='numero']")).getAttribute("value"));
	
	          
	     
	        
	    }
			
			
			
	}

		
	
	
	
	

