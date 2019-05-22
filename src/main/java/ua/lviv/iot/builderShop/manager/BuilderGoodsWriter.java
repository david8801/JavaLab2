package ua.lviv.iot.builderShop.manager;
import ua.lviv.iot.builderShop.model.BuilderGoods;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BuilderGoodsWriter {
    public static void writeToFile(List<BuilderGoods> repairs)
            throws FileNotFoundException, IOException {
        File myFile = new File("out.csv");
        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw);) {
            for (BuilderGoods repair:repairs) {
                bufWriter.write(
                        repair.getHeaders() + "\n"
                                + repair.toCSV() + "\n"
                );
            }
        } finally {
            System.out.println();
        }
    }
}

