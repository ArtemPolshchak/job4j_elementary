package javarush.eighteen;

import java.io.*;

/**
 * @author User on 03.04.2022.
 * @project job4j_elementary
 */
public class ConnectTwoFiles {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file1));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(file2))) {
                while (fileReader.ready()) {
                    while (fileReader2.ready()) {
                        fileWriter.write(fileReader2.read());
                    }
                    fileWriter.write(fileReader.read());

                }
             }
    }
}

