package com.example.textview.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import com.example.textview.R

class HorAdapter(//规定泛型

        private val mContext: Context) : RecyclerView.Adapter<HorAdapter.LinearViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorAdapter.LinearViewHolder {
        return LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item, parent, false))
        //将自定义的布局文件添加进来
    }

    override fun onBindViewHolder(holder: HorAdapter.LinearViewHolder, position: Int) {
        holder.textView.text = "hello!"//列表的内容
        holder.itemView.setOnClickListener { Toast.makeText(mContext, "你真机智+$position", Toast.LENGTH_SHORT).show() }

    }

    override fun getItemCount(): Int {

        return 30//列表总长度为30
    }

    internal inner class LinearViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textView: TextView

        init {
            textView = itemView.findViewById(R.id.tv_title)
        }
    }

}
