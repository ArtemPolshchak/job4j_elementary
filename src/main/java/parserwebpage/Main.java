package parserwebpage;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Thread.*;

/**
 * @author User on 21.02.2022.
 * @project job4j_elementary
 */
public class Main {
    public static void main(String[] args) {

        String url = "https://www.ceneo.pl/107240729";
        String lowPrice = "lowPrice";
        File file = new File("parse.txt");
        int ceneoPrice = 0;

        try {
            //cleaning txt
            if (file.exists()) {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.setLength(0);
            }

            //connect to website
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                    .referrer("http://www.google.com")
                    .get();
            //writing in txt
            PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file)));
            out.println(doc);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //fine lowPrice value
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            ArrayList<String> list = new ArrayList<>();
            in.lines().forEach(list::add);
            for (String s:list) {
                // product:price:amount  фраза для поиска по склепзтв
                //"lowPrice" -фраза для поиска по ценео
                if (s.contains(lowPrice)) {
                    lowPrice = s;
                    System.out.println(lowPrice);
                    Pattern p = Pattern.compile("\\b[0-9]+\\b");
                    Matcher m = p.matcher(s);
                    ArrayList<String> price = new ArrayList<>();
                    while (m.find()) {
                        price.add(m.group());
                    }
                    if (price.size() > 0) {
                        ceneoPrice = Integer.parseInt(price.get(0));
                        System.out.println(ceneoPrice);
                    } else {
                        System.out.println("чет не так");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (file.exists()) {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.setLength(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String pathFromXLSX = "d:/fileWithModels.xlsx";
        String pathToXLSX    = "d:/test.xlsx";
    }
}
