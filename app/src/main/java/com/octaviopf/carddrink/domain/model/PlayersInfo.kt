package com.octaviopf.carddrink.domain.model


import android.os.Handler
import java.util.*

sealed class PlayerInfo(val playerName: String) {
    class Player1(playerName: String) : PlayerInfo(playerName)
    class Player2(playerName: String) : PlayerInfo(playerName)
    class Player3(playerName: String) : PlayerInfo(playerName)
    // Agrega más clases según sea necesario

    companion object {
        private var playerNames: MutableList<String> = mutableListOf()

        init {
            updateList()
        }

        fun updateList() {
            val random = Random()
            val alphabet = ('A'..'Z' )
            val newName = StringBuilder()
            for (i in 0 until 5) {
                newName.append(alphabet.elementAt(random.nextInt(alphabet.count())))
            }
            playerNames.add(newName.toString())
            scheduleNextUpdate()
        }

        private fun scheduleNextUpdate() {
            val handler = Handler()
            val runnable = object : Runnable {
                override fun run() {
                    updateList()
                    handler.postDelayed(this, 3000) // 3000 milliseconds = 3 seconds
                }
            }
            handler.postDelayed(runnable, 3000) // 3000 milliseconds = 3 seconds
        }
    }

}

