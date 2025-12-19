package Predicates;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static com.jayway.jsonpath.Criteria.*;
import com.jayway.jsonpath.Criteria;

import com.jayway.jsonpath.DocumentContext;

import com.jayway.jsonpath.Filter;
import static com.jayway.jsonpath.Filter.*;

import com.jayway.jsonpath.JsonPath;

public class filterPredicates {

	File inputjson = new File ("src/test/resources/restaurant.json");
	
	@Test (enabled = false)
	public void andFilter() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		Filter andfilter = Filter.filter(Criteria.where("rating").gt(1).and("restaurant").is("Beach Terrace"));
		
		List<Object> Branches = parsedjson.read("$.Branches[?]", andfilter);
		
		for (Object restaurants : Branches) {
			
			System.out.println(restaurants);
		}
		
	}
	
	@Test (enabled = false)
	public void notFilter() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
 
		Filter notfilter = Filter.filter(Criteria.where("rating").gt(2).and("restaurant").ne("Beach Terrace"));
		
		List<Object> Branches = parsedjson.read("$.Branches[?]", notfilter);
		
		for (Object restaurants : Branches) {
			
			System.out.println(restaurants);
			
		}
		
	}
	@Test (enabled = false)
	public void inOperator() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		Filter inoperator = Filter.filter(Criteria.where("rating").in(2,4,1));
		
		List<Map<String,Object>> Branches = parsedjson.read("$.Branches[?]", inoperator);
		
		for (Object restaurants : Branches) {
			
			System.out.println(restaurants);
		}
		
	}
	
	@Test
	public void notinOperator() throws IOException {
		
		DocumentContext parsedjson = JsonPath.parse(inputjson);
		
		Filter notinoperator = filter(where("rating").nin(4,5));
		
		List<Map<String,Object>> Branches = parsedjson.read("$.Branches[?]", notinoperator);
		
		/*
		 * for (Object restaurants : Branches) {
		 * 
		 * System.out.println(restaurants); }
		 */	
			System.out.println(Branches.get(0).get("branch"));
		}
		
	}

