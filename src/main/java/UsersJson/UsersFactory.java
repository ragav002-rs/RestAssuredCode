package UsersJson;

import java.util.List;

public class UsersFactory {

	
	private String name;
	private Integer age;
	private String arrival;
	private String depature; 
	private List Trains;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	
	public String getArrival() {
		return arrival;
	}
	
	public void setDepature(String depature) {
		this.depature = depature;
	}
	
	public String getDepature() {
		return depature;
	}
	
	public void setTrains(List Trains) {
		this.Trains = Trains;
	}
	
	public List getTrains() {
		return Trains;
	}

	
}
