package LombokPojo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Specs {

	private String battery;
	private int range_km;
	private boolean autopilot;
	private List<String> modes;
	
	
}
