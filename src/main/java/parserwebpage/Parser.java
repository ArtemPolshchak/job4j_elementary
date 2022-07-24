package parserwebpage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author User on 22.02.2022.
 * @project job4j_elementary
 */
public class Parser {
    public static void main(String[] args) throws IOException {
        String html =
                "<html>                                                                       "
                        +  "    <head>                                                                   "
                        +  "        <title href=\"hh.ru/vacancy?home\">                                  "
                        +   "            Работа в Москве, поиск персонала и публикация вакансий - hh.ru   "
                        +  "        </title>                                                             "
                        +   "    </head>                                                                  "
                        +  "    <body>                                                                   "
                        +  "        <div class=\"header main\">                                          "
                        +  "            <h1>Работа найдется для каждого</h1>                             "
                        +  "            <div>Поиск вакансий</div>                                        "
                        +  "        </div>                                                               "
                        +   "        <div class=\"content\">                                              "
                        +  "            <div>Вакансии дня</div>                                          "
                        +  "            <div id=\"123\">Компании дня</div>                               "
                        +  "            <div>Работа из дома</div>                                        "
                        +    "        </div>                                                               "
                        +   "    </body>                                                                  "
                        +   "</html>    "
                        +  "                                                                  "
                        +   "<script>"
                        +  "   name   " + "   LG 55NANO953NA   "
                        +  "   image   "

                        +   "   sku    " + "    97692272    "
                        +   "   brand   " + "   LG   "
                        +   "   offers   "
                        +    "@type" + "AggregateOffer"
                        +    "    lowPrice    " + 5499.0000
                        +    "    highPrice    " + 8599.0000
                        +  "   priceCurrency   " + "PLN"
                        +  "   offerCount   " + 2
                        +   "   availability   " + "   InStock  "
                        +    "   itemCondition   " + "   NewCondition  "

                        +    "</script>";

        Document document4 = Jsoup.connect("https://sklepztv.pl/wp-admin/post.php?post=397550&action=edit")
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                .referrer("http://www.google.com")
                .get();
        Document document3 = Jsoup.connect("https://www.ceneo.pl/97692272")
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                .referrer("http://www.google.com")
                .get();
        Document document = Jsoup.parse(html);
        File file = new File("parse.txt");
        Document document1 = Jsoup.parse(file, "UTF-8");
        Elements element = document.select("h1");
        Elements elements = document1.select("lowPrice");
        System.out.println(elements.contains("lowPrice"));

    }
}
