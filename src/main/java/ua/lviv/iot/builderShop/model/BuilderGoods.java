package ua.lviv.iot.builderShop.model;

public class BuilderGoods {

	private String name;
	private double weight;
	private String material;
	private int height;
	private TypeOfGoods typeOfGoods;
	private int price;
	private String producer;
	private int width;
	
	public BuilderGoods(){}
	
	public BuilderGoods(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
			String producer, int width) {
		this.name = name;
		this.weight = weight;
		this.material = material;
		this.height = height;
		this.typeOfGoods = typeOfGoods;
		this.price = price;
		this.producer = producer;
		this.width = width;
	}	





	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	public TypeOfGoods getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfMenu(TypeOfGoods typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }



	@Override
	public String toString() {
		return "Products' name is " + name + ", it weights " + weight + " kilogramms, it's made of " + material + ", height equals " + height
				+ " santimeteres, type of goods is " + typeOfGoods + ", it costs " + price + " $, producer is " + producer + ", its' width = " + width +" ";
	}




}
