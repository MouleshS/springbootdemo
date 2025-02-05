package com.moulesh.springpractice.product.domain

import com.moulesh.springpractice.product.data.repository.ProductRepository
import com.moulesh.springpractice.product.domain.model.Product
import org.springframework.stereotype.Service

@Service
class ProductService(val productRepository: ProductRepository) {
    fun getProducts(): List<Product> {
        return productRepository.getProducts()
    }

    fun addProduct(product: Product) {
        productRepository.addProduct(product)
    }
}