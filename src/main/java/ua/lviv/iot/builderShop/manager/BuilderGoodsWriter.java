package ua.lviv.iot.builderShop.manager;
import ua.lviv.iot.builderShop.model.BuilderGoods;

import java.io.*;
import java.util.List;

public class BuilderGoodsWriter {
    public static void writeToFile(List<BuilderGoods> goods)
        throws FileNotFoundException, IOException {
        File myFile = new File("out.csv");
        try (FileOutputStream fos = new FileOutputStream(myFile);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bufWriter = new BufferedWriter(osw);){
            for(BuilderGoods good:goods){
                bufWriter.write(
                        good.getHeaders() + "\n"
                        + good.toCSV() + "\n"
                );
            }
        }finally {
            System.out.println();
        }

    }
}

