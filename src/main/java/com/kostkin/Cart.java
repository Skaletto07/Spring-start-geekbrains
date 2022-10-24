package com.kostkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Cart {
    private final ProductRepository productRepository;
    private final List<Product> cartOfProduct;

    @Autowired
    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.cartOfProduct = new ArrayList<>();
    }

    public void addNewProductToCart(int id) {
        Product oneProductById = productRepository.getOneProductById(id);
        cartOfProduct.add(oneProductById);
    }

    public void deleteProductFromCart(int id) {
        Product oneProductById = productRepository.getOneProductById(id);
        cartOfProduct.remove(oneProductById);
    }

    public List<Product> getCartOfProduct() {
        return cartOfProduct;
    }
}
