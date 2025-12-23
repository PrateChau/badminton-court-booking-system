package com.badminton.booking.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "courts")
data class Court(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val courtNumber: Int,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    val location: CourtLocation,

    @Column(nullable = false)
    val isActive: Boolean = true,

    @OneToMany(mappedBy = "court", cascade = [CascadeType.ALL])
    val bookings: MutableList<Booking> = mutableListOf(),

    @Column(nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
)
