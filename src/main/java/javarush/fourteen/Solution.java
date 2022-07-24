package javarush.fourteen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }
}

class Statics {
    public static String fileName = "D:/1.txt"/* add the path to your source file here */;
}