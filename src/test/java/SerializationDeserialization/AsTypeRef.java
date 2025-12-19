package SerializationDeserialization;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class AsTypeRef {

	@Test
	public void AsTypeRefList() {
		
		List<Map<String,Object>> response = RestAssured.given().baseUri("http://localhost:4000")
			.when().get("/users").then().extract().body().as(new TypeRef <List<Map<String, Object>>>() {	
		});
		
			System.out.println(response);
			System.out.println(response.get(5).get("age"));
	}
	
	@Test
	public void AsTypeRefMap() {
		
		Map<String, Object> response = RestAssured.given().baseUri("http://localhost:4000")
			.when().get("/users/RS06").then().extract().body().as(new TypeRef <Map<String, Object>>() {
		});
		
		
		System.out.println(response);
		System.out.println(response.get("age"));
	}
	
	
	
	
	
	
	
	
	
	
	
}
