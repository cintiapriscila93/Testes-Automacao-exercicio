package br.com.CieloAutomacaoExercicio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;

public class ExercicioEdicaoInline {
	
	public static void main(String[] args) throws InterruptedException {
		
	    // Configurando servidor do selenium no contexto da aplicação
		System.setProperty("webdriver.gecko.driver", "C:\\app\\selenium\\geckodriver.exe");

		// Criando Webdriver do Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/2desafio/");
		
		// Buscando o campo nome pelo ID xml do elemento do campo.//
		
	    WebElement nome = driver.findElement(By.xpath(".//*[@id='name_rg_display_section']"));
	     
	    // Clicando no campo encontrado.//
	    nome.click();
	    
	    // Buscando o campo de edição do campo nome.//
	    WebElement Editar = driver.findElement(By.xpath("//*[@id='nome_pessoa']"));
	    
	    // Apagando o nome que já esta salvo no campo nome.//
	    Editar.clear();
	    
	    // Escrevendo no campo nome um novo nome.//
	    Editar.sendKeys("Cintia Priscila");
	    
	    // Salvando a alteração efetuada.//
	    WebElement Salvar = driver.findElement(By.xpath(".//*[@id='name_hv_editing_section']/input[2]"));
	    
	    // Clicando no botão salvar.// 
		Salvar.click();
		
		Thread.sleep(3000);
		
		// Buscando o campo email pelo id xml do campo e cliando no campo.//
		WebElement email = driver.findElement(By.xpath(".//*[@id='email_rg_display_section']"));
	
		email.click();
		
		// Buscando o campo de edição do campo email e clicando no campo.//
		WebElement editaremail = driver.findElement(By.xpath(".//*[@id='email_value']"));
		
		editaremail.click();
		
		// Apagando informação já salva.//
		editaremail.clear();
		
		// Escrevendo no campo email um novo email.//
		editaremail.sendKeys("cintia.priscila47@gmail.com");
		
		// Bucando o botão salvar pelo id xml.//
		WebElement salvaremail = driver.findElement(By.xpath(".//*[@id='email_hv_editing_section']/input[2]"));
		
		// Clicando no botão salvar.//
		salvaremail.click();
		
		Thread.sleep(3000);
		
		// Buscando o campo telefone pelo id do elemento xml.//
		WebElement phone = driver.findElement(By.xpath(".//*[@id='phone_rg_display_section']"));
		
		phone.click();
		// Buscando o campo de edição do campo telefone e clicando no campo.//
		WebElement editarphone = driver.findElement(By.xpath(".//*[@id='phone_value']"));
		
		editarphone.click();
		
		// Apagando as informações já salvas.//
		editarphone.clear();
		
		// Escrevendo no campo novo telefone.//
		editarphone.sendKeys("1199324-5678");
		
		// Buscando o botão salvar pelo id xml.//
		WebElement salvarphone = driver.findElement(By.xpath(".//*[@id='phone_hv_editing_section']/input[2]"));
		
		// Clicando no botão salvar.//
		salvarphone.click();
		
		Thread.sleep(3000);
		
		// Validando se o campo contém a informação correta de texto//.
	    Assert.assertEquals("Cintia Priscila",driver.findElement(By.xpath("//*[@id='nome_pessoa']")).getText());
	
	}
		
	}
	
	
	
	
	
	
	
	
	


