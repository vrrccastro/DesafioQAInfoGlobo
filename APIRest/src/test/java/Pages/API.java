package Pages;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

public class API {

	public static void ApiValidation(String url) {
		given()
			.relaxedHTTPSValidation()
		.when()
			.get(url)
		.then()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.body("id", contains("AT", "CJ", "CV", "CF", "EP", "EN", "GC", "GL", "GR", "GQ", "MC", "PE", "VG"));
	}
	
}