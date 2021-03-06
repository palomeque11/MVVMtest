package com.example.roomwordsample.view

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.roomwordsample.model.room.entities.Word

class WordListAdapter : ListAdapter<Word, WordViewHolder>(WordsComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        return WordViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.word)
    }
}