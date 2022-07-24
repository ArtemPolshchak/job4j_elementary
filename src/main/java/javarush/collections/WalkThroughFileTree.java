package javarush.collections;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

import static javarush.collections.FileUtils.isExist;
import static javarush.collections.FileUtils.renameFile;

/*
Проход по дереву файлов
*/

public class WalkThroughFileTree {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        String resultFileAbsolutePath = args[1];

        File folder = new File(path);
        File resultFile = new File(resultFileAbsolutePath);

        File allFilesContentFile = new File(resultFile.getParent() + "/" + "allFilesContent.txt");
        if (isExist(resultFile)) {
            renameFile(resultFile, allFilesContentFile);
        }

        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(allFilesContentFile)))) {
            Map<String, String> sortedMap = getMapOfFiles(folder, new TreeMap<>());

            for (Map.Entry<String, String> mapData : sortedMap.entrySet()) {
                System.out.println("Key : " + mapData.getKey() + " value : " + mapData.getValue());
            }

            for (Map.Entry<String, String> mapData : sortedMap.entrySet()) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(mapData.getValue())));

                while (reader.ready()) {
                    writer.write(reader.read());
                }
                reader.close();
                writer.write("\n");
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, String> getMapOfFiles(File dir, Map<String, String> map) {
        Map<String, String> sortedMap = map;

        if (dir.isFile() && dir.length() <= 50 && getFileExtension(dir).equals("txt")) {
            sortedMap.put(dir.getName(), dir.getAbsolutePath());
        } else if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null) {
                for (File name : list) {
                    sortedMap = getMapOfFiles(name, map);
                }
            }
        }
        return sortedMap;
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }
}

