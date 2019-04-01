package ua.lviv.iot.builderShop.manager;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.builderShop.model.BuilderGoods;
import ua.lviv.iot.builderShop.model.TypeOfGoods;


public class BuilderShopManager {

    private List<BuilderGoods> builderGoodsList = new ArrayList<>();

    public void toAdd(BuilderGoods builderGoods) {
        builderGoodsList.add(builderGoods);
    }

    public BuilderShopManager() {
    }

    public BuilderShopManager(List<BuilderGoods> builderGoodsList) {
        this.builderGoodsList = builderGoodsList;
    }

    public List<BuilderGoods> searchByType(TypeOfGoods typeOfGoods) {
        return builderGoodsList.stream().filter(vessel -> vessel.getTypeOfGoods() == typeOfGoods).
                collect(Collectors.toList());
    }

    public static void sortByPrice(List<BuilderGoods> builderGoodsList, boolean ascending) {
        if (ascending) {
            Collections.sort(builderGoodsList, Comparator.comparing(BuilderGoods::getPrice).reversed());
        } else {
            Collections.sort(builderGoodsList, Comparator.comparing(BuilderGoods::getPrice));
        }
    }

    public static void sortByWidth(List<BuilderGoods> builderGoodsList, boolean ascending) {
        if (ascending) {
            Collections.sort(builderGoodsList, Comparator.comparing(BuilderGoods::getWidth).reversed());
        } else {
            Collections.sort(builderGoodsList, Comparator.comparing(BuilderGoods::getWidth));
        }
    }

}
