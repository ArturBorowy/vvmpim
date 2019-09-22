package pl.arturborowy.vvmpim.data

interface ContactRepository {

    suspend fun getEmail(): String

    suspend fun getPhone(): Int
}