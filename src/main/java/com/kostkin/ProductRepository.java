package com.kostkin;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    private final List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
        products.add(new Product(1, "Melon", 25));
        products.add(new Product(2, "Apple", 5));
        products.add(new Product(3, "Watermelon", 20));
        products.add(new Product(4, "Grape", 7));
        products.add(new Product(5, "Prune", 6));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getOneProductById(long id) {
        Optional<Product> firstProduct = products.stream().filter(product -> product.getId() == id).findFirst();
        if (firstProduct.isPresent()) {
            return firstProduct.get();
        } else throw new RuntimeException("Product not found");
    }
}
