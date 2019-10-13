package pl.arturborowy.vvmpim.data

interface AddressRepository {

    suspend fun getCity(): String

    suspend fun getStreet(): String

    suspend fun getPostalCode(): String

    suspend fun getBuildingNo(): Int

    suspend fun getApartmentNo(): Int

    suspend fun setCity(city: String)

    suspend fun setStreet(street: String)

    suspend fun setPostalCode(postalCode: String)

    suspend fun setBuildingNo(buildingNo: Int)

    suspend fun setApartmentNo(apartmentNo: Int)
}