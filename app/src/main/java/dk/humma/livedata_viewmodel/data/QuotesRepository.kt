package dk.humma.livedata_viewmodel.data

//Dependency injection makes things modular and independent of each other

class QuotesRepository private constructor(private val quoteDao:DataTable){

    fun addQuote(quote:Quotes){
        quoteDao.addQuotes(quote)
    }

    //It simply returns LivaData
    fun getQuote() = quoteDao.getQuotes()

    //QuoteRepository is the mediator between Database and ViewModel
    companion object {
        @Volatile private var instance : QuotesRepository? = null

        fun getInstance(quoteDao: DataTable) {
            instance?: synchronized(this){
                instance?: QuotesRepository(quoteDao).also { instance = it }
            }
        }
    }
}