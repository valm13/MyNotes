package com.dilitrust.recruitement.magnan.mynotes.client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dilitrust.recruitement.magnan.mynotes.client.R
import com.dilitrust.recruitement.magnan.mynotes.client.model.Note
import kotlinx.android.synthetic.main.row_layout.view.*

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.MyViewHolder>() {

    private var myList = emptyList<Note>()
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.txt_note.text = myList[position].note
        holder.itemView.txt_noteCreationDate.text = myList[position].creation_date
        holder.itemView.txt_noteId.text = myList[position].id.toString()
//        holder.itemView.txt_noteHash.text = myList[position].hash
    }

    fun setData(newList: List<Note>){
        myList = newList
        notifyDataSetChanged()
    }
}