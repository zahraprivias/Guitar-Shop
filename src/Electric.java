
public class Electric extends Guitar {
	
	private String amp;
	private int price;

	public String getAmp() {
		return amp;
	}

	public void setAmp(String amp) {
		this.amp = amp;
	}

	public Electric(String type, String model, String brand, int stringnum, int baseprice, String amp) {
		super(type, model, brand, stringnum, baseprice);
		this.amp = amp;
		if (amp.equalsIgnoreCase("Yes")) {
			price = 1000000;
		} else {
			price = 0;
		}
	}

	@Override
	public int calculatePrice() {
		return (getBaseprice() + (150000 * getStringnum()) + price);
	}

}
