package VehiclesPOJO;

import java.util.List;

public class Specs {

	private String battery;
	private int range_km;
	private boolean autopilot;
	private List<String> modes;
	
	public String getBattery() {
		return battery;
	}
	
	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	public int getRange() {
		return range_km;
	}
	
	public void setRange(int range_km) {
		this.range_km = range_km;
	}	
	
	public boolean getAutopilot() {
		return autopilot;
	}
	
	public void setAutopilot(boolean autopilot) {
		this.autopilot = autopilot;
	}
	
	public List<String> getmodes() {
		return modes;
	}
	
	public void setmodes(List<String> modes) {
		this.modes = modes;
	}
	
	
}
