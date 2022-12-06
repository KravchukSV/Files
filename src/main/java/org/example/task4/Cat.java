package org.example.task4;

import java.io.Serializable;

public class Cat implements Serializable{
     private String name;
    private String bread;
    private double weight;

    public Cat(String name, String bread, double weight) {
        this.name = name;
        this.bread = bread;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", weight=" + weight +
                '}';
    }
}
