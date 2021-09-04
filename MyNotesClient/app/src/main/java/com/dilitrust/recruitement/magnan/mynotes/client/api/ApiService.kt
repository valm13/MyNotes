package com.dilitrust.recruitement.magnan.mynotes.client.api

import com.dilitrust.recruitement.magnan.mynotes.client.model.Note
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("note/retrieve")
    suspend fun getNotes(): MutableList<Note>

    @GET("note/retrieve/{id}")
    suspend fun getNoteById(@Path("id") id: Int): Note

    @POST("note/store")
    suspend fun createNote(@Body note: String): Note
}