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




    @Override
    public String toString() {
        return "\n" + super.toString() + "An amount equals " + quantity + ", lifetime = " + lifetime + ", ability to change color = " + colorChange;
    }


}