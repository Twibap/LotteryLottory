package io.github.twibap.lottory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.twibap.lottory.lottery.Ball
import io.github.twibap.lottory.lottery.Lottery

class MainViewModel : ViewModel() {
    var list: List<Lottery> = ArrayList()
    var game: MutableLiveData<Lottery> = MutableLiveData()

    fun getBall(): LiveData<Lottery>{
        return this.game
    }

    fun setNewGame(game: Lottery) {
        this.game.postValue(game);
    }
}