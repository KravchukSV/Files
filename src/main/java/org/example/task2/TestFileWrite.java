package org.example.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWrite {
    public static void main(String[] args) {
        System.out.println("Введіть список імен через пробіл");
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();

        writeFile(names);
    }

    public static void writeFile(String str){
        //перезапис файлу заданим рядком
        File file = new File("./task2/list name(FileWriter).txt");
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
