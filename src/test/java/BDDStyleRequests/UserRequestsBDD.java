package BDDStyleRequests;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UserRequestsBDD {

	
	private Map<String,Object> addemployee;
 	private Map<String,Object> alteremployee;
	
	public void AddEmployees() {
		
		addemployee = new LinkedHashMap<>();
		addemployee.put("id","RS24" );
		addemployee.put("name", "Sadam Hussain");
		addemployee.put("age" , 56);
		addemployee.put("place" , "Kabul");
	}
	
	public void AlterEmployee() {
		
		alteremployee = new LinkedHashMap<>();
		alteremployee.put("id", "RS08");
		alteremployee.put("name", "Marcus Jansen");
		alteremployee.put("age", 20);
		alteremployee.put("place", "Dhaka");
	}
	
	@Test  (enabled = false)
	public void GetAllEmployeesBDD() {
		
		RestAssured.given().baseUri("http://localhost:4000").when().get("/users").prettyPrint();
	}
	
	@Test
	public void GetAnEmployeeBDD() {
		
		RestAssured.with().baseUri("http://localhost:4000").when().get("/users/RS22").prettyPrint();
	}
	
	@Test (enabled = false)
	public void CreateEmployeeBDD() {
		
		AddEmployees();
		RestAssured.given().baseUri("http://localhost:4000").when().header("Content-Type" , "application/json")
			.body(addemployee).post("/users").prettyPrint();
		
	}
	
	@Test (enabled = false)
	public void UpdateEmployee() {
		
		AlterEmployee();
		RestAssured.given().baseUri("http://localhost:4000").when().header("Content-Type", "application/json")
		.body(alteremployee).put("/users/RS08").prettyPrint();
	
	}
	
	@Test (enabled = false)
	public void DeleteEmployee() {
		
		RestAssured.given().baseUri("http://localhost:4000").when().delete("/users/RS11").prettyPrint();
		
	}
	
}
