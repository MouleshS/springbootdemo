package com.moulesh.springpractice.product.presentation

import com.moulesh.springpractice.product.domain.ProductService
import com.moulesh.springpractice.product.domain.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController @Autowired constructor(var productService: ProductService) {

    @GetMapping("products")
    fun getAllProducts():List<Product>{
        return productService.getProducts()
    }

    @PostMapping("product")
    fun addProduct(@RequestBody product: Product){
        return productService.addProduct(product)
    }
}