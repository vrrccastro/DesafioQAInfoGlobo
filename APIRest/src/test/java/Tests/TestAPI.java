package Tests;
import org.junit.Test;

public class TestAPI {

	String url = "http://assineglobo.com.br/services/rest/products/";
	
	@Test
	public void Teste() {
		Pages.API.ApiValidation(url);
	}
	
}
