package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class FluentApi {

	@Test
	public void fluentApiParse() throws IOException {
		
		File inputjson = new File ("src/test/resources/restaurant.json");
		
		DocumentContext jsoncontext = JsonPath.parse(inputjson);
				
		List<Object> restaurants = jsoncontext.read("$.Branches..restaurant");
		
		for (Object Branches : restaurants) {
			
			System.out.println(Branches);
		}
	}
	
	@Test
	public void configJson() throws IOException {
		
		File inputjson = new File ("src/test/resources/restaurant.json");
		
		Configuration configuration = Configuration.defaultConfiguration();
		
		List<Object> ratings = JsonPath.using(configuration).parse(inputjson).read("$.Branches..rating");
				
		for (Object restaurants : ratings) {
			
			System.out.println(restaurants);
		}
	}
	
	
	
	
	
	
	
	
	
}
