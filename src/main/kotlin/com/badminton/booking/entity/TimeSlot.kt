package com.badminton.booking.entity

import java.time.LocalTime

data class TimeSlot(
    val startTime: LocalTime,
    val endTime: LocalTime,
    val isAvailable: Boolean
)
