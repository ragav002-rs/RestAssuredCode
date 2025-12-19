package LombokPojo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ServiceHistory {

	private String date;
	private Integer km;
	private String center;
	private List<String> tasks;
	
}
