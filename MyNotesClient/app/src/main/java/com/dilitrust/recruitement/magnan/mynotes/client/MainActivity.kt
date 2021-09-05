package com.dilitrust.recruitement.magnan.mynotes.client

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        button.setOnClickListener {
            startActivity(Intent(this, NotesActivity::class.java))
//            viewModel.getNote(1)
//            viewModel.myResponse.observe(this, Observer {
//                Log.d(TAG, it.id.toString())
//                Log.d(TAG, it.note)
//                Log.d(TAG, it.creation_date.toString())
//                Log.d(TAG, it.hash)
//
//            })
//
//            viewModel.getNotes()
//            viewModel.myResponseList.observe(this, Observer {
//                for (note in it) {
//                    Log.d(TAG, note.id.toString())
//                    Log.d(TAG, note.note)
//                    Log.d(TAG, note.creation_date.toString())
//                    Log.d(TAG, note.hash)
//                }
//            })
        }
    }


}