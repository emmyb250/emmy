package question_five;

public class CellPhone {
	 private String manufacturer;
	    private String model;
	    private double retailPrice;

	    // Constructor
	    public CellPhone(String manufacturer, String model, double retailPrice) {
	        this.manufacturer = manufacturer;
	        this.model = model;
	        this.retailPrice = retailPrice;
	    }

	    // Getter and setter methods
	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public double getRetailPrice() {
	        return retailPrice;
	    }

	    public void setRetailPrice(double retailPrice) {
	        this.retailPrice = retailPrice;
	    }
	}

