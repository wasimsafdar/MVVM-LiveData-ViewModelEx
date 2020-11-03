package dk.humma.livedata_viewmodel.data

class FakeDataBase private constructor(){

    var quoteDao = DataTable()
    private set

    companion object {
        @Volatile private var instance : FakeDataBase? = null

        fun getInstance() {
            instance?: synchronized(this){
                instance?: FakeDataBase().also { instance = it }
            }
        }
    }
}