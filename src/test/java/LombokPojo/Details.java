package LombokPojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Details {

	private String id;
	private String brand;
	private String model;
	private int year;
	private Specs specs;
	
	
}
