package SerializationDeserialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import UsersJson.UsersFactory;

public class Deserialization extends AddUsers{

	@Test
	public void Deserialization() throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonuser = mapper.writeValueAsString(users);
		
		UsersFactory userfactory =  mapper.readValue(jsonuser, UsersFactory.class);
		
		System.out.println(userfactory.getName());
		System.out.println(userfactory.getAge());
		System.out.println(userfactory.getArrival());
		System.out.println(userfactory.getDepature());
		System.out.println(userfactory.getTrains());
	}
	
}
