package SerializationDeserialization;


import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import UsersJson.UsersFactory;

import io.restassured.path.json.JsonPath;

public class DeserializeRestAssured extends AddUsers {

	@Test
	public void DeserializeRA() throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(users);
		
		
		JsonPath jsonpath = JsonPath.from(json);
		UsersFactory userfactory = jsonpath.getObject("$", UsersFactory.class);
	
		System.out.println(userfactory.getName());
		System.out.println(userfactory.getAge());
		System.out.println(userfactory.getArrival());
		System.out.println(userfactory.getDepature());
		System.out.println(userfactory.getTrains());
		
	}

}
