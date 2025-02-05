package com.moulesh.springpractice.product.domain

import com.moulesh.springpractice.product.domain.model.Product

interface IProductRepository {
    fun getProducts():List<Product>
    fun addProduct(product: Product)
}