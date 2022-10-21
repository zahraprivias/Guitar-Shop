
public class Accoustic extends Guitar {

	private String hybrid;
	private int price;
	
	public String getHybrid() {
		return hybrid;
	}

	public void setHybrid(String hybrid) {
		this.hybrid = hybrid;
	}

	public Accoustic(String type, String model, String brand, int stringnum, int baseprice, String hybrid) {
		super(type, model, brand, stringnum, baseprice);
		this.hybrid = hybrid;
		if (hybrid.equalsIgnoreCase("Yes")) {
			price = 500000;
		} else {
			price = 0;
		}
	}

	@Override
	public int calculatePrice() {
		return (getBaseprice() + (150000 * getStringnum()) + price);
	}

}
