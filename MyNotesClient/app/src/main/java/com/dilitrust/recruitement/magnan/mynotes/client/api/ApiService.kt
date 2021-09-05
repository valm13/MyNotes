package com.dilitrust.recruitement.magnan.mynotes.client.api

import com.dilitrust.recruitement.magnan.mynotes.client.model.Note
import com.dilitrust.recruitement.magnan.mynotes.client.model.NoteForm
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @GET("note/retrieve")
    suspend fun getNotes(): Response<List<Note>>

    @GET("note/retrieve/{id}")
    suspend fun getNoteById(@Path("id") id: Int): Response<Note>

    @POST("note/store")
    suspend fun createNote(@Body note: NoteForm): Response<Note>
}