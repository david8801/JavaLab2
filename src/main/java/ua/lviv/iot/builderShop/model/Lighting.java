package ua.lviv.iot.builderShop.model;

public class Lighting extends BuilderGoods {
    public Lighting() {
    }

    public Lighting(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
                    String producer, int width, int quantity, Quality lifetime, boolean colorChange) {
        super(name, weight, material, height, typeOfGoods, price, producer, width);
        this.quantity = quantity;
        this.lifetime = lifetime;
        this.colorChange = colorChange;
    }

    private int quantity;
    private Quality lifetime;
    private boolean colorChange;

    public String getHeaders() {
        return super.getHeaders() + ","
                + "quantity" + ","
                + "lifetime" + ","
                + "colorChange";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + this.quantity + ","
                + this.lifetime + ","
                + this.colorChange;
    }


    @Override
    public String toString() {
        return "\n" + super.toString() + "An amount equals " + quantity + ", lifetime = " + lifetime + ", ability to change color = " + colorChange;
    }


}