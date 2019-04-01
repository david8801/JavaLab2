package ua.lviv.iot.builderShop.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import  ua.lviv.iot.*;
import ua.lviv.iot.builderShop.manager.BuilderShopManager;
import ua.lviv.iot.builderShop.model.*;

public class BuilderShopTest {
    private List<BuilderGoods> builderGoodsList = new ArrayList<>();
    private BuilderShopManager buildManager;

    @BeforeEach
    public void beforeEach() {
        builderGoodsList = new ArrayList<>();
        builderGoodsList.add(new WoodenGoods("Chair", 2.4, "Wood", 80, TypeOfGoods.WOODEN_GOODS, 50, "IKEA", 40, Resist.WEAK_RESIST, 50));
        builderGoodsList.add(new WoodenGoods("Table", 10, "Wood", 90, TypeOfGoods.WOODEN_GOODS, 100, "IKEA", 120, Resist.STRONG_RESIST, 100));
        builderGoodsList.add(new Plumbing("Toilet", 100, "ceramic", 100, TypeOfGoods.PLUMBING, 200, "Valve", 80, 60));
        builderGoodsList.add(new Plumbing("Bath", 300, "ceramic", 40, TypeOfGoods.PLUMBING, 499, "MSI", 200, 120));
        builderGoodsList.add(new Lighting("Lamp", 0.1, "Glass", 10, TypeOfGoods.LIGHTNING, 15, "HyperX", 5, 23, Quality.MEDIUM_TERM, true));
        builderGoodsList.add(new Lighting("Lantern", 2, "Glass", 25, TypeOfGoods.LIGHTNING, 50, "Razer", 15, 10, Quality.LONG_TERM, false));
        buildManager = new BuilderShopManager(builderGoodsList);
    }
    @Test
    void testSortByPriceAscendingTrue() {
        BuilderShopManager.sortByPrice(builderGoodsList , true);
        Assertions.assertEquals(499, builderGoodsList.get(0).getPrice());
        Assertions.assertEquals(200, builderGoodsList.get(1).getPrice());
        Assertions.assertEquals(100, builderGoodsList.get(2).getPrice());
        Assertions.assertEquals(50, builderGoodsList.get(3).getPrice());
        Assertions.assertEquals(50, builderGoodsList.get(4).getPrice());
        Assertions.assertEquals(15, builderGoodsList.get(5).getPrice());
    }
    @Test
    void testSortByPriceAscendingFalse() {
        BuilderShopManager.sortByPrice(builderGoodsList , false);
        Assertions.assertEquals(15, builderGoodsList.get(0).getPrice());
        Assertions.assertEquals(50, builderGoodsList.get(1).getPrice());
        Assertions.assertEquals(50, builderGoodsList.get(2).getPrice());
        Assertions.assertEquals(100, builderGoodsList.get(3).getPrice());
        Assertions.assertEquals(200, builderGoodsList.get(4).getPrice());
        Assertions.assertEquals(499, builderGoodsList.get(5).getPrice());
    }
    @Test
    void testSearchByType() {
        Assertions.assertEquals(2, buildManager.searchByType(TypeOfGoods.PLUMBING).size());
        Assertions.assertEquals(2, buildManager.searchByType(TypeOfGoods.WOODEN_GOODS).size());
        Assertions.assertEquals(2, buildManager.searchByType(TypeOfGoods.LIGHTNING).size());
    }
    @Test
    void testSortByWidthAscendingTrue() {
        BuilderShopManager.sortByWidth(builderGoodsList , true);
        Assertions.assertEquals(200, builderGoodsList.get(0).getWidth());
        Assertions.assertEquals(120, builderGoodsList.get(1).getWidth());
        Assertions.assertEquals(80, builderGoodsList.get(2).getWidth());
        Assertions.assertEquals(40, builderGoodsList.get(3).getWidth());
        Assertions.assertEquals(15, builderGoodsList.get(4).getWidth());
        Assertions.assertEquals(5, builderGoodsList.get(5).getWidth());
    }
    @Test
    void testSortByWidthAscendingFalse() {
        BuilderShopManager.sortByWidth(builderGoodsList , false);
        Assertions.assertEquals(5, builderGoodsList.get(0).getWidth());
        Assertions.assertEquals(15, builderGoodsList.get(1).getWidth());
        Assertions.assertEquals(40, builderGoodsList.get(2).getWidth());
        Assertions.assertEquals(80, builderGoodsList.get(3).getWidth());
        Assertions.assertEquals(120, builderGoodsList.get(4).getWidth());
        Assertions.assertEquals(200, builderGoodsList.get(5).getWidth());
    }

}