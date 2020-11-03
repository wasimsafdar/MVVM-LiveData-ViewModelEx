package dk.humma.livedata_viewmodel.data

data class Quotes(val quoteText:String, val author: String) {

    override fun toString(): String {
        return "$quoteText -$author"
    }
}