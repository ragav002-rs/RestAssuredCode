package NonBDDStyleRequests;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeRequests {


	private Map<String,Object> employeedata;
	private Map<String,Object> updatedemp;

	private void EmployeeAdd() {

		employeedata = new LinkedHashMap<>();
		employeedata.put("id", "RS23");
		employeedata.put("name", "Jasprit Bumrah");
		employeedata.put("age", 33);
		employeedata.put("place", "Mumbai");	
	}

	private void EmployeeUpdate() {

		updatedemp = new LinkedHashMap<>();
		updatedemp.put("id", "RS06");
		updatedemp.put("name", "Steven Smith");
		updatedemp.put("age", 22);
		updatedemp.put("place", "Colombo");

	}

	@Test(enabled = false)
	public void GetAllEmployees() {

		RestAssured.baseURI="http://localhost:4000";

		RequestSpecification requestspecification = RestAssured.given();

		Response response = requestspecification.request(Method.GET, "/users");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}

	@Test (enabled = false)
	public void GetAnEmployee() {

		RestAssured.baseURI = "http://localhost:4000";

		RequestSpecification requestspecification = RestAssured.given();

		Response response = requestspecification.request(Method.GET, "/users/RS06");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}

	@Test(enabled = false)
	public void CreateEmployee() {

		EmployeeAdd();
		RestAssured.baseURI = "http://localhost:4000";

		RequestSpecification resquestspecification = RestAssured.given().header("Content-Type" , "application/json")
				.body(employeedata);

		Response response = resquestspecification.request(Method.POST, "/users");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}

	@Test (enabled = false)
	public void UpdateEmployee() {


		RestAssured.baseURI= "http://localhost:4000";

		EmployeeUpdate();
		RequestSpecification requestspecification = RestAssured.given().header("Content-Type" , "application/json")
				.body(updatedemp);

		Response response = requestspecification.request(Method.PUT, "/users/RS06");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());

	}

	@Test  
	public void DeleteEmployee() {

		RestAssured.baseURI = "http://localhost:4000";

		RequestSpecification requestspecification = RestAssured.given();

		Response response = requestspecification.request(Method.DELETE , "/users/RS23");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	}
}
