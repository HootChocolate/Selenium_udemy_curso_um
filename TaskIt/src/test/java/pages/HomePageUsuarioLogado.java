package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import suporte.BaseUtil;

public class HomePageUsuarioLogado extends BaseUtil{

	public HomePageUsuarioLogado(WebDriver navegador) {
		super(navegador);
	}

	public ClasseMe clicarClasseMeInformacoesDoUsuario() {
		
		navegador.findElement(By.className("me")).click();
		
		return new ClasseMe(navegador);
	}
	
}
