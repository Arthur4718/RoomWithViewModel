package com.devarthur.roomwordsample.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//* Created by Arthur Gomes at 2019-11-30 16:32 - contact me at devarthur4718@gmail.com.br

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word : String)