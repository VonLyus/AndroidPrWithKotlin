package com.example.advanceparty

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter (private val context: Context) : RecyclerView.Adapter<ToDoAdapter.ViewHolder>() {

    var datas = mutableListOf<ListSetData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.todo_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val ToDoName: TextView = itemView.findViewById(R.id.td_)

        fun bind(item: ListSetData) {
            ToDoName.text = item.name

        }
    }


}