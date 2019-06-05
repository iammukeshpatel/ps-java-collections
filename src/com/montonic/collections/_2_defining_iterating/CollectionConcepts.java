package com.montonic.collections._2_defining_iterating;

import com.montonic.collections.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("window", 10);

        Collection<Product> products = new ArrayList<>();

        products.add(door);
        products.add(floorPanel);
        products.add(window);

        /*
        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();

            if(product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(door));

        Collection<Product> otherProuct = new ArrayList<>();
        otherProuct.add(window);
        otherProuct.add(door);


        products.remove(window);
        System.out.println(products);

//        products.removeAll(otherProuct);
//        System.out.println(products);
        */


        for (Product product : products) {
            System.out.println(product);
        }


    }
}