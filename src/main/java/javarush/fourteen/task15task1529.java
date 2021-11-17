package javarush.fourteen;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/

public class task15task1529 {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();

    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            if ("helicopter".equals(str)) {
                result = new Helicopter();
            } else if ("plane".equals(str)) {
                int res = Integer.parseInt(reader.readLine());
                result = new Plane(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //add your code here - добавьте код тут
    }
}