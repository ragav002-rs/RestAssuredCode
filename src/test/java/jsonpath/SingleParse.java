package jsonpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class SingleParse {

	@Test
	public void parseOneTime() throws IOException {
	
		FileInputStream restaurantjson = new FileInputStream ("src/test/resources/restaurant.json");
		
		Object parsedjson = Configuration.defaultConfiguration().jsonProvider().parse(restaurantjson.readAllBytes());
		
		List<Object> addressdetails = JsonPath.read(parsedjson, "$..address");
		
		for(Object address : addressdetails) {
			
			System.out.println(address);
		}
		
		
	}
	
	
}
