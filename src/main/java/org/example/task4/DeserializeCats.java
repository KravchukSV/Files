package org.example.task4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeCats {
    public static void main(String[] args) {
        List<Cat> catList;

        try(
                ObjectInputStream objIntStream = new ObjectInputStream(new FileInputStream("./task4/Cat List"))
                ) {
            catList = (List<Cat>) objIntStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(catList);

    }

}
