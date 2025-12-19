package SerializationDeserialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import UsersJson.UsersFactory;

public class MappingProvider extends AddUsers{

	@Test
	public void mapping() throws JsonProcessingException {
		
		JacksonMappingProvider mapping = new JacksonMappingProvider();
		
		Configuration config = Configuration.defaultConfiguration();
		
		config.builder().mappingProvider(mapping).build();
		
		UsersFactory userfactory = JsonPath.using(config).parse(users).read("$", UsersFactory.class);
		
		System.out.println(userfactory.getName());
		System.out.println(userfactory.getAge());
		System.out.println(userfactory.getArrival());
		System.out.println(userfactory.getDepature());
		System.out.println(userfactory.getTrains());
		
	}
	
}
