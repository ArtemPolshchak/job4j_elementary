package javarush.corenine;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author User on 14.05.2022.
 * @project job4j_elementary
 */
public class Solution {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String html = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela\n"
                + "</span></b></span><span>Super</span><span>girl</span>";
        String html1 = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a></div>"
                + "</body></html>";
        Document document = Jsoup.parse(html1);
        System.out.println(document.title());
        Elements paragraphs = document.getElementsByTag("p");
        for (Element p : paragraphs) {
            System.out.println(p.text());
        }

        Element sampleDiv = document.getElementById("sampleDiv");
        System.out.println("Data: " + sampleDiv.text());
        Elements links = sampleDiv.getElementsByTag("a");

        for (Element link : links) {
            System.out.println("Href: " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }
    }
}
