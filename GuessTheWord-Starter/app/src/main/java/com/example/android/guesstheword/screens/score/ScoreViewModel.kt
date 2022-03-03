package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalscore:Int): ViewModel() {

    var score=finalscore
    init {
        Log.i("ScoreViewModel","scoreViewModel called")
    }
}