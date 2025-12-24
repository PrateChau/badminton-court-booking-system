package com.badminton.booking.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "court_time_blocks")
data class CourtTimeBlock(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne
    @JoinColumn(name = "court_id", nullable = false)
    val court: Court,

    @Column(nullable = false)
    val date: String,

    @Column(nullable = false)
    val startTime: String,

    @Column(nullable = false)
    val endTime: String
)