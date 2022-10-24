package com.kostkin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Config {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.kostkin");
        Cart cart = context.getBean(Cart.class);
        cart.addNewProductToCart(2);
        cart.addNewProductToCart(3);
        cart.addNewProductToCart(1);
        System.out.println("cart.getCartOfProduct() = " + cart.getCartOfProduct());
        System.out.println("cart = " + cart);
        Cart cart1 = context.getBean(Cart.class);
        cart1.addNewProductToCart(5);
        System.out.println("cart1.getCartOfProduct() = " + cart1.getCartOfProduct());
        System.out.println("cart1 = " + cart1);
        context.close();
    }
}
