package SerializationDeserialization;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SerializationJson {

	protected Map<String ,Object> cardata;
	protected List<Object> cardimensions;
	
	public void addJsonData() {
		
		cardata = new LinkedHashMap<>();
		
		cardata.put("CarModel", "AudiQ7");
		cardata.put("CarColour", "Black");
		cardata.put("Engine", 1.2);
		cardata.put("FuelType", "Petrol");
		cardata.put("Transmission", "Auto");
	
		cardimensions = new LinkedList<>();
		cardimensions.add("14feet");
		cardimensions.add("7feet");
		cardimensions.add("5feet");
		
		cardata.put("cardimensions", cardimensions);
		
	}
	
	@Test
	public void createJson() {
		
		addJsonData();
		RestAssured.given().baseUri("http://localhost:4000").when().header("Content-Type", "application/json")
		.body(cardata).log().all().post("/users").then().log().all();
	
		System.out.println(cardata);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
