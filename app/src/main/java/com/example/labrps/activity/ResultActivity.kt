package com.example.labrps.activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.labrps.R
import com.example.labrps.enums.Variant
import com.example.labrps.utils.Judge

class ResultActivity : AppCompatActivity() {
    companion object {
        const val PLAYER_VARIANT = "PlayerVariant"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        findViewById<Button>(R.id.btn_again).setOnClickListener {
            this.finish()
        }

        val playerVariant = find(
           value = intent.getIntExtra(PLAYER_VARIANT, 1)
        )

        val computerVariant = Variant.entries.random()

        findViewById<TextView>(R.id.playerVariant).text =
            playerVariant.getName(playerVariant.ordinal)

        findViewById<TextView>(R.id.computerVariant).text =
            computerVariant.getName(computerVariant.ordinal)

        val result = Judge.judge(Pair(playerVariant, computerVariant))
        findViewById<TextView>(R.id.result).text = result.getName(result.ordinal)
    }

    private fun find(value: Int): Variant {
        return Variant.entries.find { it.ordinal == value }!!
    }
}