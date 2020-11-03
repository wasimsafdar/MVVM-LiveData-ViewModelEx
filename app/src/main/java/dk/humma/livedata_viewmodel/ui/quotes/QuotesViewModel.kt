package dk.humma.livedata_viewmodel.ui.quotes

import androidx.lifecycle.ViewModel
import dk.humma.livedata_viewmodel.data.Quotes
import dk.humma.livedata_viewmodel.data.QuotesRepository

class QuotesViewModel(private val quoteRespository: QuotesRepository):ViewModel() {

    fun getQuotes() = quoteRespository.getQuote()
    fun addQuotes(quote:Quotes) = quoteRespository.addQuote(quote)

}