package dk.humma.livedata_viewmodel.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData


class DataTable {
    private val quoteList = mutableListOf<Quotes>()
    private val quotes = MutableLiveData<List<Quotes>>()
    init {
        quotes.value = quoteList
    }
    fun addQuotes(quote:Quotes){
        quoteList.add(quote)
        quotes.value = quoteList
    }
    fun getQuotes() = quotes as LiveData<List<Quotes>>
}