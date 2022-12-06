package org.example.task3;

import java.io.*;

public class TestFileReader {
    public static void main(String[] args) {
       String[] names = readFile();
       printNames(names);
    }

    public static String[] readFile(){
        //в даному методі отримуємо список імен із файлу, який був записаний у завданні 2
        File file = new File("./task2/list name(FileWriter).txt");
        String result = "";

        try(FileReader fileReader = new FileReader(file)){
            int c;
            while ((c = fileReader.read()) != -1){
                result += (char)c;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.split(" ");
    }

    public static void printNames(String[] names){
        for(String name : names){
            System.out.println(name);
        }
    }
}
