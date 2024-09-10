package com.example.e_commerce.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/e-commerce/cart")
public class CartController {
    
    @Autowired
    private CartService cartService;

    @PostMapping(value = "/addItem")
    private Boolean addItemToCart(@RequestBody CartDTO cartDTO){

        return cartService.addItemToCart(cartDTO);
    }

    @PutMapping(value = "/updateCartItem")
    private Boolean updateCartItem(@RequestBody CartDTO cartDTO){

        return cartService.updateCartItem(cartDTO);
    }

    @DeleteMapping(value = "removeItem")
    private Boolean removeItem(@RequestBody CartDTO cartDTO){

        return cartService.removeItem(cartDTO);
    }

    @GetMapping(value = "/returnAllCartItem")
    private List<CartDTO> returnAllCartItems(){
        
        return cartService.returnAllCartItems();
    }
}
