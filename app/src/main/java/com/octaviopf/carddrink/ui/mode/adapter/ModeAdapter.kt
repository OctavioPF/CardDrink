package com.octaviopf.carddrink.ui.mode.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.octaviopf.carddrink.R
import com.octaviopf.carddrink.domain.model.ModeInfo

class ModeAdapter(private var modeList: List<ModeInfo> = emptyList()) :
    RecyclerView.Adapter<ModeViewHolder>() {
    fun updateList(list: List<ModeInfo>) {

        modeList = list
        notifyDataSetChanged()

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModeViewHolder {
        return ModeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_mode, parent, false)
        )
    }

    override fun getItemCount() = modeList.size

    override fun onBindViewHolder(holder: ModeViewHolder, position: Int) {
        holder.render(modeList[position])
    }

}