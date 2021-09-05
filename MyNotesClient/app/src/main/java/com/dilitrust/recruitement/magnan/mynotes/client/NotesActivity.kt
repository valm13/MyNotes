package com.dilitrust.recruitement.magnan.mynotes.client

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dilitrust.recruitement.magnan.mynotes.client.adapter.NoteAdapter
import kotlinx.android.synthetic.main.activity_notes.*

class NotesActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private val noteAdapter by lazy { NoteAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        setSupportActionBar(findViewById(R.id.toolbar))
        fab.setOnClickListener {
            startActivity(Intent(this, AddNoteActivity::class.java))
            this.finish()
        }
        setupRecyclerview()
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getNotes()
        viewModel.myResponseList.observe(this, Observer { response ->
            if (response.isSuccessful) {
                response.body()?.let { noteAdapter.setData(it) }
            } else {
                Toast.makeText(this,response.code(),Toast.LENGTH_SHORT).show()
            }
        })
    }


    private fun setupRecyclerview() {
        recyclerNotes.adapter = noteAdapter
        recyclerNotes.layoutManager = LinearLayoutManager(this)
    }


}