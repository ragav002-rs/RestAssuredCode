package VehiclesPOJO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"garageId","location","vehicles","serviceHistory","stats","lastUpdated"})
public class GarageInfo {

	private String garageId;
	private Location location;
	private List<VehiclesInfo> vehicles;
	private List<ServiceHistory> serviceHistory;
	private Stats stats;
	private String lastUpdated;
	
	
	public String getGarageId() {
		return garageId;	
	}
	
	public void setGarageId(String garageId) {
		this.garageId = garageId;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public List<VehiclesInfo> getvehicles() {
		return vehicles;	
	}
	
	public void setvehicles(List<VehiclesInfo> vehicles) {
		this.vehicles = vehicles;	
	}
	
	public List<ServiceHistory> getserviceHistory() {
		return serviceHistory;
	}
	
	public void setserviceHistory(List<ServiceHistory> service) {
		this.serviceHistory = service;
	}
	
	public Stats getstats() {
		return stats;
	}
	
	public void setstats(Stats stats) {
		this.stats = stats;
	}
	
	public String getlastUpdated() {
		return lastUpdated;
	}
	
	public void setlastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
}	
