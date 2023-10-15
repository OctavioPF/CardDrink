package com.octaviopf.carddrink.ui.players.adapter

import com.octaviopf.carddrink.databinding.ItemPlayersBinding
import com.octaviopf.carddrink.domain.model.PlayersInfo
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class PlayersViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemPlayersBinding.bind(view)

    fun render(playersInfo: PlayersInfo, onItemSelected: (PlayersInfo) -> Unit) {
        val context = binding.LinearPlayers.context
        binding.LinearPlayers.isBaselineAligned
        binding.playersButton.text
    }
}