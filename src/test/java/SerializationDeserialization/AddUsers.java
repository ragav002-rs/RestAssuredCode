package SerializationDeserialization;

import java.util.Arrays;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import UsersJson.UsersFactory;


public class AddUsers {
	protected UsersFactory users = new UsersFactory();
	
	@BeforeTest
	public void pojoData() {
		
		users.setName("Ragav Kumar");
		users.setAge(29);
		users.setArrival("Chennai");
		users.setDepature("kollam");
		users.setTrains(Arrays.asList("Trivandram Express", "Kollam Express", "Coimbatore Express"));
	}
	
	@Test (enabled = false)
	public void pojoDataPrint() {
		System.out.println(users.getName());
		System.out.println(users.getAge());
		System.out.println(users.getArrival());
		System.out.println(users.getDepature());
		System.out.println(users.getTrains());
	}
	
	@Test 
	public void tour() throws JsonProcessingException {	
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonusers = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
		System.out.println(jsonusers);
	}

}
