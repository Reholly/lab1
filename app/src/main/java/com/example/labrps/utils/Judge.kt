package com.example.labrps.utils

import com.example.labrps.enums.Result
import com.example.labrps.enums.Variant

// first = player, second - computer
public object Judge {
    fun judge(choices: Pair<Variant, Variant>): Result {
        val values = Variant.entries.toTypedArray()
        val first = values.first()
        val last = values.last()

        return if (choices.first == last && choices.second == first) {
            Result.PlayerWin
        } else if (choices.first == first && choices.second == last){
            Result.ComputerWin
        } else if (choices.first < choices.second){
            Result.PlayerWin
        } else if (choices.first == choices.second) {
            Result.Draw
        } else {
            Result.ComputerWin
        }
    }
}