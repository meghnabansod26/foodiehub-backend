package com.meghna.foodiehub.service;


import com.meghna.foodiehub.entity.CartEntity;
import com.meghna.foodiehub.io.CartRequest;
import com.meghna.foodiehub.io.CartResponse;

public interface CartService {



    CartResponse addToCart(CartRequest request);
    CartResponse getCart();
    void clearCart();
    CartResponse removeFromCart(CartRequest cartRequest);


}
