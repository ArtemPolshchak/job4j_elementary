import jdk.swing.interop.SwingInterOpUtils;
import org.jsoup.Jsoup;

import java.util.Locale;

/**
 * @author User on 30.08.2022.
 * @project job4j_elementary
 */
public class Main {
    public static void main(String[] args) {
        try {
            var document = Jsoup.connect("https://hotline.ua/ua/av-televizory/lg-55nano90/").get();
            var titleElements = document.select("h2");
            for (var element : titleElements) {
                System.out.println(element.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
