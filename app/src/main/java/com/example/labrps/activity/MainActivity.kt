package com.example.labrps.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.labrps.R
import com.example.labrps.enums.Variant


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_paper).setOnClickListener {
            setHandler(Variant.Paper)
        }

        findViewById<Button>(R.id.btn_rock).setOnClickListener {
            setHandler(Variant.Rock)
        }

        findViewById<Button>(R.id.btn_scissors).setOnClickListener {
            setHandler(Variant.Scissor)
        }
    }

    private fun setHandler(variant: Variant) {
        with(Intent(this, ResultActivity::class.java)) {
            putExtra(ResultActivity.PLAYER_VARIANT, variant.ordinal)
            startActivity(this)
        }
    }
}
