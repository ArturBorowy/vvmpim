package pl.arturborowy.vvmpim.data

interface NameRepository {

    suspend fun getFirstName(): String

    suspend fun getMiddleName(): String

    suspend fun getLastName(): String
}