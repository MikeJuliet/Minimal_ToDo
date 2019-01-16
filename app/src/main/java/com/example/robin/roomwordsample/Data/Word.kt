package com.example.robin.roomwordsample.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word")val word: String, @ColumnInfo(name = "time")val time: String, @ColumnInfo(name = "tag")val tag: String)