package com.moulesh.springpractice.product.data

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "category")
@Entity
data class CategoryEntity(
    @Id
    val id: Int,
    val name: String,
    val image: String
) {
    constructor() : this(0, "", "")
}