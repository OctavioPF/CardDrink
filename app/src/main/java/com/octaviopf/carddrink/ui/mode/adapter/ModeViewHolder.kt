package com.octaviopf.carddrink.ui.mode.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.octaviopf.carddrink.databinding.ItemModeBinding
import com.octaviopf.carddrink.domain.model.ModeInfo

class ModeViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemModeBinding.bind(view)

    fun render(modeInfo: ModeInfo){
        val context = binding.tvTitle.context
        binding.ivMode.setImageResource(modeInfo.img)
        binding.tvTitle.text = context.getString(modeInfo.name)
    }
}