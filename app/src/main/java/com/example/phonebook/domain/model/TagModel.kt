package com.example.phonebook.domain.model

import com.example.phonebook.database.TagDbModel
import com.example.phonebook.database.TagDbModel.Companion.DEFAULT_Tag


data class TagModel(
    val id: Long,
    val tagtype: String
) {
    companion object {
        val DEFAULT = with(TagDbModel.DEFAULT_TAG) { TagModel(id, tagtype) }
    }
}