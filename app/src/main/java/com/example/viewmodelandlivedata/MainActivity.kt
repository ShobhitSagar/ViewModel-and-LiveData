package com.example.viewmodelandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelandlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vb : ActivityMainBinding
    lateinit var scoreVM: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        scoreVM = ViewModelProvider(this).get(ScoreViewModel::class.java)

        vb.scoreTextView.text = scoreVM.getScore().toString()

        vb.addScoreButton.setOnClickListener { addScore() }
        vb.resetScoreButton.setOnClickListener { resetScore() }
    }

    private fun addScore() {
        scoreVM.addScore()
        vb.scoreTextView.text = "${scoreVM.getScore()}"
    }

    private fun resetScore() {
        scoreVM.resetScore()
        vb.scoreTextView.text = "${scoreVM.getScore()}"
    }
}