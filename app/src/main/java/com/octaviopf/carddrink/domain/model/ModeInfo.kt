package com.octaviopf.carddrink.domain.model

import com.octaviopf.carddrink.R

sealed class ModeInfo (val img:Int, val name:Int){
    object Modo1:ModeInfo(R.drawable.ic_star, R.string.Modo1)
    object Modo2:ModeInfo(R.drawable.ic_mode0, R.string.Modo2)
    object Modo3:ModeInfo(R.drawable.ic_mode0, R.string.Modo3)
    object Modo4:ModeInfo(R.drawable.ic_mode0, R.string.Modo4)


}