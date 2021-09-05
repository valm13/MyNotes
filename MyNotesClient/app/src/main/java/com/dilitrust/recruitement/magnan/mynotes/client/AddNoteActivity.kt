package com.dilitrust.recruitement.magnan.mynotes.client

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dilitrust.recruitement.magnan.mynotes.client.model.Note
import com.dilitrust.recruitement.magnan.mynotes.client.model.NoteForm
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity() {
    private val TAG = "AddNoteActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        button_save_note.setOnClickListener {
            saveNote()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, NotesActivity::class.java))
        this.finish()
    }

    private fun saveNote() {

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val noteInput = edit_text_new_note.text.toString()
        var text = "There was a problem saving your note..."
        val duration = Toast.LENGTH_SHORT
        if (noteInput.isNotEmpty()) {
            val note = NoteForm(noteInput)
            viewModel.createNote(note)
            viewModel.myResponse.observe(this, Observer {
                if ( it.isSuccessful)
                {
                    val newNote : Note? = it.body()
                    if (newNote != null) {
                        text = "New not added !"
                        Log.d(TAG, "New note added")
                        Log.d(TAG, newNote.toString())
                        Log.d(TAG, newNote.note)
                        Log.d(TAG, newNote.creation_date.toString())
                        Log.d(TAG, newNote.hash)
                    }
                }

            })
        }
        Toast.makeText(applicationContext, text, duration).show()
    }
}