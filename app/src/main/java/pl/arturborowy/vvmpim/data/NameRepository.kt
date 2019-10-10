package pl.arturborowy.vvmpim.data

interface NameRepository {

    suspend fun getFirstName(): String

    suspend fun getMiddleName(): String

    suspend fun getLastName(): String

    suspend fun setFirstName(firstName: String)

    suspend fun setMiddleName(middleName: String)

    suspend fun setLastName(lastName: String)
}