package com.moulesh.springpractice.product.data

import com.moulesh.springpractice.product.data.util.ImagesConvertor
import jakarta.persistence.*

@Entity
@Table(name = "products")
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generated ID
    val id: Int,
    val title: String,
    val price: Double,
    @Column(nullable = false, length = 2000)
    val description: String,
    @Convert(converter = ImagesConvertor::class)
    @Column(nullable = false, length = 2000)
    val images: List<String>,
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "category_id")
    val category: CategoryEntity,
){
    // Default constructor required for JPA
    constructor() : this(0, "", 0.0, "", emptyList(), CategoryEntity(0, "", ""))
}