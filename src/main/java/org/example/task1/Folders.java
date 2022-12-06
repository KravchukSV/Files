package org.example.task1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Folders {
    public static void main(String[] args){
        System.out.println("Введіть рядок який повинна містити назва файлу: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //стартова папка для пошуку файлів
        File file = new File("./folder1");

        List<File> fileList = new ArrayList<>();

        //фільтр для відбору даних
        FileFilter filter = (path)->path.isDirectory()||path.getName().contains(str);

        filesDir(file, fileList, filter);
        fileList.forEach(System.out::println);
    }

    static public void filesDir(File file, List<File> fileList, FileFilter filter){
        /*
        в цьому методі заповнюємо список файлів які містять вказаний рядок
        якщо це папка, то відкриваємо її
        якщо це файл, то перевіряємо на наявність заданого рядка і якщо результат позитивний
        додаємо цей файл до списку
        */
        if(file.isDirectory()){
            Arrays.asList(file.listFiles(filter))
                    .forEach(x->filesDir(x, fileList, filter));
        }
        else if(file.isFile()){
            fileList.add(file);
        }
    }
}