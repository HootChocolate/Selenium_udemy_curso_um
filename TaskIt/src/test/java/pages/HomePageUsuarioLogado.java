package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import suporte.BaseUtil;

public class HomePageUsuarioLogado extends BaseUtil{

	public HomePageUsuarioLogado(WebDriver navegador) {
		super(navegador);
	}

	public ClasseMe clicarClasseMeInformacoesDoUsuario() {
		
		WebElement el = navegador.findElement(By.className("me"));
		
		new WebDriverWait(navegador, 10).until(ExpectedConditions.elementToBeClickable(el));
		el.click();
		
		return new ClasseMe(navegador);
	}
	
}
