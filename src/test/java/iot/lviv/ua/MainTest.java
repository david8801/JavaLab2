package iot.lviv.ua;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void searchIsWorking() {
        List<String> fromFile = Arrays.asList("photo.jpg", "is", "a", "photo", "file");
        assertEquals(Collections.singletonList("photo.jpg"), Main.searchInFile(fromFile, "oto"));

        List<String> fromFile1 = Arrays.asList("photo.jpg", "is", "a", "photo1.png", "file");
        assertEquals(Arrays.asList("photo.jpg", "photo1.png"), Main.searchInFile(fromFile1, "oto"));


        assertNotEquals(Collections.singletonList("photo.png"), Main.searchInFile(fromFile, "file"));

    }
}
