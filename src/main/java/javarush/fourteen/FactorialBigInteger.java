package javarush.fourteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Факториал
*/

public class FactorialBigInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal outputBig = BigDecimal.ONE;
        //add your code here
        if (n < 0) {
            return "0";
        } else if (n == 0) {
            return "1";
        }
        for (int i = 1; i <= n; i++) {
                outputBig = outputBig.multiply(BigDecimal.valueOf(i));

            }

        return String.valueOf(outputBig);
    }
}

