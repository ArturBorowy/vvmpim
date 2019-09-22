package pl.arturborowy.vvmpim.data

interface AddressRepository {

    suspend fun getCity(): String

    suspend fun getStreet(): String

    suspend fun getPostalCode(): String

    suspend fun getBuildingNo(): Int

    suspend fun getApartmentNo(): Int
}