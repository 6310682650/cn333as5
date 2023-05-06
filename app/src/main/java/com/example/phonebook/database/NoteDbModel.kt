package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
){
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "John", "081-888-8888", false, false, 1, false),
            NoteDbModel(2, "Bill", "081-111-1111", false, false, 2, false),
            NoteDbModel(3, "Pancake", "082-222-2222", false, false, 3, false),
            NoteDbModel(4, "Ran", "081-234-5678", false, false, 4, false),
            NoteDbModel(5, "Name 5", "Number 5", false, false, 5, false),
            NoteDbModel(6, "Name 6", "Number 6", false, false, 6, false),
            NoteDbModel(7, "Name 7", "Number 7", false, false, 7, false),
            NoteDbModel(8, "Name 8", "Number 8", false, false, 8, false),
            NoteDbModel(9, "Name 9", "Number 9", false, false, 9, false),
            NoteDbModel(10, "Name 10", "Number 10", false, false, 10, false),
            NoteDbModel(11, "Name 11", "Number 11", false, false, 11, false),
            NoteDbModel(12, "Name 12", "Number 12", false, false, 12, false)
        )
    }
}