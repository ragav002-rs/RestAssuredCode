	package Authorization;
	
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class BasicAuth5000 {
			
		RequestSpecification rs;
		
		@BeforeMethod
		public void BasicAuthorization() {
			
			rs = RestAssured.given().baseUri("http://localhost:5000").basePath("/users")
			.header("Authorization", "Basic cmFnYXY6MTIzNA==");
			
			RestAssured.requestSpecification = rs;
		}
		
		@Test
		public void requestspec() {
			
			Response employee = RestAssured.given().auth().basic("ragav", "1234").log().all().get("/RS04");
			
			System.out.println(employee.asPrettyString());
			employee.then().statusCode(200);
		}
	}
		
