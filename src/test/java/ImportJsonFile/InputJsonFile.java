package ImportJsonFile;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class InputJsonFile {

	private File file;

	@Test (enabled = false)
	public void Inputjson() {
		
		file = new File("Usersdata.json");
		RestAssured.given().baseUri("http://localhost:4000").when().header("Content-Type" , "application/json")
		.body(file).post("/users").prettyPrint();
		
	}
	
	
	
}
