package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.BaseUtil;

public class LoginPage extends BaseUtil{

	public LoginPage(WebDriver navegador) {
		super(navegador);
	}
	
	/**
	 * Clica no botão de login na barra de navegação superior e devolve um FormLoginPage
	 * 
	 * @author jay
	 * @return FormLoginPage
	 */
	public FormLoginPage cliqueSignInBarraNavegacao() {
		navegador.findElement(By.xpath("//div[@class=\"nav-wrapper\"]//a[@data-target=\"signinbox\"]")).click();
		
		return new FormLoginPage(navegador);
	}
}
