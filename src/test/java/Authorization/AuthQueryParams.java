package Authorization;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthQueryParams {

	RequestSpecification rs;
	
	@BeforeMethod
	public void QueryParams() {
		
		rs = RestAssured.given().baseUri("http://localhost:4000").basePath("/users")
				.header("Apikey", "4T5G6OAUNroGJ2T5E6BieVWRvFidj7Fz");
		
		RestAssured.requestSpecification = rs;	
	}
	
	@Test
	public void QueryParameter() {
		
		Response currency = RestAssured.given().queryParam("source", "USD").queryParam("currencies", "JPY")
				.log().all().get("https://api.apilayer.com/currency_data/live");
		
		System.out.println(currency.asPrettyString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
