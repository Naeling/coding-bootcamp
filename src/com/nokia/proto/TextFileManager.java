package com.nokia.proto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFileManager {

    public TextFileManager(){}

    static public boolean appendLineToFile(String text) {
        try {
            Files.write(Paths.get("C:\\Users\\groisne\\Documents\\Nokia\\TODO\\Coding rules\\Faisability\\test.txt"), text.getBytes(), StandardOpenOption.APPEND);
            return true;
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    static public boolean writeTextInFile(String text) {
        List<String> lines = Arrays.asList(text);
        Path file = Paths.get("C:\\Users\\groisne\\Documents\\Nokia\\TODO\\Coding rules\\Faisability\\test.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
            return true;
        } catch(java.io.IOException e){
            e.printStackTrace();
            return false;
        }
    }

    static public String readOneLineFromFile() {
        String line = "";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\groisne\\Documents\\Nokia\\TODO\\Coding rules\\Faisability\\test.txt"));
            line = reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return line;
    }

    static public List<String> readAllLines() {
        List<String> allLines = new ArrayList<>();
        Path file = Paths.get("C:\\Users\\groisne\\Documents\\Nokia\\TODO\\Coding rules\\Faisability\\test.txt");
        try{
            allLines = Files.readAllLines(file, Charset.forName("UTF-8"));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return allLines;
    }
}
