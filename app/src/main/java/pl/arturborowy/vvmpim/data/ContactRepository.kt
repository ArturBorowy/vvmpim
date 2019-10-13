package pl.arturborowy.vvmpim.data

interface ContactRepository {

    suspend fun getEmail(): String

    suspend fun getPhone(): Int

    suspend fun setEmail(email: String)

    suspend fun setPhone(phone: Int)
}