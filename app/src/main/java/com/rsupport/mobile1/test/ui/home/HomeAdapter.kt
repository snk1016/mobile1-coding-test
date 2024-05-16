package com.rsupport.mobile1.test.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rsupport.mobile1.test.databinding.AdapterHomeItemBinding
import com.rsupport.mobile1.test.model.GettyItem

class HomeAdapter(gettyItem: MutableList<GettyItem>): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private var items: MutableList<GettyItem> = gettyItem

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            AdapterHomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        Glide.with(holder.binding.imgGetty.context).load(items[position].img).into(holder.binding.imgGetty)
        holder.binding.item = items[position]
    }

    class HomeViewHolder(var binding: AdapterHomeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}