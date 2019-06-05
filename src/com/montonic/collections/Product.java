package com.montonic.collections;

public class Product {

    private final String name;

    private final int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product {" +
            "name = '"+ name + "'" +
                ", weight = " + weight +
            "}";
    }


}
