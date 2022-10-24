package com.kostkin;

public class Product {
    private final int id;
    private final String Name;
    private final int price;

    public Product(int id, String name, int price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}
