package com.example.sampleinsuranceapp.app.features.services

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleinsuranceapp.R

class ServicesAdapter : RecyclerView.Adapter<ServicesAdapter.MyViewHolder>() {
    class MyViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.services_rv_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 7
    }
}