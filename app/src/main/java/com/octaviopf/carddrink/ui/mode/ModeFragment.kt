package com.octaviopf.carddrink.ui.mode

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.octaviopf.carddrink.databinding.FragmentModeBinding
import com.octaviopf.carddrink.ui.mode.adapter.ModeAdapter
import com.octaviopf.carddrink.ui.players.PlayersViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ModeFragment : Fragment() {

    private val modeViewModel by viewModels<ModeViewModel>()
    private lateinit var modeAdapter: ModeAdapter

    private var _binding: FragmentModeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    private fun initIU(){
        initList()
        initIUState()
    }

    private fun initList(){
        modeAdapter = ModeAdapter()
        binding.rvMode.layoutManager = LinearLayoutManager(context)
        binding.rvMode.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapter

        }
    }
    private fun initIUState(){
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                modeViewModel.mode.collect{
                    // cambios en modo
                    modeAdapter.updateList(it)
                }
            }
        }
    }





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentModeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}