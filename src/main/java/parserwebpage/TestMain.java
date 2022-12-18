package parserwebpage;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "./path_to_the_log4j2_config_file/log4j2.xml");
        String url;
        String lowPrice;
        int ceneoPrice = 1;
        File file = new File("parse.txt");
        ArrayList<String> urls = new ArrayList<>();
        ArrayList<String> prices = new ArrayList<>();
        parseUrls(urls);

        for (String value : urls) {
            url = value;
            System.out.println(file.getFreeSpace());
            try {

                while (true) {
                    BufferedReader br = new BufferedReader(new FileReader("parse.txt"));
                    if (br.readLine() == null) {
                        break;
                    } else {
                        RandomAccessFile raf;
                        raf = new RandomAccessFile(file, "rw");
                        raf.setLength(0);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            while (true) {
                if (ceneoPrice != 0) {
                    break;
                } else {
                    Document doc;
                    try {
                        FileOutputStream fos = new FileOutputStream(file);
                        doc = Jsoup.connect(url)
                                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                                .referrer("http://www.google.com")
                                .maxBodySize(0)
                                .timeout(10000 * 5)
                                .get();
                        PrintWriter out = new PrintWriter(new BufferedOutputStream(fos));
                        out.println(doc);
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try (BufferedReader in = new BufferedReader(new FileReader("parse.txt"))) {
                        ArrayList<String> list = new ArrayList<>();
                        in.lines().forEach(list::add);
                        for (String s : list) {
                            if (s.contains("lowPrice")) {
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
                                    price.add(String.valueOf(ceneoPrice));
                                    System.out.println(ceneoPrice);
                                } else {
                                    System.out.println("чет не так");
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            ceneoPrice = 0;
        }
    }

    public static void parseUrl(File file, String url) {
        try {

            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                    .referrer("http://www.google.com")
                    .get();

            PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file)));
            out.println(doc);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findLowPrice(String lowPrice, int ceneoPrice) {
        try (BufferedReader in = new BufferedReader(new FileReader("parse.txt"))) {
            ArrayList<String> list = new ArrayList<>();
            in.lines().forEach(list::add);
            for (String s:list) {
                if (s.contains("lowPrice")) {
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
    }

    public static void parseUrls(ArrayList<String> urls) {
        try {
            FileInputStream fis = new FileInputStream("exel.xls");
            Workbook wb = new HSSFWorkbook(fis);
            String urlToadd;
            for (int i = 0; i < 64; i++) {
                urlToadd = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
                urls.add(urlToadd);
                System.out.println(urlToadd);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInPriceExel(ArrayList<String> prices) {
        FileInputStream fis;
        try {
            fis = new FileInputStream("exel.xls");
            Workbook wb = new HSSFWorkbook(fis);
            Cell cell;
            int urlsAmount = prices.size();

            for (int i = 0; i < urlsAmount; i++) {
                cell = wb.getSheetAt(0).getRow(i).getCell(2);
                cell.setCellValue(prices.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

