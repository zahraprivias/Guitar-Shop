
public abstract class Guitar {
	
	private String type;
	private String model;
	private String brand;
	private int stringnum;
	private int baseprice;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStringnum() {
		return stringnum;
	}

	public void setStringnum(int stringnum) {
		this.stringnum = stringnum;
	}

	public Guitar(String type, String model, String brand, int stringnum, int baseprice) {
		super();
		this.type = type;
		this.model = model;
		this.brand = brand;
		this.stringnum = stringnum;
		this.baseprice = baseprice;
	}
	
	public abstract int calculatePrice();

}
