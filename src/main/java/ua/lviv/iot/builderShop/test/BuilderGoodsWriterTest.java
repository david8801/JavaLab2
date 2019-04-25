package ua.lviv.iot.builderShop.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.builderShop.manager.BuilderGoodsWriter;
import ua.lviv.iot.builderShop.model.*;

import java.io.*;
import java.util.List;
import java.util.ArrayList;



class BuilderGoodsWriterTest extends BuilderGoods {
    private List<BuilderGoods> goods;

    void setUp() {
        goods = new ArrayList<>();

    }

    @BeforeEach
    void beforeEach() {
        goods = new ArrayList<>();
        goods.add(new WoodenGoods("Chair", 2.4, "Wood", 80, TypeOfGoods.WOODEN_GOODS, 50, "IKEA", 40, Resist.WEAK_RESIST, 50));
        goods.add(new WoodenGoods("Table", 10, "Wood", 90, TypeOfGoods.WOODEN_GOODS, 100, "IKEA", 120, Resist.STRONG_RESIST, 100));
        goods.add(new Plumbing("Toilet", 100, "ceramic", 100, TypeOfGoods.PLUMBING, 200, "Valve", 80, 60));
        goods.add(new Plumbing("Bath", 300, "ceramic", 40, TypeOfGoods.PLUMBING, 499, "MSI", 200, 120));
        goods.add(new Lighting("Lamp", 0.1, "Glass", 10, TypeOfGoods.LIGHTNING, 15, "HyperX", 5, 23, Quality.MEDIUM_TERM, true));
        goods.add(new Lighting("Lantern", 2, "Glass", 25, TypeOfGoods.LIGHTNING, 50, "Razer", 15, 10, Quality.LONG_TERM, false));
    }

    @Test
    void writeToFile() throws FileNotFoundException, IOException {
        BuilderGoodsWriter.writeToFile(goods);
        File myFile = new File("out.csv");
        try (FileInputStream fis = new FileInputStream(myFile);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr);) {
            String line = null;
            String lines = "";
            while ((line = bufReader.readLine()) != null) {
                lines += line + "\n";
            }
            lines = lines.substring(0, lines.length() - 1);
            System.out.println(lines);
            Assertions.assertEquals(
                    "name,weight,material,height,typeOfGoods,price,producer,width,waterResist\n" +
                            "Chair,2.4,Wood,Chair,WOODEN_GOODS,50,IKEA,40,WEAK_RESIST\n" +
                            "name,weight,material,height,typeOfGoods,price,producer,width,waterResist\n" +
                            "Table,10.0,Wood,Table,WOODEN_GOODS,100,IKEA,120,STRONG_RESIST\n" +
                            "name,weight,material,height,typeOfGoods,price,producer,width,volume\n" +
                            "Toilet,100.0,ceramic,Toilet,PLUMBING,200,Valve,80,60.0\n" +
                            "name,weight,material,height,typeOfGoods,price,producer,width,volume\n" +
                            "Bath,300.0,ceramic,Bath,PLUMBING,499,MSI,200,120.0\n" +
                            "name,weight,material,height,typeOfGoods,price,producer,width,quantity,lifetime,colorChange\n" +
                            "Lamp,0.1,Glass,Lamp,LIGHTNING,15,HyperX,5,23,MEDIUM_TERM,true\n" +
                            "name,weight,material,height,typeOfGoods,price,producer,width,quantity,lifetime,colorChange\n" +
                            "Lantern,2.0,Glass,Lantern,LIGHTNING,50,Razer,15,10,LONG_TERM,false", lines);
        } finally {
            System.out.println();
        }
    }
}