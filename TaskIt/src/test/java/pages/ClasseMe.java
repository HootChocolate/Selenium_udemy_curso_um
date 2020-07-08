package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import suporte.BaseUtil;

/**Informções que estão disponíveis ao clicar na Aba do usuário, da classe "me"
 * 
 * @author jay
 */
public class ClasseMe extends BaseUtil{

	public ClasseMe(WebDriver navegador) {
		super(navegador);
	}

	public MoreDataAboutYou clicarNaAbaMoreDataAboutYou() {
		
		WebElement abaMoreData = navegador.findElement(By.xpath("//a[@href=\"#moredata\"]"));
		
		new WebDriverWait(navegador, 5).until(ExpectedConditions.elementToBeClickable(abaMoreData));
		abaMoreData.click();
		
		return new MoreDataAboutYou(navegador);
	}
	
	public ClasseMe alterarNomeDoUsuario(String novoNome) {
		
		WebElement formAboutYouName = navegador.findElement(By.id("aboutyou")).findElement(By.name("name"));
		formAboutYouName.clear();
		formAboutYouName.sendKeys(novoNome);
		
		return this;
	}
	
	public ClasseMe clicarBotaoChangeMyName() {
		
		navegador.findElement(By.id("changeAboutYou")).click();
		
		return this;
	}
	
}
