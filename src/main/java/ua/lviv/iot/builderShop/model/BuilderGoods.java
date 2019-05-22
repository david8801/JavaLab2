package ua.lviv.iot.builderShop.model;


import javax.persistence.*;

@Entity()
@Table(name = "BuilderGoods")
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="parent")

public class BuilderGoods {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private double weight;

    @Column
    private String material;

    @Column
    private int height;

    @Column
    private TypeOfGoods typeOfGoods;

    @Column
    private int price;

    @Column
    private String producer;

    @Column
    private int width;

    public BuilderGoods() {
    }

    public String getHeaders() {
        return "name" + ","
                + "weight" + ","
                + "material" + ","
                + "height" + ","
                + "typeOfGoods" + ","
                + "price" + ","
                + "producer" + ","
                + "width";
    }

    public String toCSV() {
        return this.name + ","
                + this.weight + ","
                + this.material + ","
                + this.name + ","
                + this.typeOfGoods + ","
                + this.price + ","
                + this.producer + ","
                + this.width;
    }

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

    public int getPrice() {
        return price;
    }


    public int getWidth() {
        return width;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeOfGoods getTypeOfGoods() {
        return typeOfGoods;
    }



    @Override
    public String toString() {
        return "Products' name is " + name + ", it weights " + weight + " kilogramms, it's made of " + material + ", height equals " + height
                + " santimeteres, type of goods is " + typeOfGoods + ", it costs " + price + " $, producer is " + producer + ", its' width = " + width + " ";
    }


}
