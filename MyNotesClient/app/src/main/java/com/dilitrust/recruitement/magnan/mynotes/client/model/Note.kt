package com.dilitrust.recruitement.magnan.mynotes.client.model

import java.time.Instant

data class Note(
    val id: Int,
    val note: String,
    val hash: String,
    val creation_date: String
)
