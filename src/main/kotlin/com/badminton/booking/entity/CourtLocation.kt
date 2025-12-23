package com.badminton.booking.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "locations")
data class CourtLocation (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    val locationName: String,
    @Column(nullable = false)
    val courtName: String,
    @Column(nullable = false)
    val adminMobileNumber: String,
    @Column(nullable = false)
    val totalCourts: Int,
    @OneToMany(mappedBy = "location", cascade = [CascadeType.ALL], orphanRemoval = true)
    val courts: MutableList<Court> = mutableListOf(),
    @Column(nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()


)

