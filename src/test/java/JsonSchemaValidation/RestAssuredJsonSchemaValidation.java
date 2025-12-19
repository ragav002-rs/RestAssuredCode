package JsonSchemaValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	
	File inputjson;
	File jsonschema;
	FileInputStream outputjsonschema;
	
	@Test (enabled = false)
	public void JsonSchemaValidationFile() {
		
		inputjson = new File("src/test/resources/input.json");
		jsonschema  = new File("/home/ragavkumar/jsonschema.json");
		
		RestAssured.given().baseUri("http://localhost:4000/").when().header("Content-Type", "application/json")
		.body(inputjson).post("/users")
		.then().body(JsonSchemaValidator.matchesJsonSchema(jsonschema));
	}

	@Test (enabled = false)
	public void JsonSchemaValidationClasspath() {
		
		inputjson = new File("src/test/resources/input.json");
		
		RestAssured.given().baseUri("http://localhost:4000").when().header("Content-Type", "application/json")
		.body(inputjson).post("/users").then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonschema.json"));
	}
	
	@Test
	public void JsonSchemaValidatorInputStream() throws FileNotFoundException {
		
		File inputjson = new File("src/test/resources/input.json");
		outputjsonschema = new FileInputStream("/home/ragavkumar/jsonschema.json");
		
		RestAssured.given().baseUri("http://localhost:4000/").when().header("Content-Type", "application/json")
		.body(inputjson).post("/users").then().body(JsonSchemaValidator.matchesJsonSchema(jsonschema));
		
	}
	
}