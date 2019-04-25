package ua.lviv.iot.builderShop.model;

public class WoodenGoods extends BuilderGoods {


    public WoodenGoods() {
    }

    public WoodenGoods(String name, double weight, String material, int height, TypeOfGoods typeOfGoods, int price,
                       String producer, int width, Resist waterResist, int length) {
        super(name, weight, material, height, typeOfGoods, price, producer, width);
        this.waterResist = waterResist;
        this.length = length;
    }

    private Resist waterResist;
    private int length;

    public String getHeaders() {
        return super.getHeaders() + ","
                + "waterResist";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + this.waterResist;
    }
    @Override
    public String toString() {
        return "\n" + super.toString() + "waterResist = " + waterResist + ", length = " + length;
    }

}
