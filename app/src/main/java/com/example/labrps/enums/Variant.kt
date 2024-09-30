package com.example.labrps.enums

enum class Variant(value: Int) {
    Paper(0),
    Rock(1),
    Scissor(2);

    fun getName(ordinal: Int) =
        when (ordinal) {
            Paper.ordinal -> "Газетка"
            Rock.ordinal -> "Каменюшка"
            Scissor.ordinal -> "Ножницулька"
            else -> "Чет какая-то белеберда!"
    }
}
