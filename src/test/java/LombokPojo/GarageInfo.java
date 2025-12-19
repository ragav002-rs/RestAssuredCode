package LombokPojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonPropertyOrder({"garageId","location","vehicles","serviceHistory","stats","lastUpdated"})
public class GarageInfo {

	private String garageId;
	private Location location;
	private List<VehiclesInfo> vehicles;
	private List<ServiceHistory> serviceHistory;
	private Stats stats;
	private String lastUpdated;
	
	
}	
