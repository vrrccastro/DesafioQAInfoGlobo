package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class UltimasNoticiasSteps {

	private WebDriver driver;

	@Dado("que estou acessando a funcionalidade")
	public void que_estou_acessando_a_funcionalidade() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vitor\\eclipse-workspace\\DesafioQAInfoGlobo\\target\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oglobo.globo.com/ultimas-noticias/");
	}

	@Quando("seleciono na combo {string}")
	public void seleciono_na_combo(String string) {
		driver.findElement(By.xpath("//div[@class='ultimas-noticias']")).click();
		;
		driver.findElement(By.xpath("//option[contains(text(),'" + string + "')]")).click();
		;
	}

	@Quando("seleciono {string}")
	public void seleciono(String string) {
		driver.findElement(By.xpath("//div[contains(@class,'tipo-conteudo')]")).click();
		;
		driver.findElement(By.xpath("//option[contains(text(),'" + string + "')]")).click();
		;
	}

	@Então("visualizo a página com determinado conteúdo")
	public void visualizo_a_página_com_determinado_conteúdo() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,850)", "");
	}

	@After(order = 1)
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getName() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 0)
	public void fecharBrowser() {
		driver.quit();
	}

}