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

class PlayersFragment : Fragment() {

    private lateinit var playersAdapter: ModeAdapter

    private var _binding: FragmentModeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}