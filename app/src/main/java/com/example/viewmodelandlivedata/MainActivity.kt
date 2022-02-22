package com.example.viewmodelandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodelandlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vb : ActivityMainBinding
    var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        vb.addScoreButton.setOnClickListener { addScore() }
        vb.resetScoreButton.setOnClickListener { resetScore() }

        resetScore()
    }

    private fun resetScore() {
        score = 0
        vb.scoreTextView.text = "$score"
    }

    private fun addScore() {
        score++
        vb.scoreTextView.text = "$score"
    }
}