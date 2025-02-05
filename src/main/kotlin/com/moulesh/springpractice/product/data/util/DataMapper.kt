package com.moulesh.springpractice.product.data.util

import com.moulesh.springpractice.product.data.CategoryEntity
import com.moulesh.springpractice.product.data.ProductEntity
import com.moulesh.springpractice.product.domain.model.Category
import com.moulesh.springpractice.product.domain.model.Product

fun Product.toEntityItem(): ProductEntity {
    val cartItemEntity =
        ProductEntity(this.id, this.title, this.price, this.description, this.images, this.category.toEntityItem())
    return cartItemEntity
}

fun ProductEntity.toProduct(): Product {
    val product =
        Product(this.id, this.title, this.price, this.description, this.images, this.category.toCategory())
    return product
}

fun Category.toEntityItem(): CategoryEntity {
    return CategoryEntity(this.id, this.name, this.image)
}

fun CategoryEntity.toCategory(): Category {
    return Category(this.id,this.name,this.image)
}



