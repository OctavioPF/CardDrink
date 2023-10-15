package com.octaviopf.carddrink.ui.players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.octaviopf.carddrink.databinding.FragmentModeBinding
import com.octaviopf.carddrink.databinding.FragmentPlayersBinding
import com.octaviopf.carddrink.ui.mode.adapter.ModeAdapter
import com.octaviopf.carddrink.ui.players.adapter.PlayersAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PlayersFragment : Fragment() {

    private val playersViewModel by viewModels<PlayersViewModel>()
    private lateinit var playersAdapter: PlayersAdapter

    private var _binding: FragmentPlayersBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initList() {

    }
    }
    private fun initUIState() {

    }

