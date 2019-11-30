package com.devarthur.roomwordsample.data.repository

import androidx.lifecycle.LiveData
import com.devarthur.roomwordsample.data.WordDao
import com.devarthur.roomwordsample.data.entity.Word

//* Created by Arthur Gomes at 2019-11-30 16:55 - contact me at devarthur4718@gmail.com.br
// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class WordRepository(private val wordDao: WordDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}