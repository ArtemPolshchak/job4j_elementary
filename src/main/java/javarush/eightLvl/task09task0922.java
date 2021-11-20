package javarush.eightLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class task09task0922 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        //Парсинг строки и сохранение в тип Date.
        SimpleDateFormat dfIn = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dfIn.parse(str);
//Перевод даты в String в указанном формате и вывод в верхнем регистре.
        SimpleDateFormat dfOut = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dfOut.format(date).toUpperCase());


    }
}
