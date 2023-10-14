package com.octaviopf.carddrink.ui.card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.octaviopf.carddrink.R
import com.octaviopf.carddrink.databinding.FragmentCardBinding
import com.octaviopf.carddrink.databinding.FragmentPlayersBinding

class CardFragment : Fragment() {

    private var _binding: FragmentCardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}