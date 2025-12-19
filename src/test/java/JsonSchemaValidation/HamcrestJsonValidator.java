package JsonSchemaValidation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestJsonValidator {

	private File inputjson;
	private File jsonschema;
	private String jsonstring;
	
	@Test
	public void HamcrestJsonValidation() throws IOException {
		
		inputjson = new File("src/test/resources/input.json");
		
		jsonstring = FileUtils.readFileToString(inputjson , "UTF-8");
		
		jsonschema = new File("/home/ragavkumar/jsonschema.json");
		
		MatcherAssert.assertThat(jsonstring, JsonSchemaValidator.matchesJsonSchema(jsonschema));
	
	}
	
}
