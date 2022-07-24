package javarush.coretwenty;

import java.io.*;
import java.util.Properties;

/**
 * @author User on 17.05.2022.
 * @project job4j_elementary
 */
public class TestProperties {
    public static void main(String[] args) throws IOException  {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("dataConfig.properties");
        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("uname", "navin");
        p.setProperty("pass", "0000");
        p.store(os, null);

        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("pass"));

        p.list(System.out);
    }
}
