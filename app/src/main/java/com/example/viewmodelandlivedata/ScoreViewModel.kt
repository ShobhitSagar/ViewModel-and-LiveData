package com.example.viewmodelandlivedata

import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    private var score: Int = 0
    fun getScore(): Int {
        return score
    }

    fun addScore() {
        score += 1
    }

    fun resetScore() {
        score = 0
    }
}