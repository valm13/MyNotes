package com.dilitrust.recruitement.magnan.mynotes.client

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dilitrust.recruitement.magnan.mynotes.client.api.ApiClient
import com.dilitrust.recruitement.magnan.mynotes.client.api.ApiService
import com.dilitrust.recruitement.magnan.mynotes.client.model.Note
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    val myResponse: MutableLiveData<Note> = MutableLiveData()
    val myResponseList: MutableLiveData<List<Note>> = MutableLiveData()

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
}