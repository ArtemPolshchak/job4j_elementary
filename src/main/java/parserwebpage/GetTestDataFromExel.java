package parserwebpage;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

class GetTestDataFromExcel {

    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    public static String exelFileToBeRead = "d:/fileWithModels.xlsx";
    Map<String, String> map = new HashMap<>();

    /* public static void main(String[] args) {
        GetTestDataFromExcel dataFromExcel = new GetTestDataFromExcel();
        dataFromExcel.getDataFromExcel();
    }*/

    /**
     * Метод читает файл exel
     * затем записывает данные в map
     * key - nameTV, value - link for TV
     */
    public void getDataFromExcel() {
        try {

            File src = new File(exelFileToBeRead);
            if (!src.exists()) {
                System.out.println("file does not exist");
            }

            FileInputStream fis = new FileInputStream(src);

            XSSFWorkbook wb = new XSSFWorkbook(fis);

            for (int i = 0; i < 10; i++) {
                map.put(wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue(),
                        wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue());
            }
        } catch (Exception e) {
            System.out.println("Что то произошло в коассе getDataFromExcel");
        }
    }
}