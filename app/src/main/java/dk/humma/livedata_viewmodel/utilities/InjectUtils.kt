package dk.humma.livedata_viewmodel.utilities

import dk.humma.livedata_viewmodel.data.FakeDataBase
import dk.humma.livedata_viewmodel.data.QuotesRepository
import dk.humma.livedata_viewmodel.ui.quotes.QuotesViewModelFactory

// Finally a singleton which doesn't need anything passed to the constructor
object InjectorUtils {
    // This will be called from QuotesActivity
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // The whole dependency tree is constructed right here, in one place
        val quoteRepository = QuotesRepository.getInstance(FakeDataBase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}