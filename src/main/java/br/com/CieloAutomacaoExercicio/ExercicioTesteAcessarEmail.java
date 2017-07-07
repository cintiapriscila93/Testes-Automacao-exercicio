
package br.com.CieloAutomacaoExercicio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExercicioTesteAcessarEmail {
	
public static <EventArgs> void main(String[] args) throws InterruptedException {
		
	    // Configurando servidor do selenium no contexto da aplicação
		System.setProperty("webdriver.gecko.driver", "C:\\app\\selenium\\geckodriver.exe");

		// Criando Webdriver do Firefox
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.microsoftonline.com/login.srf?wa=wsignin1.0&rpsnv=4&ct=1499374424&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.office365.com%2fowa%2f%3frealm%3dinmetrics.com.br%26vd%3dmail%26RpsCsrfState%3dc5097173-04ab-eaf9-7a29-fc6ee4639dcc&id=260563&whr=inmetrics.com.br&CBCXT=out&msafed=0&client-request-id=e5a8e039-8c8f-46ec-9703-28ee747fb3e7");
		WebElement cliquelogin = driver.findElement(By.xpath(".//*[@id='cred_userid_inputtext']"));
        cliquelogin.click();
	    cliquelogin.sendKeys("prigomes@inmetrics.com.br");
	    WebElement password = driver.findElement(By.xpath(".//*[@id='cred_password_inputtext']"));
        password.click();
        password.sendKeys("Testes25");
  
        WebElement signin = driver.findElement(By.xpath(".//*[@id='cred_sign_in_button']"));
        Thread.sleep(2000);
        signin.click();
        
        Thread.sleep(10000);
        WebElement novoemail = driver.findElement(By.xpath("//button[contains(.,'Novo')]"));
        novoemail.click();
        
        WebElement enviarpara = driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[5]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input"));
        enviarpara.sendKeys("rogcosta@inmetrics.com.br;marcos.oliveira@inmetrics.com.br;ozamana@inmetrics.com.br");
        
        WebElement mensagem = driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[5]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div"));
        
        mensagem.sendKeys("Boa tarde pessoal,\nEsse é um teste de automação,\nObrigada Cintia.");
        
        WebElement assunto = driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[5]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/input"));
        assunto.sendKeys("Automação para disparar e-mails");
        
        WebElement enviando = driver.findElement(By.xpath("//button[contains(.,'Enviar')]"));
        enviando.click();

       
}

}
