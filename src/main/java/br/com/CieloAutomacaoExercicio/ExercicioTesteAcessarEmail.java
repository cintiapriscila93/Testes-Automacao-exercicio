
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
		// Encontrando o elemento xml do campo e-mail e preenchendo com o endereço de e-mail.//
		WebElement cliquelogin = driver.findElement(By.xpath(".//*[@id='cred_userid_inputtext']"));
        cliquelogin.click();
	    cliquelogin.sendKeys("prigomes@inmetrics.com.br");
	    //Encontrando o elemento xml do campo senha e digitando a senha.//
	    WebElement password = driver.findElement(By.xpath(".//*[@id='cred_password_inputtext']"));
        password.click();
        password.sendKeys("Testes25");
        // Encontrando o elemento do botão signin para efetuar o clique.//
        WebElement signin = driver.findElement(By.xpath(".//*[@id='cred_sign_in_button']"));
        // Espera de 20000 milliseconds para efetuar o evento de click e a resposta do carregamento da página.//
        Thread.sleep(2000);
        signin.click();
        //Espera de 10000 milliseconds para encontrar o elemento do botão novo email e efetuar o clique.//
        Thread.sleep(10000);
        WebElement novoemail = driver.findElement(By.xpath("//button[contains(.,'Novo')]"));
        novoemail.click();
        // Encontrar o elemento do campo para e digitar esses os e-mails de destino.//
        WebElement enviarpara = driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[5]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/div[1]/form/input"));
        enviarpara.sendKeys("rogcosta@inmetrics.com.br;marcos.oliveira@inmetrics.com.br;ozamana@inmetrics.com.br");
        // Encontrar o elemento do campo de texto e digitar a mensagem.//
        WebElement mensagem = driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[5]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div[1]/div[3]/div"));
        mensagem.sendKeys("Boa tarde pessoal,\nEsse é um teste de automação,\nObrigada Cintia.");
        // Encontrar o elemento do campo assunto do e-mail e digitar o assunto.//
        WebElement assunto = driver.findElement(By.xpath(".//*[@id='primaryContainer']/div[5]/div/div[1]/div/div[5]/div[3]/div/div[5]/div[1]/div/div[3]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/input"));
        assunto.sendKeys("Automação para disparar e-mails");
        // Encontrar o elemento do botão Enviar pelo nome do botão e efetuar o clique.//
        WebElement enviando = driver.findElement(By.xpath("//button[contains(.,'Enviar')]"));
        enviando.click();

       
}

}
