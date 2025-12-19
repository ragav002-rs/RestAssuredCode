package VehiclesPOJO;

public class Details {

	private String id;
	private String brand;
	private String model;
	private int year;
	private Specs specs;
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {	
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Specs getspecs() {
		return specs;
	}
	
	public void setspecs(Specs specs) {
		this.specs = specs;
	}
	
}
