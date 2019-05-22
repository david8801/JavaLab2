package ua.lviv.iot.builderShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.builderShop.model.BuilderGoods;

@RestController
public class BuilderGoodsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @RequestMapping(value = "/builderGoods", method = RequestMethod.GET)
    public List<BuilderGoods> getBuilderGoodes() {
        return (List<BuilderGoods>) goodsRepository.findAll();
    }

    @RequestMapping(value = "/builderGoods/{id}", method = RequestMethod.GET)
    public BuilderGoods getBuilderGoods(@PathVariable Integer id) {
        return goodsRepository.findById(id).get();
    }

    @RequestMapping(value = "/builderGoods", method = RequestMethod.POST)
    public BuilderGoods postBuilderGoods(@RequestBody BuilderGoods builderGoods) {
        return goodsRepository.save(builderGoods);
    }

    @RequestMapping(value = "/builderGoods/{id}", method = RequestMethod.PUT)
    public BuilderGoods updateBuilderGoods(@RequestBody BuilderGoods newBuilderGoods, @PathVariable Integer id) {
        return goodsRepository.findById(id)
                .map(builderGoods -> {
                    newBuilderGoods.setId(id);
                    return goodsRepository.save(newBuilderGoods);
                }).orElseThrow();
    }

    @RequestMapping(value = "/builderGoods/{id}", method = RequestMethod.DELETE)
    public BuilderGoods deleteEquity(@PathVariable Integer id) {
        BuilderGoods temp = getBuilderGoods(id);
        goodsRepository.deleteById(id);
        return temp;
    }
}