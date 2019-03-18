package ua.lviv.iot.builderShop.model;

public class Lighting extends BuilderGoods {
	
	
	public Lighting() {}
	
	public Lighting(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
			String producer, int width, int quantity, quality lifetime, boolean colorChange) {
		super(name, weight, material, height, typeOfGoods, price, producer, width);
		this.quantity = quantity;
		this.lifetime = lifetime;
		this.colorChange = colorChange;
	}
	private int quantity;
	private quality lifetime;
	private boolean colorChange;

	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public quality getLifetime() {
		return lifetime;
	}
	public void setLifetime(quality lifetime) {
		this.lifetime = lifetime;
	}
	public boolean isColorChange() {
		return colorChange;
	}
	public void setColorChange(boolean colorChange) {
		this.colorChange = colorChange;
	}
	@Override
	public String toString() {
		return "\n" + super.toString()+ "An amount equals " + quantity + ", lifetime = " + lifetime + ", ability to change color = " + colorChange;
	}


	
}