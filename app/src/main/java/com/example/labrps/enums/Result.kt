package com.example.labrps.enums

enum class Result(value: Int) {
    PlayerWin(0),
    ComputerWin(1),
    Draw(2);

    fun getName(ordinal: Int) =
        when (ordinal) {
            PlayerWin.ordinal -> "Ты победил!"
            ComputerWin.ordinal -> "Комп победил :("
            Draw.ordinal -> "Ничья О_О"
            else -> "Чет какая-то белеберда!"
    }
}
