package com.moulesh.springpractice.product.data.repository

import com.moulesh.springpractice.product.data.util.toEntityItem
import com.moulesh.springpractice.product.data.util.toProduct
import com.moulesh.springpractice.product.domain.IProductRepository
import com.moulesh.springpractice.product.domain.model.Product
import org.springframework.stereotype.Repository

@Repository
class ProductRepository(val productJpaRepository: ProductJPARepository) : IProductRepository {
    override fun getProducts(): List<Product> {
        try {
            val products = productJpaRepository.findAll()
            return products.map { it.toProduct() }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return listOf()
    }

    override fun addProduct(product: Product) {
        try {
            productJpaRepository.save(product.toEntityItem())
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}