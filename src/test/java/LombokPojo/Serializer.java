package LombokPojo;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer extends POJOData{

	File complexjson = new File ("src/test/resources/complex.json");
	
	@Test
	public void serialize() throws StreamWriteException, DatabindException, IOException {
		
		GarageID();
	    locationdata();
	    coordinatesdata();
	    Car1();
	    Car2();
	    bike();
	    Vehicleslist();
	    service1();
	    service();
	    Stats();
	    LastUpdatedname();
	    
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(complexjson, garage);
			
	}
	
	
	
	
}
