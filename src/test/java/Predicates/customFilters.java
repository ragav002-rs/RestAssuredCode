package Predicates;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

public class customFilters {

	File inputjson = new File("src/test/resources/restaurant.json");

	@Test (enabled = false)
	public void customfilter() throws IOException {

		Predicate foodname = new Predicate() {

			@Override
			public boolean apply(PredicateContext ctx) {
				boolean predicate = ctx.item(Map.class).containsKey("name");
				return predicate;
			}

		};

		DocumentContext parsedjson = JsonPath.parse(inputjson);

		List<Map<String, Object>> items = parsedjson.read("$.orders..items", List.class, foodname);

	
		 for (Object restaurants : items) {
		 
		  System.out.println(restaurants); }
	
	}

	@Test
	public void lamdafilter() throws IOException {
		
		Predicate fooditem = ctx -> ctx.item(Map.class).containsKey("name");
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		List<Map<String,Object>> items = parsedjson.read("$.orders[1].items", List.class, fooditem);
		
		for(Object restaurants : items) {
			
			System.out.println(restaurants);
		}
		
	}
	
	
}
