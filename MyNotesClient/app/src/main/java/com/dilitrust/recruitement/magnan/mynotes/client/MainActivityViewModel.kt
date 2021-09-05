package com.dilitrust.recruitement.magnan.mynotes.client

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dilitrust.recruitement.magnan.mynotes.client.api.ApiClient
import com.dilitrust.recruitement.magnan.mynotes.client.api.ApiService
import com.dilitrust.recruitement.magnan.mynotes.client.model.Note
import com.dilitrust.recruitement.magnan.mynotes.client.model.NoteForm
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivityViewModel : ViewModel() {

    val myResponse: MutableLiveData<Response<Note>> = MutableLiveData()
    val myResponseList: MutableLiveData<Response<List<Note>>> = MutableLiveData()

    fun getNote(id:Int) {
        viewModelScope.launch {
            myResponse.value = ApiClient.apiService.getNoteById(id)
        }
    }

    fun getNotes() {
        viewModelScope.launch {
            myResponseList.value = ApiClient.apiService.getNotes()
        }
    }

    fun createNote(note:NoteForm) {
        viewModelScope.launch {
            myResponse.value = ApiClient.apiService.createNote(note)
        }
    }

}