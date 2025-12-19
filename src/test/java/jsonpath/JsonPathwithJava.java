package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

//import io.restassured.path.json.JsonPath;

import com.jayway.jsonpath.JsonPath;


	public class JsonPathwithJava {

	@Test (enabled= false)
	public void useraddress() throws IOException {
		
		File restaurantjson = new File ("src/test/resources/restaurant.json");
		
		String useraddress = JsonPath.from(restaurantjson).getString("useraddress.line");
				
		System.out.println(useraddress);
			
		}
		
	@Test (enabled = false)
	public void branches() {
		
		File restaurantjson = new File ("src/test/resources/restaurant.json");
		
		List<Object> branchlist = JsonPath.from(restaurantjson).getList("Branches.branch");
		
		for (Object branch : branchlist) {
			
			System.out.println(branch);
		}
		
	}
	
	@Test (enabled = false)
	public void items() throws IOException {
		
		File restaurantjson = new File ("src/test/resources/restaurant.json");
		
		List<Object> items = JsonPath.read(restaurantjson, "$..items");
		
		for (Object item : items) {
			
			System.out.println(item);
		
	}
}	
	@Test 
	public void ordertime() throws IOException { 
		
		File orderTime = new File ("src/test/resources/restaurant.json");
		
		Integer orderitem = JsonPath.read(orderTime, "$.useraddress.pincode");
		
		System.out.println(orderitem);
		
	}
	
}