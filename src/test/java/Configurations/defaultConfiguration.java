package Configurations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class defaultConfiguration {
	
	File inputjson = new File ("src/test/resources/users.json");
	
	@Test
	public void config() throws IOException {
		
		Configuration config = Configuration.defaultConfiguration();
		
	//	config = config.addOptions(Option.ALWAYS_RETURN_LIST);
	//	config = config.addOptions(Option.SUPPRESS_EXCEPTIONS);
	//	config = config.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		config = config.addOptions(Option.REQUIRE_PROPERTIES);
		
		
		
		List<String> age = JsonPath.using(config).parse(inputjson).read("$.users[*].name");
		
		System.out.println(age);
	}
	
	
}
