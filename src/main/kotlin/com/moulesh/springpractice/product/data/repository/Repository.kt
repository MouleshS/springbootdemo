package com.moulesh.springpractice.product.data.repository

import com.moulesh.springpractice.product.data.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductJPARepository: JpaRepository<ProductEntity, Int> {
}