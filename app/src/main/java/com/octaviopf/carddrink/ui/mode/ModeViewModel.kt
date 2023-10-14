package com.octaviopf.carddrink.ui.mode

import androidx.lifecycle.ViewModel
import com.octaviopf.carddrink.domain.model.ModeInfo
import com.octaviopf.carddrink.domain.model.ModeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ModeViewModel @Inject constructor():ViewModel() {

    private var _mode = MutableStateFlow<List<ModeInfo>>(emptyList())
    val mode: StateFlow<List<ModeInfo>> = _mode

    init {
        _mode.value = listOf(
            Modo1, Modo2, Modo3, Modo4
        )
    }
}