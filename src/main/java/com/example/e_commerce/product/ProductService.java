package com.example.e_commerce.product;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.e_commerce.category.CategoryRepositry;
import com.example.e_commerce.entities.Category;
import com.example.e_commerce.entities.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepositry productRepositry;

    @Autowired
    private CategoryRepositry categoryRepositry;
    
    public Boolean addProduct(ProductDTO productDTO) {
        Product newProduct=new Product();
        newProduct.setProductName(productDTO.getProductName());
        newProduct.setProductCategroy(productDTO.getCategory());
        newProduct.setProductPrice(productDTO.getPrice());
        newProduct.setStock(productDTO.getStock());
        Product save = productRepositry.save(newProduct);
        if (save!=null) {
            return true;
        }
        return false;
        

    }

    public Boolean updateProduct(ProductDTO productDTO) {
       // you do Srikanth
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    public List<ProductDTO> getListOfProduct(ProductDTO productDTO) {
        List<ProductDTO> listofProducts=new ArrayList<>();
        if (productDTO.getCategory()!=null) {
            Category byCategory = categoryRepositry.findByCategory(productDTO.getCategory());
            if (byCategory!=null) {
                List<Product> byProductCategroy = productRepositry.findByProductCategroy(byCategory.getCategory());
                if (byProductCategroy!=null) {
                    for (Product product : byProductCategroy) {
                        if (product.getStock()>0) {     
                            ProductDTO newProductDTO=new ProductDTO();
                            newProductDTO.setCategory(product.getProductCategroy());
                            newProductDTO.setProductName(product.getProductName());
                            newProductDTO.setStock(product.getStock());
                            newProductDTO.setPrice(product.getProductPrice());
                            listofProducts.add(productDTO);
                        }

                    }
                    return listofProducts;
                }
                return null;
                
            }
            return null;
        } else if(productDTO.getPrice()!=null){
            List<Product> byProductPriceGreaterThan = productRepositry.findByProductPriceLessThan(productDTO.getPrice());
            if (byProductPriceGreaterThan!=null) {
                for (Product product : byProductPriceGreaterThan) {
                    if (product.getStock()>0) {
                        ProductDTO newProductDTO=new ProductDTO();
                        newProductDTO.setCategory(product.getProductCategroy());
                        newProductDTO.setProductName(product.getProductName());
                        newProductDTO.setStock(product.getStock());
                        newProductDTO.setPrice(product.getProductPrice());
                        listofProducts.add(productDTO);
                    }
                }
                return listofProducts;
            }
        }
        return listofProducts;
    }

    public List<ProductDTO> loadAllProduct() {
        List<Product> listofProduct= productRepositry.findAll();
        List<ProductDTO> productDTOs=new ArrayList<>();
        if (listofProduct != null) {
            for (Product product : listofProduct) {
                ProductDTO productDTO=new ProductDTO();
                productDTO.setCategory(product.getProductCategroy());
                productDTO.setProductName(product.getProductName());
                productDTO.setStock(product.getStock());
                productDTO.setPrice(product.getProductPrice());
                productDTOs.add(productDTO);

            }
            return productDTOs;
        }
        return productDTOs;
    }

}
