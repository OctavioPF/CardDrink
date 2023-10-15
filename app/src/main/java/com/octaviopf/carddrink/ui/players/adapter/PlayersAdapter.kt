package com.octaviopf.carddrink.ui.players.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.octaviopf.carddrink.R
import com.octaviopf.carddrink.domain.model.PlayersInfo

class PlayersAdapter (private var playersList: List<PlayersInfo> = emptyList(),
                      private val onItemSelected:(PlayersInfo) -> Unit) :
    RecyclerView.Adapter<PlayersViewHolder>() {

    fun updateList(list:List<PlayersInfo>){
        playersList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        return PlayersViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_players, parent, false)
        )
    }

    override fun getItemCount() = playersList.size

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        holder.render(playersList[position], onItemSelected)
    }
}