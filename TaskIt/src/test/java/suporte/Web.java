package suporte;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Web {
	
	// Configuracao BrowserStack para testes na nuvem
	public static final String USERNAME = "willianronaldo1";
	public static final String AUTOMATE_KEY = "VdqMDmy3qyzfxQdsYdif";
	public static final String URLBrowserStack = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	/**Configura o ChromeDriver, adiciona opções e devolve uma instância de navegador para testes locais
	 * 
	 * @author jay
	 * @param site
	 * @return WebDriver
	 */
	public static WebDriver createChrome(String site) {
		
		System.setProperty("webdriver.chrome.driver", "/home/jay/programs/ChromeDriver/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-web-security"); // Desabilita CORS
		
		WebDriver navegador = new ChromeDriver(options);

		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.get(site);

		return navegador;
	}
	
	/**Método para execução de testes remotos, utilizando o servidor BrowserStack.
	 * 
	 * @author jay
	 * @return
	 * @date 07/07/2020
	 */
	public static WebDriver createRemoteWebDriver(String website) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setBrowserName("Chrome");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "71");
		caps.setCapability("name", "Teste Julio de Lima, TaskIt.");

		WebDriver navegador = null;
		
		try { 
			
			navegador = new RemoteWebDriver(new java.net.URL(URLBrowserStack), caps);
			navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			navegador.get(website);
			
		} catch (MalformedURLException e) {
			System.out.println("[ERRO] Ao acessar URL de testes do BrowserStack.\n" + e.getMessage());
		}
		return navegador;
	}
	
}
