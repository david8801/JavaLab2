import ua.lviv.iot.builderShop.manager.BuilderShopManager;



import ua.lviv.iot.builderShop.model.Lighting;
import ua.lviv.iot.builderShop.model.Plumbing;
import ua.lviv.iot.builderShop.model.quality;
import ua.lviv.iot.builderShop.model.resist;
import ua.lviv.iot.builderShop.model.TypeOfGoods;
import ua.lviv.iot.builderShop.model.WoodenGoods;


public class Main {
	public static void main(String[] args) {
		BuilderShopManager manager1 = new BuilderShopManager();
		
		WoodenGoods chair = new WoodenGoods("Chair", 2.4, "Wood", 80, TypeOfGoods.WOODEN_GOODS, 50,	"IKEA", 40, resist.WEAK_RESIST, 50);
		
		WoodenGoods table = new WoodenGoods("Table", 10, "Wood", 90, TypeOfGoods.WOODEN_GOODS, 100, "IKEA", 120, resist.STRONG_RESIST, 100);
		
		Plumbing toilet = new Plumbing("Toilet", 100, "ceramic", 100, TypeOfGoods.PLUMBING, 200, "Valve", 80, 60);
		
		Plumbing bath = new Plumbing("Bath", 300, "ceramic", 40, TypeOfGoods.PLUMBING, 499, "MSI", 200, 120);
		
		Lighting lamp = new Lighting("Lamp", 0.1, "Glass", 10, TypeOfGoods.LIGHTNING, 15, "HyperX", 5, 23, quality.MEDIUM_TERM, true);
		
		Lighting lantern = new Lighting("Lantern", 2, "Glass", 25, TypeOfGoods.LIGHTNING, 50, "Razer", 15, 10, quality.LONG_TERM, false);

		
        manager1.toAdd(chair);
        manager1.toAdd(table);
        manager1.toAdd(toilet);
        manager1.toAdd(bath);
        manager1.toAdd(lamp);
        manager1.toAdd(lantern);
        
        
        System.out.println(manager1.sortByPrice(true).toString());
        System.out.println(manager1.sortByPrice(false));
        System.out.println();
        System.out.println(manager1.searchByType(TypeOfGoods.PLUMBING));
        System.out.println(manager1.searchByType(TypeOfGoods.LIGHTNING));
        System.out.println();
        System.out.println(manager1.sortByWidth(true));
        System.out.println(manager1.sortByWidth(false));
	}
	

}
