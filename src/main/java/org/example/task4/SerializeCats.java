package org.example.task4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeCats {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Meow", "Aegean", 2));
        catList.add(new Cat("Sabash", "Korat", 1.5));
        catList.add(new Cat("Murchik", "Burmilla", 3.3));

        try(
                ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("./task4/Cat List"))
                ){
            objOutStream.writeObject(catList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
