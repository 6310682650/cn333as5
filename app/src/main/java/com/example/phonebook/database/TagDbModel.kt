package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "tagtype") val tagtype: String,
) {
    companion object {
        val DEFAULT_Tag = listOf(
            TagDbModel(1, "Mobile"),
            TagDbModel(2, "Home"),
            TagDbModel(3, "Work"),
            TagDbModel(4, "Other"),
        )
        val DEFAULT_TAG = DEFAULT_Tag[0]
    }
}