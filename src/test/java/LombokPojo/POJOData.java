package LombokPojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POJOData {

	protected GarageInfo garage = new GarageInfo();
	

	protected GarageInfo garageId = new GarageInfo();
	protected Location location = new Location();
	protected Coordinates coordinates = new Coordinates();
	protected VehiclesInfo car1 = new VehiclesInfo();
	protected VehiclesInfo car2 = new VehiclesInfo();
	protected VehiclesInfo bike = new VehiclesInfo();
	protected Details d1 = new Details();
	protected Details d2 = new Details();
	protected Details d3 = new Details();
	protected Specs s1 = new Specs();
	protected Specs s2 = new Specs();
	protected Specs s3 = new Specs();
	protected ServiceHistory service1 = new ServiceHistory();
	protected ServiceHistory service2 = new ServiceHistory();
	protected Stats stats = new Stats();
	
	
	public void GarageID() {
		
		garageId.setGarageId("GRG-01");
		garage.setGarageId(garageId.getGarageId());
	}
	
	public void locationdata() {
		
		location.setCity("Chennai");
		location.setPincode(600023);
		garage.setLocation(location);
	}

	public void coordinatesdata() {
		
		coordinates.setLat(13.0283);
		coordinates.setLng(77.5895);
		location.setCoordinates(coordinates);
	}
	
	public VehiclesInfo Car1( ) {	
		
		car1.setType("car");
		
		d1.setID("CAR-001");
		d1.setBrand("Tesla");
		d1.setModel("Model S");
		d1.setYear(2024);
		
		s1.setBattery("300 kWh");
		s1.setRange(1000);
		s1.setAutopilot(true);
		s1.setmodes(Arrays.asList("Sport", "Comfort", "Eco"));

		d1.setspecs(s1);
		car1.setDetails(d1);
		return car1;
	}	
	
	public VehiclesInfo Car2() {
		
		car2.setType("car");
		
		d2.setID("CAR-002");
		d2.setBrand("Mahindra");
		d2.setModel("Thar");
		d2.setYear(2022);
		
		s2.setBattery("100 kWh");
		s2.setRange(600);
		s2.setAutopilot(false);
		s2.setmodes(Arrays.asList("Wrap", "Zing"));
		
		d2.setspecs(s2);
		car2.setDetails(d2);
		return car2;
	}	
		
	public VehiclesInfo bike() {
		
		bike.setType("bike");
		
		d3.setID("BIKE-001");
		d3.setBrand("Yamaha");
		d3.setModel("R15 V4");
		d3.setYear(2023);
		
		s3.setBattery("50 kWh");
		s3.setAutopilot(true);
		s3.setRange(100);
		s3.setmodes(Arrays.asList("Fast", "Slow"));
		
		d3.setspecs(s3);
		bike.setDetails(d3);
		return bike;
		
	}	
	
	public List<VehiclesInfo> Vehicleslist() {
		
		List<VehiclesInfo> list = new ArrayList<>();
		list.add(car1);
		list.add(car2);
		list.add(bike);
	
		garage.setvehicles(list);;
	    return list;
	}
	
	public void service1() {
		
	 service1.setDate("2024-03-10");
	 service1.setKm(3500);
	 service1.setCenter("MotoCare Garage - HSR Layout");
	 service1.setTasks(Arrays.asList("Oil Change", "Brake Check", "Chain Lubrication"));	
	
	 service2.setDate("2024-08-21");
	 service2.setKm(7000);
	 service2.setCenter("RiderPro Workshop - JP Nagar");
	 service2.setTasks(Arrays.asList("General Service", "Coolant Replacement"));

	}
	
	public List<ServiceHistory> service() {
		
		List<ServiceHistory> service = new ArrayList<>();
		service.add(service1);
		service.add(service2);
		garage.setserviceHistory(service);
		return service;
	}
	
	public void Stats() {
		
		stats.setTotalVehicles(3);
		stats.setCars(2);
		stats.setBikes(1);
		garage.setstats(stats);
	}
	
	public void LastUpdatedname() {
		
		garageId.setlastUpdated("2025-01-10T14:23:00Z");
		garage.setlastUpdated(garageId.getlastUpdated());
	}
	
}