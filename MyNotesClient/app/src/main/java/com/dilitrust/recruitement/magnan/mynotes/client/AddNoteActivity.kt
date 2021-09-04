package com.dilitrust.recruitement.magnan.mynotes.client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        button_save_note.setOnClickListener { saveNote() }
    }

    fun saveNote() {
        val text = edit_text_new_note.text
        print(text)
    }
}