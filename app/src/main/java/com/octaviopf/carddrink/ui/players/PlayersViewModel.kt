package com.octaviopf.carddrink.ui.players

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

sealed class PlayersViewModel(val img:Int, val Name:Int)  {

}