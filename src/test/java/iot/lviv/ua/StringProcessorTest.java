package iot.lviv.ua;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void testTxtToList() throws IOException {
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(new File(Main.fileName));
        System.setIn(fips);
        Main.main(args);
        System.setIn(original);
    }
}