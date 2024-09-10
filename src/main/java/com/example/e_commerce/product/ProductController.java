package com.example.e_commerce.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/e-commerce/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping(value = "/addProduct")
    private Boolean addProduct(@RequestBody ProductDTO productDTO)
    {
        return productService.addProduct(productDTO);
    }

    @PutMapping(value = "/updateProduct")
    private Boolean updateProduct(@RequestBody ProductDTO productDTO)
    {
        return productService.updateProduct(productDTO);
    }
    @GetMapping(value = "/getProductDetailsByCategeryAndPrice")
    private List<ProductDTO> getListofProducts(@RequestBody ProductDTO productDTO){

        return productService.getListOfProduct(productDTO);
    }
    @GetMapping(value="/loadAllProducts")
    private List<ProductDTO> getAllProductList(){
        
        return productService.loadAllProduct();
    }
    

}
