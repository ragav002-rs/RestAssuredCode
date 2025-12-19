package requestspecification;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RequestSpecifications {

	RequestSpecification rs;
	RequestSpecification createRS;
	Map<String,Object> user;
	
	@BeforeMethod
	public void requestspecification() {
		
		rs = RestAssured.given().baseUri("http://localhost:4000").basePath("/users");
		createRS = RestAssured.given().baseUri("http://localhost:4000").basePath("/users");
		RestAssured.requestSpecification = rs;
		RestAssured.requestSpecification = createRS;
	}
	
	@BeforeMethod
	public void EmployeeData() {
		
		user = new LinkedHashMap<String,Object>();
		
		user.put("id", "RS21");
		user.put("name", "Peter Parker");
		user.put("age", 14);
		user.put("place", "St Antigua");	
	}
	
	@Test 
	public void getAnEmployee() {
		
		Response EmployeeRS04 = RestAssured.given().when().get("/RS04");
		
		System.out.println(EmployeeRS04.asPrettyString());
	}
	
	@Test (enabled = false)
	public void GetAllEmployees() {
		
		Response AllEmployee = RestAssured.given().get();
		
		System.out.println(AllEmployee.asPrettyString());
	}
	
	@Test (enabled = false)
	public void CreateEmployee() {
		
	Response createEmp =  RestAssured.given().contentType(ContentType.JSON).baseUri("http://localhost:4000")
		.basePath("/users").body(user).post();
	 
	System.out.println(createEmp.asPrettyString());
	 
	}
	
	@Test (enabled = false)
	public void DeleteEmployee() {
		
		Response deleteemp = RestAssured.given().delete("/RS24");
		
		System.out.println(deleteemp.asPrettyString());	
	}
	
	@Test(enabled = false)
	public void UpdateEmployee() {
		
		Response UpdateEmp = RestAssured.given().contentType(ContentType.JSON).baseUri("http://localhost:4000")
		.basePath("/users").body(user).put("/RS21");
		
		System.out.println(UpdateEmp.asPrettyString());
	}
	
	
}
