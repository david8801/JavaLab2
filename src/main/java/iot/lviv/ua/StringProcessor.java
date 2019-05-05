package iot.lviv.ua;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.util.stream.Stream;
public class StringProcessor {

    public static List<String> txtToList(String fileName) {
        List<String> dict = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(
                new File(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    Stream.of(line.split("\\s+"))
                            .forEachOrdered(word -> dict.add(word));
                }
            }
        } catch (Exception e) {
            System.out.printf("Caught Exception: %s%n", e.getMessage());
            e.printStackTrace();
        }
        return dict;
    }
}
