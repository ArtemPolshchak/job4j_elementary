package parserwebpage;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import java.io.*;
import static java.lang.Thread.sleep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebParser {
    //todo Написать метод записи результатов в ексельфайл
    //todo написать метод сравнения прошлых результатов и нынешних
    //todo написать метод, который выводит на экран изменившиеся модели

    public static String exelFileToBeWritten = "d:/fileResult1.xlsx";

    private final String pathURL;
    private final String lowPrice;
    private final File file;
    private static Document document;
    List<String> documents = new ArrayList<>();
    private  static int ceneoPrice = 0;
    private static Map<String, String> mapParse = new HashMap<>();
    private static Map<String, String> result = new HashMap<>();

    public void writeDataToExel() {
        //todo написать метод который записывает результаты в ексель файл
    }
    /**
     * Конструктор
     * @param pathURL ссылка на телевизор
     * @param parseWord конкретное слово для поиска value в file
     * @param file прочитанная ссылка, и записанная в file
     */

    public WebParser(String pathURL, String parseWord, File file) {
        this.pathURL = pathURL;
        this.lowPrice = parseWord;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public String getPathURL() {
        return pathURL;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    /**
     * Method connecting to WebPage for parsing
     * Метод коннектится к сайту document
     */
    private void connectToWeb() throws IOException {
        documents.add("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6");
        documents.add("Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
        documents.add("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20100101 Firefox/42.0");
        documents.add("X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36");
        documents.add("Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36 Edg/91.0.864.59");
        documents.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        documents.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        documents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) AppleWebKit/602.2.14 (KHTML, like Gecko) Version/10.0.1 Safari/602.2.14");
        documents.add("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
        documents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36");
        documents.add("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.98 Safari/537.36");
        documents.add("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        documents.add("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");

        try {
            try {
                double a = Math.random() * 10000;
                sleep((long) a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            int randomNum = (int) Math.round(Math.random() * 13);
            document = Jsoup.connect(getPathURL())
                    .userAgent(documents.get(random.nextInt(12)))
                    .referrer("http://www.google.com")
                    .get();
            /*
            document = Jsoup.connect(getPathURL())
                    .userAgent(documents.get(3))
                    .referrer("http://www.google.com")
                    .get();
             */
        } catch (IOException e) {
            System.out.println("что-то пошло не так 1");
        }
    }

    /**
     * Method writing info into file for parsing
     * Метод пишет информацию в файл для парсинга
     */
    private  void writeInfoToFile() throws IOException {

        cleanFile(getFile());
        connectToWeb();

        try {
            PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(getFile())));
            out.println(document);

        } catch (IOException e) {
            System.out.println("что-то пошло не так 2");
        }

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method looking for special amount for TV
     * Метод ищет  минимальную цену в пропарсенном файле
     */
    public  Integer run() throws IOException {
        writeInfoToFile();
        int res = 0;

        try (BufferedReader in = new BufferedReader(new FileReader(getFile()))) {
            List<String> list = new ArrayList<>();
            in.lines().forEach(list::add);
            for (String s:list) {
                if (s.contains(getLowPrice())) {
                    Pattern p = Pattern.compile("\\b[0-9]+\\b");
                    Matcher m = p.matcher(s);
                    ArrayList<String> price = new ArrayList<>();
                    while (m.find()) {
                        price.add(m.group());
                    }
                    if (price.size() > 0) {
                        ceneoPrice = Integer.parseInt(price.get(0));
                        res = ceneoPrice;
                        System.out.println("Price on the TV: " + ceneoPrice);
                    } else {
                        System.out.println("чет не так");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("что-то пошло не так 3");
        }

        cleanFile(getFile());
        return res;
    }

    /**
     * Method cleaning the file
     * метод очищает временный файл после парсинга
     * @param file clean
     */
    private static void cleanFile(File file) {
        try {
            if (!file.exists()) {
                System.out.println("Данный файл не найден");
            } else {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.setLength(0);
            }
        } catch (IOException e) {
            System.out.println("что-то пошло не так 4");

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebParser webParser)) {
            return false;
        }
        return Objects.equals(getPathURL(), webParser.getPathURL())
                && Objects.equals(getLowPrice(), webParser.getLowPrice())
                && Objects.equals(getFile(), webParser.getFile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPathURL(), getLowPrice(), getFile());
    }

    public static void main(String[] args) throws IOException {
        /*
        product:price:amount  фраза для поиска по склепзтв
        "lowPrice" -фраза для поиска по ценео
        */

        GetTestDataFromExcel excel = new GetTestDataFromExcel();
        excel.getDataFromExcel();
        mapParse = excel.map;

        File file = new File("parse.txt");
        String lowPrice = "lowPrice";

        if (!file.exists()) {
            throw new IllegalArgumentException(String.format("Not exist %s", file.getAbsoluteFile()));
        }

        for (Map.Entry<String, String> entry : mapParse.entrySet()) {

            WebParser wb = new WebParser(entry.getValue(), lowPrice, file);
            System.out.println(entry.getKey() + " - " + wb.run());
            result.put(entry.getKey(), wb.run().toString());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/
    }
}
