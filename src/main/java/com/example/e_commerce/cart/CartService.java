package com.example.e_commerce.cart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.e_commerce.entities.Cart;
@Service
public class CartService{

	@Autowired
	private CartRepositry cartRepositry;
    public Boolean addItemToCart(CartDTO cartDTO) {
       
        Cart cart=new Cart();
        cart.setNumberofItem(cartDTO.getNumberofItems());
        cart.setProductName(cartDTO.getProductName());
        Cart save = cartRepositry.save(cart);
        if (save!=null) {
			return true;
		}
        return false;
        
        
    }

    public Boolean updateCartItem(CartDTO cartDTO) {
      
        throw new UnsupportedOperationException("Unimplemented method 'updateCartItem'");
    }

    public Boolean removeItem(CartDTO cartDTO) {
        
        throw new UnsupportedOperationException("Unimplemented method 'removeItem'");
    }

    public List<CartDTO> returnAllCartItems() {
       List<CartDTO> cartDTOs=new ArrayList<CartDTO>();
        List<Cart> all = cartRepositry.findAll();
        all.stream().forEach(temp->{
        	CartDTO cartDTO=new CartDTO();
        	cartDTO.setNumberofItems(temp.getNumberofItem());
        	cartDTO.setProductName(temp.getProductName());
        	cartDTOs.add(cartDTO);
        });
        return cartDTOs;
    }
    
}