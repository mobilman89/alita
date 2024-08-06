package org.example;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.Objects.compare;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(2, "Sugar", 22.0),
                new Product(5, "Banana", 59.0),
                new Product(4, "Coffee", 45.0),
                new Product(1, "Pasta", 10.0),
                new Product(3, "Chicken", 31.0)
        );

//        1. Find the most expensive product
//        2. Calculate the average price of all products
//        3. Create a sublist with products where the price is less than 30.

        Product MaxProduct = products.stream().max(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(MaxProduct.getName());
        double averagePrice = products.stream().collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println(averagePrice);
        List<Product> products1 = products.stream().filter(e -> e.getPrice() < 30).collect(Collectors.toList());
        products1.forEach(System.out::println);
    }
}