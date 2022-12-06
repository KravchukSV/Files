package org.example.task4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeCats {
    public static void main(String[] args) {
        List<Cat> catList = null;

        try(
                ObjectInputStream objIntStream = new ObjectInputStream(new FileInputStream("./task4/Cat List"))
                ) {
            catList = (List<Cat>) objIntStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(catList);

    }

}
