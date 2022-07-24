package javarush.corenine;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Знакомство с тегами
*/

public class ParseByTeg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder builder = new StringBuilder();
        while (fileReader.ready()) {
            builder.append((char)fileReader.read());
        }
        String text = builder.toString();
        Document document = Jsoup.parse(text, "", Parser.xmlParser());
        Elements h1 = document.select("span");
        for (Element element : h1) {
            System.out.println(element);
        }
        fileReader.close();
        reader.close();
    }
}
