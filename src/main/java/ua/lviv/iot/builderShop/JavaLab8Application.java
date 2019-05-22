package ua.lviv.iot.builderShop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.builderShop.manager.GoodsRepository;
import ua.lviv.iot.builderShop.model.BuilderGoods;
import ua.lviv.iot.builderShop.model.TypeOfGoods;

@SpringBootApplication
public class JavaLab8Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaLab8Application.class, args);
	}


	@Bean
	public CommandLineRunner demo(final GoodsRepository repository) {
		return (args) -> {
			repository.save(new BuilderGoods("chair", 15, "wood", 60, TypeOfGoods.WOODEN_GOODS, 52, "Valve", 40));
			repository.save(new BuilderGoods("table", 25, "wood", 50, TypeOfGoods.WOODEN_GOODS, 120, "blizzard", 100));
			repository.save(new BuilderGoods("chair", 15, "wood", 60, TypeOfGoods.WOODEN_GOODS, 52, "Valve", 40));


			repository.findAll().forEach(goods -> System.out.println(goods));
			System.out.println("------------------------------------------------------------");

			System.out.println("------------------------------------------------------------");
		};

	}

}
