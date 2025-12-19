package Predicates;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class inlinePredicates {

	File inputjson = new File ("src/test/resources/restaurant.json");
	
	
	
	@Test (enabled = false)
	public void andOperator() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		List<Object> Branches = parsedjson.read("$.Branches[?(@.rating>=2 && @.restaurant == 'Beach Terrace' )]");
		
		for(Object restaurants : Branches) {
			
			System.out.println(restaurants);	
		}
		
	}	
	
	@Test 
	public void orOperator() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		List<Object> Branches = parsedjson.read("$.Branches[?(@.rating>3 || @.restaurant=='VB World')]");
		
		for(Object restaurants : Branches) {
			
			System.out.println(restaurants);
		}
			
	}
	
	@Test (enabled = false)
	public void notOperator() throws IOException {
	
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
List<Object> Branches = parsedjson.read("$.Branches[?(!(@.rating>=3 && @.restaurant=='Rameshwaram Cafe'))]");
		
		for(Object restaurants : Branches) {
			
			System.out.println(restaurants);
		}
		
	}
		
	@Test (enabled = false)
	public void notOperators() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		List<Object> Branches = parsedjson.read("$.Branches[?(!(@.rating>2 || @.restaurant=='Beach Terrace'))]");
		
		for(Object restaurants : Branches) {
			
			System.out.println(restaurants);
		}	
		
		
	}
	
}
