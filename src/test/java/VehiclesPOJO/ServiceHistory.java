package VehiclesPOJO;

import java.util.List;

public class ServiceHistory {

	private String date;
	private Integer km;
	private String center;
	private List<String> tasks;
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public Integer getKm() {
		return km;
	}
	
	public void setKm(Integer km) {
		this.km = km;
	}
	
	public String getCenter() {
		return center;
	}
	
	public void setCenter(String center) {
		this.center = center;
	}
	
	public List<String> getTasks() {
		return tasks;
	}
	
	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}
	
}
